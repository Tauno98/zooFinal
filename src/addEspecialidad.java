/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Alain
 */
public class addEspecialidad extends javax.swing.JFrame {

    /**
     * Creates new form addEspecialidad
     */
    public addEspecialidad() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextEspecialidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextSalario = new javax.swing.JTextField();
        jTextPeligrosidad = new javax.swing.JTextField();
        jButtonMenu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lao MN", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Especialidades");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 91));

        jLabel2.setText("Especialidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 144, -1, -1));

        jTextEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEspecialidadActionPerformed(evt);
            }
        });
        jPanel1.add(jTextEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 141, 243, -1));

        jLabel3.setText("Salario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 184, -1, -1));

        jLabel4.setText("Peligrosidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 231, -1, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));
        jPanel1.add(jTextSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 181, 243, -1));

        jTextPeligrosidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPeligrosidadActionPerformed(evt);
            }
        });
        jPanel1.add(jTextPeligrosidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 228, 243, -1));

        jButtonMenu.setText("Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel5.setText("Descripcion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 281, -1, -1));

        jTextDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(jTextDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 278, 243, -1));

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 96, 180, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEspecialidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Variables
        String nombreEspecialidad;
        float salarioMedio;
        float ExtraPeligrosidad;
        String descripcion;
        //Recogida de daos
        nombreEspecialidad = jTextEspecialidad.getText();
        salarioMedio = Float.parseFloat(jTextSalario.getText());
        ExtraPeligrosidad = Float.parseFloat(jTextPeligrosidad.getText());
        descripcion = jTextDescripcion.getText();

        String insertar = "INSERT INTO especialidad(descripcion,especialidad,salario,peligrosidad ) VALUES('" + descripcion + "','" + nombreEspecialidad + "', " + salarioMedio + "," + ExtraPeligrosidad + ")";
        
        ControlDatos.ejecutarConsulta(DEFAULT_CURSOR, DISPOSE_ON_CLOSE, insertar);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextPeligrosidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPeligrosidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPeligrosidadActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        Menu i = new Menu();
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jTextDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescripcionActionPerformed

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
            java.util.logging.Logger.getLogger(addEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEspecialidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextEspecialidad;
    private javax.swing.JTextField jTextPeligrosidad;
    private javax.swing.JTextField jTextSalario;
    // End of variables declaration//GEN-END:variables
}
