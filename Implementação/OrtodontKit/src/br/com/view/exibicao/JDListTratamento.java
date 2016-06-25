
package br.com.view.exibicao;

import br.com.DAO.DAOTratamento;
import br.com.model.TratamentoFilter;
import br.com.model.bd.Tratamento;
import br.com.model.tables.ModelTabelaListTratamento;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class JDListTratamento extends javax.swing.JDialog {
    private DAOTratamento daoTratamento;    
    private List<TratamentoFilter> tratamentos;   
    private ModelTabelaListTratamento model;
    public volatile boolean isClosed;
    public volatile boolean isAborted;
    public Tratamento selecionado;
    
    public JDListTratamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        daoTratamento=new DAOTratamento();
        List<Tratamento> tratamentosR=daoTratamento.listAll();
        for(Tratamento t:tratamentosR){
            tratamentos.add(this.contertTratamentoToTratamentoFilter(t));
        }      
        model=new ModelTabelaListTratamento();
        jTBTratamentos.setModel(model);
        model.addAll(tratamentos);        
        addListeners();
    }
    
    private TratamentoFilter contertTratamentoToTratamentoFilter(Tratamento t){
        TratamentoFilter tf = new TratamentoFilter();
        tf.setAno(t.getDataInicioAno());
        tf.setMes(t.getDataInicioMes());
        tf.setDia(t.getDataInicioDia());
        tf.setCliente(t.getIdCliente());
        tf.setClienteId(t.getIdCliente().getId());
        tf.setClienteNome(t.getIdCliente().getNome());
        tf.setClienteTelefoneCel(t.getIdCliente().getTelcelular1());
        tf.setClienteTelefoneFixo(t.getIdCliente().getTelfixo1());
        tf.setData(tf.getDia()+"/"+tf.getMes()+"/"+tf.getAno());
        tf.setId(t.getId());
        tf.setNrProtocolo(t.getNrProtocolo());
        tf.setTratamento(t);
        tf.setValorCombinadoPecas(t.getValorCombinadoPecas());
        tf.setValorCombinadoTratamento(t.getValorCombinadoTratamento());
        return tf;
    }
    
    private void fechar(){
        if(this.selecionado!=null){
            this.isClosed=true;
            this.isAborted=false;
            this.dispose();
        }else if(this.isAborted==true){
            this.dispose();            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente");
        }
    }
    
    void addListeners(){
        this.addWindowListener( new WindowListener(){
            public void windowClosing( WindowEvent e ){
                isAborted=true;
                fechar();
            }
            public void windowClosed( WindowEvent e ){
            //    fechar();
            }

            @Override
            public void windowOpened(WindowEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
            //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jTFPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBTratamentos = new javax.swing.JTable();
        jBSelecionar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTFPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFPesquisaFocusLost(evt);
            }
        });
        jTFPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFPesquisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFPesquisaKeyReleased(evt);
            }
        });

        jTBTratamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTBTratamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBTratamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTBTratamentos);

        jBSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/ok16_12.png"))); // NOI18N
        jBSelecionar.setText("Selecionar");
        jBSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFPesquisa)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSelecionar)
                .addGap(21, 21, 21))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSelecionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarActionPerformed
        fechar();
        
    }//GEN-LAST:event_jBSelecionarActionPerformed

    private void jTBTratamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBTratamentosMouseClicked
        try {
            int linhaSelecionada = jTBTratamentos.convertRowIndexToModel(jTBTratamentos.getSelectedRow());
            TratamentoFilter selecionadoF = model.getValue(linhaSelecionada);
            selecionado=selecionadoF.getTratamento();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTBTratamentosMouseClicked

    private void jTFPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisaKeyPressed
        
    }//GEN-LAST:event_jTFPesquisaKeyPressed

    private void jTFPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisaKeyReleased
        try {                
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
            jTBTratamentos.setRowSorter(sorter);
            if (jTFPesquisa.getText().equals("")) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + jTFPesquisa.getText(), 0));
            }
        } catch (Exception e) {
            e.printStackTrace();                
        }                
    }//GEN-LAST:event_jTFPesquisaKeyReleased

    private void jTFPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFPesquisaFocusLost
        
    }//GEN-LAST:event_jTFPesquisaFocusLost

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBTratamentos;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
