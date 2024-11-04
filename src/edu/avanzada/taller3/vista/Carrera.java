package edu.avanzada.taller3.vista;

public class Carrera extends javax.swing.JFrame {
    
    public Carrera() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public synchronized void actualizarVistaCaballo(int numCaballo, int x, int y) {
        switch (numCaballo) {
            case 1:
                Caballo1.setLocation(x, y);
                break;
            case 2:
                Caballo2.setLocation(x, y);
                break;
            case 3:
                Caballo3.setLocation(x, y);
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Caballo2 = new javax.swing.JLabel();
        Caballo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Caballo3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonInterrumpir = new javax.swing.JToggleButton();
        botonEmpezar1 = new javax.swing.JToggleButton();
        PanelBaseSemaforo = new javax.swing.JPanel();
        LuzRoja = new javax.swing.JPanel();
        LuzAmarilla = new javax.swing.JPanel();
        LuzVerde = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 186, 106));
        jPanel1.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.setLayout(null);

        Titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        Titulo.setForeground(new java.awt.Color(204, 0, 0));
        Titulo.setText("Carrera de Caballos");
        jPanel1.add(Titulo);
        Titulo.setBounds(240, 20, 310, 33);

        botonSalir.setBackground(new java.awt.Color(255, 186, 106));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller3/vista/salir.png"))); // NOI18N
        botonSalir.setBorder(null);
        jPanel1.add(botonSalir);
        botonSalir.setBounds(650, 20, 30, 30);

        jPanel2.setBackground(new java.awt.Color(252, 251, 249));
        jPanel2.setLayout(null);

        Caballo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller3/vista/animal-3629_128.gif"))); // NOI18N
        jPanel2.add(Caballo2);
        Caballo2.setBounds(420, 90, 93, 50);

        Caballo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller3/vista/animal-3629_128.gif"))); // NOI18N
        jPanel2.add(Caballo1);
        Caballo1.setBounds(420, 10, 93, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller3/vista/Meta.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 0, 40, 220);

        jLabel2.setText("________________________________________________________________________________________");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 140, 460, 16);

        jLabel4.setText("________________________________________________________________________________________");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 60, 460, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("1");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(520, 10, 40, 60);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("3");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(520, 150, 40, 60);

        Caballo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/avanzada/taller3/vista/animal-3629_128.gif"))); // NOI18N
        jPanel2.add(Caballo3);
        Caballo3.setBounds(420, 160, 93, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("2");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(520, 90, 40, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(130, 80, 550, 220);

        botonInterrumpir.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        botonInterrumpir.setForeground(new java.awt.Color(51, 51, 51));
        botonInterrumpir.setText("Interrumpir");
        botonInterrumpir.setBorder(null);
        botonInterrumpir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInterrumpirActionPerformed(evt);
            }
        });
        jPanel1.add(botonInterrumpir);
        botonInterrumpir.setBounds(420, 340, 150, 30);

        botonEmpezar1.setBackground(new java.awt.Color(225, 255, 214));
        botonEmpezar1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        botonEmpezar1.setForeground(new java.awt.Color(51, 51, 51));
        botonEmpezar1.setText("Empezar Carrera");
        botonEmpezar1.setBorder(null);
        botonEmpezar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpezar1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonEmpezar1);
        botonEmpezar1.setBounds(220, 340, 150, 30);

        PanelBaseSemaforo.setBackground(new java.awt.Color(255, 186, 106));
        PanelBaseSemaforo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 40, true));
        PanelBaseSemaforo.setForeground(new java.awt.Color(51, 51, 51));
        PanelBaseSemaforo.setLayout(null);

        LuzRoja.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout LuzRojaLayout = new javax.swing.GroupLayout(LuzRoja);
        LuzRoja.setLayout(LuzRojaLayout);
        LuzRojaLayout.setHorizontalGroup(
            LuzRojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        LuzRojaLayout.setVerticalGroup(
            LuzRojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        PanelBaseSemaforo.add(LuzRoja);
        LuzRoja.setBounds(20, 20, 30, 30);

        LuzAmarilla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout LuzAmarillaLayout = new javax.swing.GroupLayout(LuzAmarilla);
        LuzAmarilla.setLayout(LuzAmarillaLayout);
        LuzAmarillaLayout.setHorizontalGroup(
            LuzAmarillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        LuzAmarillaLayout.setVerticalGroup(
            LuzAmarillaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        PanelBaseSemaforo.add(LuzAmarilla);
        LuzAmarilla.setBounds(20, 60, 30, 30);

        LuzVerde.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout LuzVerdeLayout = new javax.swing.GroupLayout(LuzVerde);
        LuzVerde.setLayout(LuzVerdeLayout);
        LuzVerdeLayout.setHorizontalGroup(
            LuzVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        LuzVerdeLayout.setVerticalGroup(
            LuzVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        PanelBaseSemaforo.add(LuzVerde);
        LuzVerde.setBounds(20, 100, 30, 30);

        jPanel1.add(PanelBaseSemaforo);
        PanelBaseSemaforo.setBounds(30, 80, 70, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInterrumpirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInterrumpirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonInterrumpirActionPerformed

    private void botonEmpezar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpezar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEmpezar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Caballo1;
    public javax.swing.JLabel Caballo2;
    public javax.swing.JLabel Caballo3;
    public javax.swing.JPanel LuzAmarilla;
    public javax.swing.JPanel LuzRoja;
    public javax.swing.JPanel LuzVerde;
    private javax.swing.JPanel PanelBaseSemaforo;
    private javax.swing.JLabel Titulo;
    public javax.swing.JToggleButton botonEmpezar1;
    public javax.swing.JToggleButton botonInterrumpir;
    public javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
