/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.emptycanvas.library.tribase.equationeditor;

/**
 *
 * @author Manuel Dahmen <manuel.dahmen@gmail.com>
 */
public class EquationEditor extends javax.swing.JDialog {

    /**
     * Creates new form EquationEditor
     */
    public EquationEditor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jTextFieldEqNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEquationDefinition = new javax.swing.JTable();
        jButtonLoad = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jComboBoxEqType = new javax.swing.JComboBox();
        jLabelEqType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("info/emptycanvas/library/tribase/equationeditor/Bundle"); // NOI18N
        jTextFieldEqNom.setText(bundle.getString("EquationEditor.jTextFieldEqNom.text")); // NOI18N
        jTextFieldEqNom.setName("jTextFieldEqNom"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTableEquationDefinition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"x", null},
                {"y", null},
                {"z", null},
                {"umin", null},
                {"umax", null},
                {"vmin", null},
                {"vmax", null},
                {"a", null},
                {"b", null},
                {"c", null},
                {"d", null}
            },
            new String [] {
                "Item", "Definition"
            }
        ));
        jTableEquationDefinition.setName("jTableEqDef"); // NOI18N
        jScrollPane1.setViewportView(jTableEquationDefinition);
        if (jTableEquationDefinition.getColumnModel().getColumnCount() > 0) {
            jTableEquationDefinition.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("EquationEditor.jTableEquationDefinition.columnModel.title0")); // NOI18N
            jTableEquationDefinition.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("EquationEditor.jTableEquationDefinition.columnModel.title1")); // NOI18N
        }

        jButtonLoad.setText(bundle.getString("EquationEditor.jButtonLoad.text")); // NOI18N
        jButtonLoad.setToolTipText(bundle.getString("EquationEditor.jButtonLoad.toolTipText")); // NOI18N
        jButtonLoad.setName("jButtonLoad"); // NOI18N

        jButtonSave.setText(bundle.getString("EquationEditor.jButtonSave.text")); // NOI18N
        jButtonSave.setName("jButtonSave"); // NOI18N

        jComboBoxEqType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Equation 3D à 1 paramètres (courbe)", "Equation 3D à 2 paramètres (surface)" }));
        jComboBoxEqType.setName("jComboBoxEqType"); // NOI18N

        jLabelEqType.setText(bundle.getString("EquationEditor.jLabelEqType.text")); // NOI18N
        jLabelEqType.setName("jLabelEqType"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelEqType)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jComboBoxEqType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 396, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jButtonLoad)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButtonSave)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextFieldEqNom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 329, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jButtonLoad)
                        .add(jButtonSave))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jTextFieldEqNom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 275, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelEqType)
                    .add(jComboBoxEqType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(243, 243, 243))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EquationEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquationEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquationEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquationEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EquationEditor dialog = new EquationEditor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxEqType;
    private javax.swing.JLabel jLabelEqType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEquationDefinition;
    private javax.swing.JTextField jTextFieldEqNom;
    // End of variables declaration//GEN-END:variables
}
