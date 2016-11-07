package view;

import control.CtrManterAnimal;
import control.CtrManterCliente;
import control.CtrManterServico;
import control.CtrManterTarefa;
import control.CtrManterUsuario;
import control.TabelaTarefa;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.TableModel;
import model.Animal;
import model.Cliente;
import model.Servico;
import model.Usuario;

public class FrmCadastroTarefa extends java.awt.Dialog {

    String[] nomes;
    List lista;
    CtrManterTarefa ctrManterTarefa;
    CtrManterUsuario ctrManterUsuario;
    CtrManterCliente ctrManterCliente;
    CtrManterAnimal ctrManterAnimal;
    CtrManterServico ctrManterServico;
    TableModel modelo;
    Animal a;

    public FrmCadastroTarefa(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        ctrManterTarefa = new CtrManterTarefa();
        ctrManterUsuario = new CtrManterUsuario();
        ctrManterCliente = new CtrManterCliente();
        ctrManterAnimal = new CtrManterAnimal();
        ctrManterServico = new CtrManterServico();
        a = new Animal();

        nomes = new String[]{
            "ID", "Horario", "Nome", "Animal", "Funcionario", "Servico", "Cliente"
        };
        ctrManterTarefa = new CtrManterTarefa();
        lista = ctrManterTarefa.carregarTarefas();
        modelo = new TabelaTarefa(lista, nomes);
        initComponents();

    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        lblAnimal = new javax.swing.JLabel();
        lblServico = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbxFuncionario = new javax.swing.JComboBox();
        cbxAnimal = new javax.swing.JComboBox();
        cbxServico = new javax.swing.JComboBox();
        cbxCliente = new javax.swing.JComboBox();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(640, 530));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Tarefas");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        lblNome.setText("Nome da Tarefa :");

        lblFuncionario.setText("Funcionario Responsavel :");

        lblAnimal.setText("Nome do Animal :");

        lblServico.setText("Servico a Executar :");

        lblData.setText("Data da Tarefa :");

        lblCliente.setText("Nome do Cliente :");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnIncluir.setText("Incluir");

        btnAlterar.setText("Alterar");

        btnExcluir.setText("Excluir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFuncionario)
                    .addComponent(lblServico)
                    .addComponent(lblData)
                    .addComponent(lblNome)
                    .addComponent(btnIncluir)
                    .addComponent(lblCliente)
                    .addComponent(lblAnimal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAlterar)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir))
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuncionario)
                    .addComponent(cbxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnimal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServico))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
    private void closeDialog(java.awt.event.WindowEvent evt) {
        setVisible(false);
        dispose();

    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        //PRENCHENDO OS COMBOBOX ATRAVES DE METODOS.
        try {

            preencherFuncionario();
            preencherCliente();
            preencherAnimal();
            preencherServico();
            
            //cbxCliente.getSelectedItem() 

        } catch (Exception e) {

        }
    }
    private void preencherCliente() {

        DefaultComboBoxModel modelComboCliente = new DefaultComboBoxModel();
        List listCliente = ctrManterCliente.carregarClientes();

        if (listCliente != null) {

            Iterator j = listCliente.iterator();
            while (j.hasNext()) {
                Cliente clienteList = (Cliente) j.next();
                modelComboCliente.addElement(clienteList);

            }

            cbxCliente.setModel(modelComboCliente);

        }

    }

    private void preencherAnimal() {
        DefaultComboBoxModel modelComboAnimal = new DefaultComboBoxModel();
        List listAnimal = ctrManterAnimal.carregarAnimais();

        if (listAnimal != null) {

            Iterator j = listAnimal.iterator();
            while (j.hasNext()) {
                Animal animalList = (Animal) j.next();
                modelComboAnimal.addElement(animalList);

            }

            cbxAnimal.setModel(modelComboAnimal);

        }

    }

    private void preencherServico() {

        DefaultComboBoxModel modelComboServico = new DefaultComboBoxModel();
        List listServico = ctrManterServico.carregarServicos();

        if (listServico != null) {

            Iterator j = listServico.iterator();
            while (j.hasNext()) {
                Servico servicoList = (Servico) j.next();
                modelComboServico.addElement(servicoList);

            }

            cbxServico.setModel(modelComboServico);

        }

    }

    private void preencherFuncionario() {

        DefaultComboBoxModel modelComboFuncionario = new DefaultComboBoxModel();
        List listUsuario = ctrManterUsuario.carregarUsuarios();

        if (listUsuario != null) {

            Iterator j = listUsuario.iterator();
            while (j.hasNext()) {
                Usuario usuarioList = (Usuario) j.next();
                modelComboFuncionario.addElement(usuarioList);

            }

            cbxFuncionario.setModel(modelComboFuncionario);

        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadastroTarefa dialog = new FrmCadastroTarefa(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox<String> cbxAnimal;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxFuncionario;
    private javax.swing.JComboBox<String> cbxServico;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAnimal;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblServico;
    private javax.swing.JTextField txtNome;
    }
