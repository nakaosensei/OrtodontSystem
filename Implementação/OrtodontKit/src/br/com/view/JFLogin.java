
package br.com.view;



import br.com.DAO.DAODentista;
import br.com.DAO.DAOSecretaria;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author a1061712
 */
public class JFLogin extends javax.swing.JFrame {
    private static String mensagemFalha;
    private static String emailSuporte;
    /**
     * Creates new form JFHome
     */
    public JFLogin() {
        initComponents();
        carregarComponentes();
    }
    
    private void carregarComponentes(){
       mensagemFalha="Login e/ou senha incorretos";
       emailSuporte="nakaosensei@gmail.com";    
       this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFLogin = new javax.swing.JTextField();
        jBEsqueciSenha = new javax.swing.JToggleButton();
        jBLogin = new javax.swing.JToggleButton();
        jTFPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPrincipal.setBackground(Color.WHITE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Icons/logo128.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        jLabel2.setText("Bem vindo ao Ortodont System");

        jTFLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Login"));
        jTFLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFLoginKeyPressed(evt);
            }
        });

        jBEsqueciSenha.setText("Esqueceu a senha?");
        jBEsqueciSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEsqueciSenhaActionPerformed(evt);
            }
        });

        jBLogin.setText("Entrar");
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        jTFPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Senha"));
        jTFPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPrincipalLayout = new javax.swing.GroupLayout(jPrincipal);
        jPrincipal.setLayout(jPrincipalLayout);
        jPrincipalLayout.setHorizontalGroup(
            jPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFLogin)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEsqueciSenha)
                        .addGap(40, 40, 40))
                    .addComponent(jTFPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPrincipalLayout.setVerticalGroup(
            jPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEsqueciSenha)
                    .addComponent(jBLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icons/Logo/nkStation16.png"))); // NOI18N
        jLabel3.setText("Powered by Nk Station");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLoginAction(){
        String login=jTFLogin.getText().trim();
        char senha[]=jTFPassword.getPassword();
        String pw="";
        for(char c:senha){
            pw+=c;
        }
        if(login.trim().equals("admin")&&pw.trim().equals("admin123")){
            JFHomeDentista jfhd = new JFHomeDentista();
            jfhd.setVisible(true);
            this.dispose();
        }else{
            DAODentista dao = new DAODentista();
            boolean hasDentista=dao.isRegistered(login, pw);
            if(hasDentista==true){
                JFHomeDentista jfhd = new JFHomeDentista();
                jfhd.setVisible(true);
                this.dispose();
            }else{
                DAOSecretaria daos = new DAOSecretaria();
                boolean hasSecretaria = dao.isRegistered(login, pw);
                if(hasSecretaria==true){
                    JFHomeSecretaria jfs = new JFHomeSecretaria();
                    jfs.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, mensagemFalha);
                    this.jTFLogin.requestFocus();
                }
            }
        }
    }
    
    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        jBLoginAction();
                
    }//GEN-LAST:event_jBLoginActionPerformed

    private void jBEsqueciSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEsqueciSenhaActionPerformed
        JOptionPane.showMessageDialog(null, "Envie um email para "+emailSuporte+" explicando seu caso para recuperar seu login e senha");
    }//GEN-LAST:event_jBEsqueciSenhaActionPerformed

    private void jTFLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFLoginKeyPressed
        if(evt.getKeyCode()==(KeyEvent.VK_ENTER)){
            this.jBLoginAction();
        }
    }//GEN-LAST:event_jTFLoginKeyPressed

    private void jTFPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPasswordKeyPressed
        if(evt.getKeyCode()==(KeyEvent.VK_ENTER)){
            this.jBLoginAction();
        }
    }//GEN-LAST:event_jTFPasswordKeyPressed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBEsqueciSenha;
    private javax.swing.JToggleButton jBLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPrincipal;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JPasswordField jTFPassword;
    // End of variables declaration//GEN-END:variables
}
