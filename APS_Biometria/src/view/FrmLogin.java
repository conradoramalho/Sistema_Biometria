package view;

import control.CtrBuscarUsuario;
import control.CtrManterUsuario;
import dao.DaoUsuario;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import model.Util;
import view.FrmManterCadastroLogin;
import view.FrmPrincipal;

public class FrmLogin extends javax.swing.JFrame {

    CtrBuscarUsuario ctrBuscarUsuario;
    CtrManterUsuario ctrManterUsuario;
    DaoUsuario daoUsuario;
    Usuario usuario;
    
            
    public FrmLogin() {
        
        ctrBuscarUsuario = new CtrBuscarUsuario();
        ctrManterUsuario = new CtrManterUsuario();
        daoUsuario = new DaoUsuario();
        usuario = new Usuario();
        
        initComponents();
    }

        public boolean Logar() throws NoSuchAlgorithmException {

        String senha = Util.aplicarHash(String.valueOf(txtSenha.getPassword()));
        usuario.setTx_login(txtLogin.getText().toLowerCase());
        usuario.setTx_senha(senha);
        ctrBuscarUsuario.setUser(usuario);
        int retorno = ctrBuscarUsuario.logar();

        try {

            if (retorno == 0) {

                FrmPrincipal telaPrincipal = new FrmPrincipal();
                telaPrincipal.setVisible(true);
                telaPrincipal.setLocationRelativeTo(this);
                this.dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Erro de Senha!");

            }
            return true;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Usuario Inexistente!");
            return false;
        }
    }
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblCopyright = new javax.swing.JLabel();
        btnBiometria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnLogar.setText("Entrar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtSenha.setEchoChar('\u2605');

        lblUsuario.setText("Usuário :");

        lblSenha.setText("Senha :");

        lblCopyright.setText("Copyright 2016 - J Animals Ltda");

        btnBiometria.setText("Biometria");
        btnBiometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiometriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btnBiometria)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSenha)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblCopyright)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnBiometria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCopyright))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        FrmManterCadastroLogin telaCadLogin = new FrmManterCadastroLogin();
        telaCadLogin.setVisible(true);
        telaCadLogin.setLocationRelativeTo(this);
        
    }
    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Logar();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void btnBiometriaActionPerformed(java.awt.event.ActionEvent evt) {
        FrmLoginBiometria telaLogin;
        try {
            telaLogin = new FrmLoginBiometria();
            telaLogin.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
        
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnBiometria;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JTextField txtLogin;
    public javax.swing.JPasswordField txtSenha;
}
