/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Personal
 */
public class Nombres extends javax.swing.JFrame {

    /**
     * Creates new form Nombres
     */
    public Nombres() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JTextField();
        Nombre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonContinuar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 186, 106));
        jPanel1.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("La Copa Saudí");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 10, 170, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Medalla1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(322, 108, 128, 128);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre 1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 100, 59, 15);

        Nombre2.setBackground(new java.awt.Color(255, 217, 174));
        Nombre2.setBorder(null);
        Nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre2ActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre2);
        Nombre2.setBounds(40, 180, 250, 30);

        Nombre1.setBackground(new java.awt.Color(255, 217, 174));
        Nombre1.setBorder(null);
        jPanel1.add(Nombre1);
        Nombre1.setBounds(40, 120, 250, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese los nombres:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 70, 200, 17);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre 2");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 160, 59, 15);

        BotonContinuar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        BotonContinuar.setForeground(new java.awt.Color(51, 51, 51));
        BotonContinuar.setText("Continuar");
        BotonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonContinuar);
        BotonContinuar.setBounds(140, 252, 140, 20);

        BotonSalir.setBackground(new java.awt.Color(255, 186, 106));
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/salir.png"))); // NOI18N
        BotonSalir.setBorder(null);
        jPanel1.add(BotonSalir);
        BotonSalir.setBounds(410, 10, 40, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre2ActionPerformed

    private void BotonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonContinuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(Nombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nombres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonContinuar;
    public javax.swing.JButton BotonSalir;
    public javax.swing.JTextField Nombre1;
    public javax.swing.JTextField Nombre2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
