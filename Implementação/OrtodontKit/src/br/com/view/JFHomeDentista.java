/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.view.exibicao.JDListCliente;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author a1061712
 */
public class JFHomeDentista extends javax.swing.JFrame {

    /**
     * Creates new form JFHome
     */
    public JFHomeDentista() {
        initComponents();
        this.setLocationRelativeTo(null);
        addListeners();
    }

    private void addListeners(){
        this.addWindowListener( new WindowListener(){
            public void windowClosing( WindowEvent e ){
                close();
            }
            public void windowClosed( WindowEvent e ){
                
                JFLogin jf = new JFLogin();
                jf.setVisible(true);
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabelBackGround = new javax.swing.JLabel();
        jBAgenda = new javax.swing.JButton();
        jBRecibo = new javax.swing.JButton();
        jBTratamento = new javax.swing.JButton();
        jBSecretaria = new javax.swing.JButton();
        jBCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();
        jBRelatorios = new javax.swing.JButton();
        jBOdontograma = new javax.swing.JButton();
        jBPlanoAvaliacaoDentaria = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuTramento = new javax.swing.JMenu();
        jMIStartTratamento = new javax.swing.JMenuItem();
        jMICancelTratamento = new javax.swing.JMenuItem();
        jMenuAgenda = new javax.swing.JMenu();
        jMIAgendar = new javax.swing.JMenuItem();
        jMIDesagendar = new javax.swing.JMenuItem();
        jMIVer = new javax.swing.JMenuItem();
        jMenuRecibos = new javax.swing.JMenu();
        jMIEmitirRecibo = new javax.swing.JMenuItem();
        JMenuCadastros = new javax.swing.JMenu();
        jMICliente = new javax.swing.JMenuItem();
        jMISecretaria = new javax.swing.JMenuItem();
        jMIDentista = new javax.swing.JMenuItem();
        Relatórios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/agenda48.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabelBackGround.setFont(new java.awt.Font("TakaoPGothic", 1, 14)); // NOI18N
        jLabelBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/logo128.png"))); // NOI18N
        jLabelBackGround.setText("Ortodont System");

        jBAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/agenda48.png"))); // NOI18N

        jBRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/recibo48.png"))); // NOI18N

        jBTratamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/tratamento48.png"))); // NOI18N

        jBSecretaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/secretaria48.png"))); // NOI18N

        jBCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/cliente48.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Logo/nkStation16.png"))); // NOI18N
        jLabel3.setText("Powered by Nk Station");

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/logout48.png"))); // NOI18N
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/report48.png"))); // NOI18N

        jBOdontograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/odontograma48.png"))); // NOI18N

        jBPlanoAvaliacaoDentaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/document48.png"))); // NOI18N

        jMenuTramento.setText("Tratamento");

        jMIStartTratamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMIStartTratamento.setText("Iniciar Tratamento");
        jMenuTramento.add(jMIStartTratamento);

        jMICancelTratamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMICancelTratamento.setText("Abrir Tratamento");
        jMenuTramento.add(jMICancelTratamento);

        jMenuBar1.add(jMenuTramento);

        jMenuAgenda.setText("Agenda");

        jMIAgendar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMIAgendar.setText("Marcar");
        jMenuAgenda.add(jMIAgendar);

        jMIDesagendar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMIDesagendar.setText("Desmarcar");
        jMIDesagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDesagendarActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMIDesagendar);

        jMIVer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMIVer.setText("Abrir");
        jMIVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVerActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMIVer);

        jMenuBar1.add(jMenuAgenda);

        jMenuRecibos.setText("Recibo");

        jMIEmitirRecibo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMIEmitirRecibo.setText("Emitir ");
        jMenuRecibos.add(jMIEmitirRecibo);

        jMenuBar1.add(jMenuRecibos);

        JMenuCadastros.setText("Cadastros");

        jMICliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMICliente.setText("Cadastrar Cliente");
        jMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteActionPerformed(evt);
            }
        });
        JMenuCadastros.add(jMICliente);

        jMISecretaria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMISecretaria.setText("Cadastrar Secretária");
        JMenuCadastros.add(jMISecretaria);

        jMIDentista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMIDentista.setText("Cadastrar Dentista");
        JMenuCadastros.add(jMIDentista);

        jMenuBar1.add(JMenuCadastros);

        Relatórios.setText("Relatórios");

        jMenuItem1.setText("Relatorio de Recibos");
        Relatórios.add(jMenuItem1);

        jMenuItem2.setText("Relatorio de Clientes");
        Relatórios.add(jMenuItem2);

        jMenuBar1.add(Relatórios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelBackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jBOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jBPlanoAvaliacaoDentaria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBOdontograma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPlanoAvaliacaoDentaria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3))
            .addComponent(jLabelBackGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIDesagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDesagendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMIDesagendarActionPerformed

    private void jMIVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVerActionPerformed
        JFAgenda jfa = new JFAgenda();
        jfa.setVisible(true);
    }//GEN-LAST:event_jMIVerActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        close();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteActionPerformed
        JDListCliente jd = new JDListCliente(this, true);
        jd.setVisible(true);
    }//GEN-LAST:event_jMIClienteActionPerformed

    private void close(){
        int res = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?");
        if(res==0){
            this.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuCadastros;
    private javax.swing.JMenu Relatórios;
    private javax.swing.JButton jBAgenda;
    private javax.swing.JButton jBCliente;
    private javax.swing.JButton jBOdontograma;
    private javax.swing.JButton jBPlanoAvaliacaoDentaria;
    private javax.swing.JButton jBRecibo;
    private javax.swing.JButton jBRelatorios;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSecretaria;
    private javax.swing.JButton jBTratamento;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBackGround;
    private javax.swing.JMenuItem jMIAgendar;
    private javax.swing.JMenuItem jMICancelTratamento;
    private javax.swing.JMenuItem jMICliente;
    private javax.swing.JMenuItem jMIDentista;
    private javax.swing.JMenuItem jMIDesagendar;
    private javax.swing.JMenuItem jMIEmitirRecibo;
    private javax.swing.JMenuItem jMISecretaria;
    private javax.swing.JMenuItem jMIStartTratamento;
    private javax.swing.JMenuItem jMIVer;
    private javax.swing.JMenu jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuRecibos;
    private javax.swing.JMenu jMenuTramento;
    // End of variables declaration//GEN-END:variables
}
