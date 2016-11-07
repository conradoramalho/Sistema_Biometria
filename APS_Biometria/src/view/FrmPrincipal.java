/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.CtrManterTarefa;
import control.TabelaTarefa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Jefferson
 */
public class FrmPrincipal extends javax.swing.JFrame {

    String[] nomes;
    List lista;
    CtrManterTarefa tarefa;
    TableModel modelo;

    public FrmPrincipal() {

        nomes = new String[]{
            "ID","Horario","Nome","Animal","Funcionario","Servico","Cliente"
        };
        tarefa = new CtrManterTarefa();
        lista = tarefa.carregarTarefas();
        modelo = new TabelaTarefa(lista, nomes); //lista = meu list/ArrayList e nomes = nome das colunas 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnAnimal = new javax.swing.JButton();
        btnTarefa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnTarefa = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        mnAnimal = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 530));
        setPreferredSize(new java.awt.Dimension(640, 530));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icnCliente.png"))); // NOI18N

        btnAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icnAnimal.png"))); // NOI18N
        btnAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalActionPerformed(evt);
            }
        });

        btnTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icnTarefa.png"))); // NOI18N
        btnTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTarefa)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAnimal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTarefa, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAREFAS AGENDADAS");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setModel(modelo);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Tarefas", jScrollPane1);

        jButton3.setText("Atualizar Lista Tarefas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        mnTarefa.setText("Cadastro");

        mnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icnCliente.png"))); // NOI18N
        mnCliente.setText("Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        mnTarefa.add(mnCliente);

        mnAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icnAnimal.png"))); // NOI18N
        mnAnimal.setText("Animal");
        mnAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAnimalActionPerformed(evt);
            }
        });
        mnTarefa.add(mnAnimal);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/icnTarefa.png"))); // NOI18N
        jMenuItem3.setText("Tarefa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnTarefa.add(jMenuItem3);

        jMenuBar1.add(mnTarefa);

        jMenu2.setText("Servicos");
        jMenuBar1.add(jMenu2);

        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSobre);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Cliente() {

        FrmCadastroCliente telaCliente = new FrmCadastroCliente();
        telaCliente.setVisible(true);
        telaCliente.setLocationRelativeTo(this);

    }

    public void Animal() {

        FrmCadastroAnimal telaAnimal = new FrmCadastroAnimal(this, rootPaneCheckingEnabled);
        telaAnimal.setVisible(true);
        telaAnimal.setLocationRelativeTo(this);
        telaAnimal.setModal(true);

    }

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed

        Cliente();
    }//GEN-LAST:event_mnClienteActionPerformed

    private void mnAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAnimalActionPerformed

        Animal();
    }//GEN-LAST:event_mnAnimalActionPerformed

    private void btnAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalActionPerformed

        Animal();
    }//GEN-LAST:event_btnAnimalActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        JOptionPane.showMessageDialog(null, "Sistema Desenvolvido por alunos da universidade UNIP Swift 5/6 Semestre do curso Sistemas de informacao");
    }//GEN-LAST:event_menuSobreMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        lista = null;
        lista = tarefa.carregarTarefas();
        modelo = new TabelaTarefa(lista, nomes);
        jTable1.setModel(modelo);
        jTable1.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        jTable1.revalidate();
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        FrmCadastroTarefa telaTarefa = new FrmCadastroTarefa(this, rootPaneCheckingEnabled);
        telaTarefa.setVisible(true);
        telaTarefa.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarefaActionPerformed
       
        FrmCadastroTarefa telaTarefa = new FrmCadastroTarefa(this, rootPaneCheckingEnabled);
        telaTarefa.setVisible(true);
        telaTarefa.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_btnTarefaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimal;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnTarefa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem mnAnimal;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenu mnTarefa;
    // End of variables declaration//GEN-END:variables
}
