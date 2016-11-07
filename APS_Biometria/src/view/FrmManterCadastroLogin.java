package view;

import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import control.CtrBuscarUsuario;
import control.CtrManterUsuario;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Usuario;
import model.Util;
import model.Validacoes;

public class FrmManterCadastroLogin extends JFrame {

    CtrManterUsuario context;
    CtrBuscarUsuario ctrBuscarUsuario;
    Usuario user;
    Util util;
    Validacoes valid;
    private byte[] dig;
    
    
    public FrmManterCadastroLogin() {
        
        context = new CtrManterUsuario();
        ctrBuscarUsuario = new CtrBuscarUsuario();
        util = new Util();
        user = new Usuario();
        valid = new Validacoes();
        initComponents();
    }

    
   private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLblRg = new javax.swing.JLabel();
        txtRg = new javax.swing.JFormattedTextField();
        jLblRua = new javax.swing.JLabel();
        jLblBairro = new javax.swing.JLabel();
        jLblNumero = new javax.swing.JLabel();
        jLblCidade = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLblEstado = new javax.swing.JLabel();
        jLblCep = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox();
        txtCidade = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        txtCep = new javax.swing.JFormattedTextField();
        txtNumero = new javax.swing.JTextField();
        btnBiometria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTitulo.setText("Preencha os dados abaixo :");

        lblNome.setText("Nome :");

        lblUsuario.setText("Usuário :");

        lblSenha.setText("Senha :");

        txtSenha.setEchoChar('\u2605');

        jLblCpf.setText("CPF :");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLblRg.setText("RG :");

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLblRua.setText("Rua :");

        jLblBairro.setText("Bairro :");

        jLblNumero.setText("Numero :");

        jLblCidade.setText("Cidade :");

        jLblEstado.setText("Estado :");

        jLblCep.setText("CEP :");

        txtEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setText("");

        btnBiometria.setText("Cadastrar Biometria");
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
                    .addComponent(lblNome)
                    .addComponent(jLblCpf)
                    .addComponent(lblTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblRua)
                                    .addComponent(lblUsuario)
                                    .addComponent(jLblCidade)
                                    .addComponent(jLblBairro))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLblRg)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLblNumero)
                                                                .addGap(18, 18, 18)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txtRg, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                            .addComponent(txtNumero)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLblCep)
                                                        .addGap(36, 36, 36)
                                                        .addComponent(txtCep))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(lblSenha)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNome)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLblEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBiometria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrar)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblRg)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblBairro)
                    .addComponent(jLblCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblEstado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCidade))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnBiometria))
                .addGap(3, 3, 3))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String senha = String.valueOf(txtSenha.getPassword());
            String cpf = util.removeMask(txtCpf.getText());
            String rg = util.removeMask(txtRg.getText());
            String cep = util.removeMask(txtCep.getText());
            Date data = util.getPegaDataAtual();
            String pass = Util.aplicarHash(senha);
            
            if(valid.validaCPF(cpf)== true){
                                        
                if(!"".equals(txtUsuario.getText()) && !"".equals(pass)){
                    
                    if (!context.searchCPF(cpf))
                    {
                        user.setTx_nome(txtNome.getText());
                        user.setTx_cpf(cpf);
                        user.setTx_rg(rg);
                        user.setTx_endereco(txtRua.getText());
                        user.setTx_numero(txtNumero.getText());
                        user.setTx_bairro(txtBairro.getText());
                        user.setTx_cidade(txtCidade.getText());
                        user.setTx_cep(cep);
                        user.setTx_estado(txtEstado.getSelectedItem().toString());
                        user.setTx_login(txtUsuario.getText().toLowerCase());
                        user.setTx_senha(pass);
                        user.setFl_ativo(true);
                        user.setDt_cadastro(data);
                        user.setDigital(getDig());
                     
                        if (context.gravarUsuario(user) == 1)
                        {
                        
                            JOptionPane.showMessageDialog(null, "Usuário Inserido com Sucesso!");
                            txtUsuario.setText("");
                            txtSenha.setText("");
                            this.dispose();
                        
                        }
                    }else{
                    JOptionPane.showMessageDialog(null, "O CPF informado ja existe cadastrado na base de dados!");
                    JOptionPane.showMessageDialog(null, "Usuário não inserido!.");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Preencha todos os dados do Usuário, todos campos são obrigatórios!");
                    JOptionPane.showMessageDialog(null, "Usuário não inserido!.");
                    }
                    
            }
            else{
                
                JOptionPane.showMessageDialog(null, "CPF Inserido esta incorreto!.");
            }
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FrmManterCadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        FrmLogin telaLogin = new FrmLogin();
        telaLogin.setEnabled(true);
        
    }
    private void btnBiometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiometriaActionPerformed
        
        FrmManterBiometria biometria = new FrmManterBiometria(this, rootPaneCheckingEnabled);
        biometria.setVisible(true);
        
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
            java.util.logging.Logger.getLogger(FrmManterCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmManterCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmManterCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmManterCadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmManterCadastroLogin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnBiometria;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLblBairro;
    private javax.swing.JLabel jLblCep;
    private javax.swing.JLabel jLblCidade;
    private javax.swing.JLabel jLblCpf;
    private javax.swing.JLabel jLblEstado;
    private javax.swing.JLabel jLblNumero;
    private javax.swing.JLabel jLblRg;
    private javax.swing.JLabel jLblRua;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
   
    public DPFPTemplate getDig() {
        return DPFPGlobal.getTemplateFactory().createTemplate(this.dig);
    }

   
    public void setDig(DPFPTemplate dig) {
        this.dig = dig.serialize();
    }

    
}
