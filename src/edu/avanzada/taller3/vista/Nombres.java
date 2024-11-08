package edu.avanzada.taller3.vista;

public class Nombres extends javax.swing.JFrame {
    
    public Nombres() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNombre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botonContinuar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        textNombre2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textNombre3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 186, 106));
        jPanel1.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Carrera de Caballos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 250, 29);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre 1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 100, 59, 15);

        textNombre1.setBackground(new java.awt.Color(255, 217, 174));
        textNombre1.setBorder(null);
        textNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(textNombre1);
        textNombre1.setBounds(40, 120, 250, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese los nombres de los caballos:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 70, 250, 17);

        botonContinuar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(51, 51, 51));
        botonContinuar.setText("Continuar");
        botonContinuar.setBorder(null);
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(botonContinuar);
        botonContinuar.setBounds(150, 300, 140, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller3/vista/Medalla1.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 80, 120, 160);

        botonSalir.setBackground(new java.awt.Color(255, 186, 106));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller3/vista/salir.png"))); // NOI18N
        botonSalir.setBorder(null);
        jPanel1.add(botonSalir);
        botonSalir.setBounds(410, 10, 30, 30);

        textNombre2.setBackground(new java.awt.Color(255, 217, 174));
        textNombre2.setBorder(null);
        textNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombre2ActionPerformed(evt);
            }
        });
        jPanel1.add(textNombre2);
        textNombre2.setBounds(40, 180, 250, 30);

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nombre 3");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 220, 59, 15);

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Nombre 2");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 160, 59, 15);

        textNombre3.setBackground(new java.awt.Color(255, 217, 174));
        textNombre3.setBorder(null);
        textNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombre3ActionPerformed(evt);
            }
        });
        jPanel1.add(textNombre3);
        textNombre3.setBounds(40, 240, 250, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void textNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombre2ActionPerformed

    private void textNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombre1ActionPerformed

    private void textNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombre3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonContinuar;
    public javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField textNombre1;
    public javax.swing.JTextField textNombre2;
    public javax.swing.JTextField textNombre3;
    // End of variables declaration//GEN-END:variables
}
