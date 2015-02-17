/*
 * 2013 Manuel Dahmen
 */
package info.emptycanvas.library.testing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

import info.emptycanvas.library.object.ECBufferedImage;
import info.emptycanvas.library.testing.TestObjet.ImageContainer;

/**
 *
 * @author Manuel DAHMEN
 */
public final class ShowTestResult extends javax.swing.JFrame implements Runnable {

    /**
     *
     */
    private static final long serialVersionUID = -7844993762133687210L;
    private ECBufferedImage image = null;
    private ImageContainer biic;
    private boolean stop = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonDemarrerNouveauFilm;
    private javax.swing.JCheckBox jCheckBoxFilmRec;
    private javax.swing.JCheckBox jCheckBoxImagesRec;
    private javax.swing.JCheckBox jCheckBoxModeles;
    private javax.swing.JCheckBox jCheckBoxOGL;
    private javax.swing.JLabel jLabelFrame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
	private TestObjet testRef;

    private Throwable throwable;

    /**
     * Creates new form ShowTestResult
     */
    public ShowTestResult() {
        initComponents();
        
        jPanel1.setSize(jPanel1.getWidth(), 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ShowTestResult(BufferedImage ri) {
        initComponents();

        loadImage(ri);

        
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public ShowTestResult(ECBufferedImage ri) {
        initComponents();

        image = ri;

        if (image != null) {
            setSize(new Dimension(image.getWidth(), image.getHeight()));
        }
        setVisible(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        addKeyListener(new KeyListener() {

            private boolean stop;

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'P' || e.getKeyChar() == 'p') {
                    if (testRef != null && testRef instanceof Runnable) {
                        testRef.PAUSE();
                    }
                }
                if (e.getKeyChar() == 'S' || e.getKeyChar() == 's') {
                    if (testRef != null && testRef instanceof Runnable) {
                        testRef.STOP();
                        stop = true;
                        dispose();
                    }
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }

        });
    }

    public void dessine() {
        if (biic != null && biic.getImage() != null) {
            image = new ECBufferedImage(biic.getImage());
            if (image != null) {
                if (jPanel1 != null) {
                    Graphics g = jPanel1.getGraphics();
                    if (g != null) {
                        jPanel1.getGraphics().drawImage(image, 0, 0,
                                jPanel1.getWidth(), jPanel1.getHeight(), 0, 0,
                                image.getWidth(), image.getHeight(), null);
                        // jPanel1.getGraphics().setColor(Color.red);
                        // jPanel1.getGraphics().drawRect(0, 0, 400, 200);
                        jPanel1.getGraphics().drawString(biic.getStr(), 10, 10);
                        jPanel1.getGraphics().drawString(" ? Pause ? " + testRef.isPause() + " ? Pause active ? " + testRef.isPauseActive(), 50, 10);
                        jLabelFrame.setText("f n°" + testRef.frame());
                    }
                }
            }
        }
    }

    public void exceptionReception(Exception t) {
        this.throwable = t;
        try {
            image = new ECBufferedImage(
                    ImageIO.read(
                            getClass().getResourceAsStream("be/ibiiztera/md/pmatrix/test/pushmatrix/newtest/skull-cross-bones-evil.ico")
                    )
            );
        } catch (IOException e) {

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabelFrame = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBoxOGL = new javax.swing.JCheckBox();
        jCheckBoxModeles = new javax.swing.JCheckBox();
        jCheckBoxFilmRec = new javax.swing.JCheckBox();
        jCheckBoxImagesRec = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButtonDemarrerNouveauFilm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));
        jSplitPane1.setLeftComponent(jPanel1);

        jSplitPane2.setMinimumSize(new java.awt.Dimension(200, 200));

        jButton1.setText("Parcourir le dossier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pause");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Quitter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabelFrame.setText("0");
        jLabelFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFrame))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel3);

        jCheckBoxOGL.setText("Open GL");
        jCheckBoxOGL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOGLActionPerformed(evt);
            }
        });

        jCheckBoxModeles.setText("Modèles");
        jCheckBoxModeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModelesActionPerformed(evt);
            }
        });

        jCheckBoxFilmRec.setSelected(true);
        jCheckBoxFilmRec.setText("Enregistrer film");
        jCheckBoxFilmRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFilmRecActionPerformed(evt);
            }
        });

        jCheckBoxImagesRec.setSelected(true);
        jCheckBoxImagesRec.setText("Enregistrer images");
        jCheckBoxImagesRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxImagesRecActionPerformed(evt);
            }
        });

        jTextField1.setText("frame#no");

        jTextField2.setText("movie#no");

        jButtonDemarrerNouveauFilm.setText("(fermer et) créer nouveau");
        jButtonDemarrerNouveauFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDemarrerNouveauFilmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBoxOGL)
                    .addComponent(jCheckBoxModeles)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBoxFilmRec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBoxImagesRec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDemarrerNouveauFilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxOGL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxModeles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxFilmRec)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDemarrerNouveauFilm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxImagesRec)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel2);

        jSplitPane1.setRightComponent(jSplitPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("explorer \"" + testRef.getSubfolder().getAbsolutePath() + "\"");
        } catch (IOException ex) {
            Logger.getLogger(ShowTestResult.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        testRef.PAUSE();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        testRef.STOP();
        stop = true;
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void toggleTestOption(int GEN_OPT, boolean value)
    {
        testRef.setGenerate(testRef.getGenerate()|((value?1:0)|GEN_OPT));
    }
    private void jCheckBoxOGLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOGLActionPerformed
        
        toggleTestOption(TestObjet.GENERATE_OPENGL, jCheckBoxOGL.isSelected());
    }//GEN-LAST:event_jCheckBoxOGLActionPerformed

    private void jCheckBoxModelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxModelesActionPerformed
        toggleTestOption(TestObjet.GENERATE_MODEL, jCheckBoxModeles.isSelected());
    }//GEN-LAST:event_jCheckBoxModelesActionPerformed

    private void jCheckBoxFilmRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFilmRecActionPerformed
        toggleTestOption(TestObjet.GENERATE_MOVIE, jCheckBoxFilmRec.isSelected());
        throw new UnsupportedOperationException("Default= rec");
    }//GEN-LAST:event_jCheckBoxFilmRecActionPerformed

    private void jCheckBoxImagesRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxImagesRecActionPerformed
        toggleTestOption(TestObjet.GENERATE_IMAGE, jCheckBoxImagesRec.isSelected());
    }//GEN-LAST:event_jCheckBoxImagesRecActionPerformed

    private void jButtonDemarrerNouveauFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDemarrerNouveauFilmActionPerformed
        testRef.startNewMovie();
    }//GEN-LAST:event_jButtonDemarrerNouveauFilmActionPerformed
    
    
    public void loadImage(BufferedImage ri) {
        this.image = new ECBufferedImage(ri);
        if (image != null) {
            setSize(new Dimension(image.getWidth(), image.getHeight()));
        }
    }

    @Override
    public void run() {
        while (true && !stop) {
            dessine();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ShowTestResult.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
    }

    public void setImageContainer(TestObjet.ImageContainer ic) {
        this.biic = ic;
    }

    public void setTestObjet(TestObjet testObjet) {
        this.testRef = testObjet;
        setTitle(testObjet.getClass().getCanonicalName());

    }

    void stopThreads() {
        stop = true;
    }
}
