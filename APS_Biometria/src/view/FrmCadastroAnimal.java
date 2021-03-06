 package view;

import control.CtrManterAnimal;
import control.CtrManterCliente;
import control.CtrManterTarefa;
import control.TabelaAnimal;
import control.TabelaTarefa;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Animal;
import model.Cliente;

public class FrmCadastroAnimal extends java.awt.Dialog {

    CtrManterCliente ctrManterCliente;
    String[] nomes;
    List lista;
    CtrManterAnimal animal;
    TableModel modelo;
    Animal anim;
    public int selecionada;
    private String id;
            
    public FrmCadastroAnimal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setModal(true);
        anim = new Animal();
        ctrManterCliente = new CtrManterCliente();
        nomes = new String[]{
            "ID", "Nome", "Raca", "Categoria", "Cliente"
        };
        animal = new CtrManterAnimal();
        lista = animal.carregarAnimais();
        modelo = new TabelaAnimal(lista, nomes);
        
        
        initComponents();
    }
    

  private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimal = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        txNome = new javax.swing.JTextField();
        txRaca = new javax.swing.JTextField();
        txCategoria = new javax.swing.JTextField();
        cbxCliente = new javax.swing.JComboBox();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setModal(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        tblAnimal.setModel(modelo);
        tblAnimal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAnimalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAnimal);

        jLabel1.setText("Nome :");

        jLabel2.setText("Raca :");

        jLabel3.setText("Categoria :");

        jLabel4.setText("Cliente :");

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIncluir)
                                .addGap(26, 26, 26)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txCategoria)
                                    .addComponent(cbxCliente, 0, 169, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txNome)
                                    .addComponent(txRaca, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }
  private void closeDialog(java.awt.event.WindowEvent evt) {
        setVisible(false);
        dispose();
    }
  
    private void formWindowActivated(java.awt.event.WindowEvent evt) {

        DefaultComboBoxModel modelCombo = new DefaultComboBoxModel();
        List listCliente = ctrManterCliente.carregarClientes();

        if (listCliente != null) {

            Iterator j = listCliente.iterator();
            while (j.hasNext()) {
                Cliente clienteList = (Cliente) j.next();
                modelCombo.addElement(clienteList);

            }

            cbxCliente.setModel(modelCombo);

        }
        

    }

    private void tblAnimalMouseClicked(java.awt.event.MouseEvent evt) {

        selecionada = tblAnimal.getSelectedRow();
        if (selecionada == -1) {
            return ; //Não tem nada selecionado
        }
        
        String nome = tblAnimal.getValueAt(selecionada, 1).toString();
        String raca = tblAnimal.getValueAt(selecionada, 2).toString();
        String categoria = tblAnimal.getValueAt(selecionada, 3).toString();
        txNome.setText(nome);
        txRaca.setText(raca);
        txCategoria.setText(categoria);
    }

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            
            anim.setTx_nome(txNome.getText());
            anim.setTx_raca(txRaca.getText());
            anim.setTx_categoria(txCategoria.getText());
            anim.setId_cliente(cbxCliente.getModel().getSelectedItem());
            if (animal.gravarAnimal(anim) == 1) {

                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                txNome.setText("");
                txRaca.setText("");
                txCategoria.setText("");
                lista = null;
                lista = animal.carregarAnimais();
                modelo = new TabelaAnimal(lista, nomes);
                tblAnimal.setModel(modelo);
                tblAnimal.repaint();
            }
        } catch (Exception e) {

        }

    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            id = tblAnimal.getValueAt(selecionada, 0).toString();
            anim.setId_animal(Integer.valueOf(id));
            anim.setTx_nome(txNome.getText());
            anim.setTx_raca(txRaca.getText());
            anim.setTx_categoria(txCategoria.getText());
            anim.setId_cliente(cbxCliente.getModel().getSelectedItem());
            if (selecionada!= -1 && animal.alterarAnimal(anim)){
               
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");
                txNome.setText("");
                txRaca.setText("");
                txCategoria.setText("");
                lista = null;
                lista = animal.carregarAnimais();
                modelo = new TabelaAnimal(lista, nomes);
                tblAnimal.setModel(modelo);
                tblAnimal.repaint();
            
            }
        } catch (Exception e) {

        }
        
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        try{
        
            id = tblAnimal.getValueAt(selecionada, 0).toString();
            anim.setId_animal(Integer.valueOf(id));
            anim.setTx_nome(txNome.getText());
            anim.setTx_raca(txRaca.getText());
            anim.setTx_categoria(txCategoria.getText());
            anim.setId_cliente(cbxCliente.getModel().getSelectedItem());
            if( animal.excluirAnimal(anim)==1){
                
                JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!");
                txNome.setText("");
                txRaca.setText("");
                txCategoria.setText("");
                lista = null;
                lista = animal.carregarAnimais();
                modelo = new TabelaAnimal(lista, nomes);
                tblAnimal.setModel(modelo);
                tblAnimal.repaint();
            
            }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!" + e.getMessage());
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadastroAnimal dialog = new FrmCadastroAnimal(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAnimal;
    private javax.swing.JTextField txCategoria;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txRaca;
}
