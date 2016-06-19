package br.com.model.tables;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 * @param <T>
 */
public abstract class UsualTableModel<T> extends AbstractTableModel implements TableModel {

    public List<T> lista = new ArrayList<>();
    public Class clazz;
    public String[] colunas = new String[]{};
    protected Map<Integer, Field> _FIELDS = new HashMap<>();
    

    public UsualTableModel() {
        this.clazz = (Class) ((ParameterizedType) getClass().asSubclass(getClass()).getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public UsualTableModel(String... colunas) {
        this.clazz = (Class) ((ParameterizedType) getClass().asSubclass(getClass()).getGenericSuperclass()).getActualTypeArguments()[0];
        this.colunas = new String[colunas.length];
        int i = 0;
        for (String c : colunas) {
            this.colunas[i++] = c;
        }
    }

    public UsualTableModel(List<T> lista) {
        this.lista = lista;
        this.clazz = (Class) ((ParameterizedType) getClass().asSubclass(getClass()).getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public UsualTableModel(List<T> lista, Class clazz) {
        this.lista = lista;
        this.clazz = clazz;
    }

    public List<?> getLista() {
        return this.lista;
    }

    public String[] getColunas() {
        return this.colunas;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        T t = getValue(rowIndex);
        try {
            Field f = getField(clazz, columnIndex);
            return f.get(t);
        } catch (Exception e) {
            throw new IndexOutOfBoundsException("Erro ao recuperar valor do campo: " + e.getMessage());
        }       
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        try {
            T t = getValue(rowIndex);
            Field f = getField(clazz, columnIndex);
            f.set(t, aValue);
            if (t != null && rowIndex >= 0) {
                getData().set(rowIndex, t);
            }
            fireTableDataChanged();
        } catch (Exception e) {
            throw new IndexOutOfBoundsException("Erro ao gravar valor no campo: " + e.getMessage());
        }
    };

    public Field getField(T t, int columnIndex) throws NoSuchFieldException {
        Field f = _FIELDS.get(columnIndex);
        if (f == null) {
            f = t.getClass().getDeclaredField(this.colunas[columnIndex].split("=")[0]);
            f.setAccessible(true);
            _FIELDS.put(columnIndex, f);
        }
        return f;
    }

    public Field getField(Class clazz, int columnIndex) throws NoSuchFieldException {
        Field f = _FIELDS.get(columnIndex);
        if (f == null) {
            f = clazz.getDeclaredField(this.colunas[columnIndex].split("=")[0]);
            f.setAccessible(true);
            _FIELDS.put(columnIndex, f);                     
        }
        return f;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        try {
            Field f = getField(clazz, columnIndex);
            if ("boolean".equals(f.getType().getName())) {
                return java.lang.Boolean.class;
            }
            if ("double".equals(f.getType().getName())) {
                return java.lang.Double.class;
            }
            if ("int".equals(f.getType().getName())) {
                return java.lang.Integer.class;
            }
            if ("char".equals(f.getType().getName())) {
                return java.lang.String.class;
            }
            return f.getType();
        } catch (NoSuchFieldException ex) {
        }
        return String.class;
    }

    @Override
    public String getColumnName(int columnIndex) {
        try {
            return colunas[columnIndex].split("=")[1];
        } catch (Exception ex) {
            return colunas[columnIndex];
        }
    }
    ;
    
    public T getValue(int row) {
        return lista.get(row);
    }

    public void add(T obj) {
        lista.add(obj);
        fireTableDataChanged();
        try {
            fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
        } catch (Exception e) {
        }
    }

    public void clean() {
        lista = new ArrayList<T>();
        fireTableDataChanged();
    }

    public void setData(List<T> data) {
        this.lista = data;
        fireTableDataChanged();
        try {
            fireTableRowsInserted(data.size() - 1, data.size() - 1);
        } catch (Exception e) {
        }
    }

    public void remove(int row) {
        lista.remove(row);
        fireTableDataChanged();
        try {
            fireTableRowsDeleted(row, row);
        } catch (Exception e) {
        }
    }

    public List<T> getData() {
        return new ArrayList<T>(lista);
    }

    public void remove(int idx[]) {
        for (int i : idx) {
            remove(i);
            try {
                fireTableRowsDeleted(i, i);
            } catch (Exception e) {
            }
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void remove(List<T> objs) {
        for (T t : objs) {
            remove(indexOf(t));
        }
    }

    public void remove(T obj) {
        remove(indexOf(obj));
    }

    public void addAll(Collection<T> coll) {
        for (T t : coll) {
            add(t);
        }
    }

    public List<T> getList(int idx[]) {
        List<T> list = new ArrayList<T>();
        int size = idx.length;
        for (int j = 0; j < size; j++) {
            list.add(getValue(idx[j]));
        }

        return list;
    }

    public int indexOf(T obj) {
        return lista.indexOf(obj);
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

   
}
