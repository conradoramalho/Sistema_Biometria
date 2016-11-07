/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.digitalpersona.onetouch.DPFPCaptureFeedback;
import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPImageQualityAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPImageQualityEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.levymoreira.biometria.Biometria;
import control.CtrBuscarUsuario;
import control.CtrManterUsuario;
import dao.DaoUsuario;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Usuario;
import model.Util;


public class FrmLoginBiometria extends javax.swing.JFrame {

    CtrBuscarUsuario ctrBuscarUsuario;
    CtrManterUsuario ctrManterUsuario;
    DaoUsuario d;
    Usuario u;
    private DPFPCapture capturer = DPFPGlobal.getCaptureFactory().createCapture();

    public FrmLoginBiometria() throws InterruptedException {

        ctrBuscarUsuario = new CtrBuscarUsuario();
        ctrManterUsuario = new CtrManterUsuario();
        d = new DaoUsuario();
        u = new Usuario();
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                try {

                    
                        init();
                        logarBiometria();
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(FrmLoginBiometria.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            @Override
            public void componentHidden(ComponentEvent e) {
                stop();
            }

        });

        initComponents();
    }

    protected void process(DPFPSample sample) {
        // Draw fingerprint sample image.
        drawPicture(convertSampleToBitmap(sample));
        DPFPFeatureSet features = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);
    }

    public boolean logarBiometria() throws InterruptedException {

        int retorno = localizarPorDigital();

        try {

            if (retorno == 0) {

                FrmPrincipal telaPrincipal = new FrmPrincipal();
                telaPrincipal.setVisible(true);
                telaPrincipal.setLocationRelativeTo(this);
                this.dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Erro de Digital!");

            }
            return true;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Usuario Inexistente!");
            return false;
        }

    }

    public int localizarPorDigital() throws InterruptedException {
        //pega a digital...
        DPFPSample digitalAtual = Biometria.getDigital();
        //array com alunos do banco de dados
        List<Usuario> usuarios = ctrManterUsuario.carregarUsuarios();

        //loop em busca da digital pega anteriormente nos alunos da base
        Usuario userEncontrado = null;
        for (Usuario user : usuarios) {
            if (Biometria.compararDigitais(user.getDigital(), digitalAtual)) {
                userEncontrado = user;
            }
        }

        //se nao encontrou ira retornar null
        if (userEncontrado == null) {
            return 1;
        } else {

            return 0;
        }
    }

    public void drawPicture(Image image) {
        picture.setIcon(new ImageIcon(
                image.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_AREA_AVERAGING)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCopyright = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(200, 300));
        setMinimumSize(new java.awt.Dimension(200, 300));
        setPreferredSize(new java.awt.Dimension(200, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login Biometria"));

        lblCopyright.setText("Copyright 2016 - J Animals Ltda");

        picture.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCopyright)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblCopyright))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    protected void start() {
        capturer.startCapture();

    }

    protected void stop() {
        capturer.stopCapture();
    }

    protected void init() throws InterruptedException {
        capturer.addDataListener(new DPFPDataAdapter() {
            @Override
            public void dataAcquired(final DPFPDataEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        process(e.getSample());
                    }
                });
            }
        });
        capturer.addReaderStatusListener(new DPFPReaderStatusAdapter() {

            @Override
            public void readerConnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane.showMessageDialog(null, "O Leitor de Biometria esta conectado.");

                    }
                });

            }

            @Override
            public void readerDisconnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JOptionPane.showMessageDialog(null, "O Leitor de Biometria esta desconectado.");
                    }
                });
            }
        });
        capturer.addSensorListener(new DPFPSensorAdapter() {
            @Override
            public void fingerTouched(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {

                    }
                });
            }

            @Override
            public void fingerGone(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {

                    }
                });
            }
        });
        capturer.addImageQualityListener(new DPFPImageQualityAdapter() {
            @Override
            public void onImageQuality(final DPFPImageQualityEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        if (e.getFeedback().equals(DPFPCaptureFeedback.CAPTURE_FEEDBACK_GOOD)) {
                            JOptionPane.showMessageDialog(null, "A qualidade da leitura foi Otima.");
                        } else {
                            JOptionPane.showMessageDialog(null, "A qualidade da leitura nao alcancou o esperado.");
                        }
                    }
                });

            }

        });
        //start();

    }

    protected Image convertSampleToBitmap(DPFPSample sample) {
        return DPFPGlobal.getSampleConversionFactory().createImage(sample);
    }

    protected DPFPFeatureSet extractFeatures(DPFPSample sample, DPFPDataPurpose purpose) {
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try {
            return extractor.createFeatureSet(sample, purpose);
        } catch (DPFPImageQualityException e) {
            return null;
        }
    }

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
            java.util.logging.Logger.getLogger(FrmLoginBiometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoginBiometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoginBiometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoginBiometria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmLoginBiometria().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FrmLoginBiometria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
