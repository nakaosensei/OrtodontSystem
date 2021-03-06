
package br.com.view;


import br.com.controller.DAO.DAOEvento;
import br.com.model.HorarioFilter;
import br.com.model.bd.Cliente;
import br.com.model.bd.Dentista;
import br.com.model.bd.Evento;
import br.com.model.tables.ModelTabelaAgenda;
import br.com.util.TextFieldFormatter;
import br.com.view.exibicao.JDListCliente;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nakao<nakaosensei@gmail.com>
 */
public class JFAgenda extends javax.swing.JFrame {
    private Cliente selecionado;
    private Dentista dentistaOwner;
    private TextFieldFormatter validator = new TextFieldFormatter();
    private HorarioFilter hSelecionado;
    private DAOEvento daoEvento = new DAOEvento();    
    private ModelTabelaAgenda model = new ModelTabelaAgenda();
    private ModelTabelaAgenda modelTabelaSearch = new ModelTabelaAgenda();
    /**
     * Creates new form JFAgenda
     * @param owner
     */
    public JFAgenda(Dentista owner) {
        initComponents();        
        this.dentistaOwner=owner;
        this.setLocationRelativeTo(null);
        formatarDatas();
        this.jTBAgenda.setModel(model);
        this.jTBConsulta.setModel(modelTabelaSearch);
        
        disableComponents();
        jTFNomeCliente.setEditable(false);
        jLMsg.setText("Selecione um dia e abra a agenda");
    }

    private void disableComponents(){
        jBGravar.setEnabled(false);
        jBAddAgenda.setEnabled(false);
        jBRmAgenda.setEnabled(false);
        jTFHora.setEditable(false);
        jTFMinuto.setEditable(false);
        jTFID.setEditable(false);        
    }
    
    private void enableComponents(){
        jBGravar.setEnabled(true);
        jBAddAgenda.setEnabled(true);
        jBRmAgenda.setEnabled(true);
        jTFHora.setEditable(true);
        jTFMinuto.setEditable(true);
        jTFID.setEditable(true);        
    }
    private void formatarDatas() {
        jXDate.setFormats("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        System.out.println(Calendar.JANUARY);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        mes++;
        String data = dia+"/"+mes+"/"+ano;
        jXDate.getEditor().setText(data);
        this.jTFAno.setText(ano+"");
        this.jTFMes.setText(mes<=9?"0"+mes:mes+"");
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPData = new javax.swing.JPanel();
        jXDate = new org.jdesktop.swingx.JXDatePicker();
        jBAddAgenda = new javax.swing.JButton();
        jBRmAgenda = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTBAgenda = new javax.swing.JTable();
        JPanelSeach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBConsulta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jTFAno = validator.getFourDigitsIntegerField();
        jPanel20 = new javax.swing.JPanel();
        jTFMes = validator.getTimeTextField();
        jBSearch = new javax.swing.JButton();
        jBGravar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBAbrir = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jTFHora = validator.getTimeTextField();
        jPanel17 = new javax.swing.JPanel();
        jTFMinuto = validator.getTimeTextField();
        jPanel4 = new javax.swing.JPanel();
        jTFNomeCliente = new javax.swing.JTextField();
        jLMsg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTFID = validator.getIntegerTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPData.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data"));

        jXDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDataLayout = new javax.swing.GroupLayout(jPData);
        jPData.setLayout(jPDataLayout);
        jPDataLayout.setHorizontalGroup(
            jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jXDate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPDataLayout.setVerticalGroup(
            jPDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jXDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jBAddAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/add1_20.png"))); // NOI18N
        jBAddAgenda.setText("Marcar");
        jBAddAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddAgendaActionPerformed(evt);
            }
        });

        jBRmAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/close1_20.png"))); // NOI18N
        jBRmAgenda.setText("Desmarcar");
        jBRmAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRmAgendaActionPerformed(evt);
            }
        });

        jSplitPane1.setDividerLocation(10000);

        jTBAgenda.setModel(new javax.swing.table.DefaultTableModel(
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
        jTBAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBAgendaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTBAgenda);

        jSplitPane1.setLeftComponent(jScrollPane2);
        jSplitPane1.setInheritsPopupMenu(true);

        jSplitPane1.setOneTouchExpandable(true);

        jTBConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTBConsulta);

        jLabel1.setText("Consultas");

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ano"));

        jTFAno.setBorder(null);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFAno, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFAno, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Mes"));

        jTFMes.setBorder(null);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFMes, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFMes, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/search32.png"))); // NOI18N
        jBSearch.setText("Pesquisar");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelSeachLayout = new javax.swing.GroupLayout(JPanelSeach);
        JPanelSeach.setLayout(JPanelSeachLayout);
        JPanelSeachLayout.setHorizontalGroup(
            JPanelSeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelSeachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(JPanelSeachLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanelSeachLayout.setVerticalGroup(
            JPanelSeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelSeachLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelSeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setRightComponent(JPanelSeach);

        jBGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/save16.png"))); // NOI18N
        jBGravar.setText("Gravar");
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/logout16.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/bookOpen16.png"))); // NOI18N
        jBAbrir.setText("Abrir");
        jBAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirActionPerformed(evt);
            }
        });

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Hora"));

        jTFHora.setBorder(null);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFHora, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFHora, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Minuto"));

        jTFMinuto.setBorder(null);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFMinuto, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFMinuto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cliente"));

        jTFNomeCliente.setBorder(null);
        jTFNomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFNomeClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNomeClienteFocusLost(evt);
            }
        });
        jTFNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeClienteActionPerformed(evt);
            }
        });
        jTFNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNomeClienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFNomeCliente)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Id"));

        jTFID.setBorder(null);
        jTFID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFIDFocusLost(evt);
            }
        });
        jTFID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIDActionPerformed(evt);
            }
        });
        jTFID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFIDKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFID, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFID)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(jBSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBGravar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAddAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRmAgenda))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBRmAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jBAddAgenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAbrir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSair)
                        .addComponent(jLMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBGravar)
                        .addGap(5, 5, 5))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jBAddAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddAgendaActionPerformed
        jLMsg.setText("");
        String hora=jTFHora.getText();
        String minuto=jTFMinuto.getText();
        if(selecionado==null){
            JOptionPane.showMessageDialog(null, "Selecione um cliente!");
        }else if(hora.equals("")||minuto.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha a hora e o minuto");
        }else if(hora.length()>2||minuto.length()>2){
            JOptionPane.showMessageDialog(null, "Formato errado na hora ou minuto, somente dois digitos");
        }else{
            if(hora.length()==1){
                hora="0"+hora;
            }
            if(minuto.length()==1){
                minuto="0"+minuto;
            }
            HorarioFilter hf = new HorarioFilter();
            hf.setData(jXDate.getEditor().getText());        
            String split[]=jXDate.getEditor().getText().split("/");
            String dia=split[0].trim();
            String mes=split[1].trim();
            String ano=split[2].trim();           
            hf.setMes(mes);
            hf.setDia(dia);
            hf.setAno(ano);            
            hf.setHorario(hora+":"+minuto);
            hf.setHora(hora);
            hf.setMinuto(minuto);        
            hf.setDentista(dentistaOwner);
            hf.setNomeCliente(selecionado.getNome());
            hf.setCliente(selecionado);
            hf.setFoneCelularCliente(selecionado.getTelcelular1());
            hf.setFoneFixoCliente(selecionado.getTelfixo1());            
            this.model.add(hf);
        }
        
    }//GEN-LAST:event_jBAddAgendaActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirActionPerformed
        String split[]=jXDate.getEditor().getText().split("/");
        String dia=split[0].trim();
        String mes=split[1].trim();
        String ano=split[2].trim();
        List<Evento> eventos=daoEvento.getAllWithThatDateFromThatDentist(ano, mes, dia, dentistaOwner);
        List<HorarioFilter> hfList = new ArrayList<>();
        for(Evento e:eventos){
            HorarioFilter novo = this.convertEventoToHorarioFilter(e);
            hfList.add(novo);
        }
        model.setData(hfList);
        jLMsg.setText("Agora marque/desmarque horários como desejar");
        enableComponents();
    }//GEN-LAST:event_jBAbrirActionPerformed

    private void clearFields(){
        model.setData(new ArrayList<>());
        jTFNomeCliente.setText("");
        jTFHora.setText("00");
        jTFMinuto.setText("00");
        jTFID.setText("0");
    }
    
    private void jTFNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeClienteActionPerformed

    private void jTFNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeClienteKeyPressed
        
    }//GEN-LAST:event_jTFNomeClienteKeyPressed

    private void jTBAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBAgendaMouseClicked
        try {
            int linhaSelecionada = jTBAgenda.convertRowIndexToModel(jTBAgenda.getSelectedRow());
            hSelecionado=model.getValue(linhaSelecionada);            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTBAgendaMouseClicked

    private void jBRmAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRmAgendaActionPerformed
        jLMsg.setText("");
        if(hSelecionado!=null){
            model.remove(hSelecionado);
        }
    }//GEN-LAST:event_jBRmAgendaActionPerformed

    
    public boolean doJBGravarAction(){
        List<Evento> eventos = new ArrayList<>();
        String split[]=jXDate.getEditor().getText().split("/");
        String dia=split[0].trim();
        String mes=split[1].trim();
        String ano=split[2].trim();
        for(HorarioFilter h:model.lista){
            eventos.add(h.convertToEvento());
        }
        daoEvento.deleteAllWithThatDateFromThatDentist(ano, mes, dia, dentistaOwner);
        for(Evento e:eventos){
            daoEvento.inserir(e);
        }
        return true;
    }
    
    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
        boolean ok=doJBGravarAction();
        if(ok==true){
            jLMsg.setText("Agenda atualizada com sucesso");
        }else{
            jLMsg.setText("Erro, contato o suporte por nakaosensei@gmail.com");
        }
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jTFNomeClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNomeClienteFocusGained
        
    }//GEN-LAST:event_jTFNomeClienteFocusGained

    private void jTFNomeClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNomeClienteFocusLost
        
    }//GEN-LAST:event_jTFNomeClienteFocusLost

    private void jXDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDateActionPerformed
        this.clearFields();
        this.disableComponents();
        jLMsg.setText("Selecione um dia e abra a agenda");
    }//GEN-LAST:event_jXDateActionPerformed

    
    private boolean doJbSearchAction(){
        String ano=jTFAno.getText().trim();
        String mes=jTFMes.getText().trim();
        if(ano.equals("")&&mes.equals("")){
            jLMsg.setText("Digite o ano e o mes para a consulta");
            return false;
        }
        List<Evento> eventos=new ArrayList<>();
        List<HorarioFilter> hfList = new ArrayList<>();
        if(!ano.equals("")&&mes.equals("")){
            eventos = daoEvento.getAllWithThatDateFromThatDentist(ano, dentistaOwner);            
        }else if(ano.equals("")&&!mes.equals("")){
            String anoCalendario=jXDate.getEditor().getText().split("/")[2].trim();
            eventos = daoEvento.getAllWithThatDateFromThatDentist(anoCalendario,mes, dentistaOwner);            
        }else if(!ano.equals("")&&!mes.equals("")){
            eventos = daoEvento.getAllWithThatDateFromThatDentist(ano,mes, dentistaOwner);
        }
        for(Evento e:eventos){
            HorarioFilter novo = this.convertEventoToHorarioFilter(e);
            hfList.add(novo);
        }
        modelTabelaSearch.setData(hfList);
        return true;
    }
    
    private HorarioFilter convertEventoToHorarioFilter(Evento e){
        HorarioFilter novo = new HorarioFilter();
        novo.setAno(e.getAno());
        novo.setCliente(e.getIdCliente());
        novo.setDentista(dentistaOwner);
        novo.setDia(e.getDia());
        novo.setFoneCelularCliente(e.getIdCliente().getTelcelular1());
        novo.setFoneFixoCliente(e.getIdCliente().getTelfixo1());
        novo.setHora(e.getHora());
        novo.setMes(e.getMes());
        novo.setMinuto(e.getMinutos());
        novo.setNomeCliente(e.getIdCliente().getNome());
        novo.setHorario(e.getHora()+":"+e.getMinutos());
        novo.setData(e.getDia()+"/"+e.getMes()+"/"+e.getAno());
        return novo;   
    }
    
    
    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        doJbSearchAction();
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jTFIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIDActionPerformed

    private void doIdClienteKeyPressedAction(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode() == KeyEvent.VK_F2||evt.getKeyCode() == KeyEvent.VK_F7){
            JDListCliente jd = new JDListCliente(null, true);
            jd.setVisible(true);           
            while(jd.isClosed==false&&jd.isAborted==false){};
            if(jd.isClosed=true){
                selecionado = jd.clienteSelecionado;
                if(selecionado!=null){
                   jTFID.setText(selecionado.getId()+"");
                   jTFNomeCliente.setText(selecionado.getNome());
                }
            }else{
                selecionado=null;
            }
        }
    }
    
    
    private void jTFIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIDKeyPressed
        doIdClienteKeyPressedAction(evt);
    }//GEN-LAST:event_jTFIDKeyPressed

    private void jTFIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFIDFocusGained
        jLMsg.setText("Pressione F2 ou F7 para pesquisar");
    }//GEN-LAST:event_jTFIDFocusGained

    private void jTFIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFIDFocusLost
        jLMsg.setText("");
    }//GEN-LAST:event_jTFIDFocusLost

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelSeach;
    private javax.swing.JButton jBAbrir;
    private javax.swing.JButton jBAddAgenda;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBRmAgenda;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSearch;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPData;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTBAgenda;
    private javax.swing.JTable jTBConsulta;
    private javax.swing.JTextField jTFAno;
    private javax.swing.JTextField jTFHora;
    private javax.swing.JTextField jTFID;
    private javax.swing.JTextField jTFMes;
    private javax.swing.JTextField jTFMinuto;
    private javax.swing.JTextField jTFNomeCliente;
    private org.jdesktop.swingx.JXDatePicker jXDate;
    // End of variables declaration//GEN-END:variables
}
