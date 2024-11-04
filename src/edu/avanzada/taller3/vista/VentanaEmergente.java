package edu.avanzada.taller3.vista;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Ventana emergente. Clase encargada de mostrar mensajes de error.
 */
public class VentanaEmergente {

  
    public void ventanaAtención(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Atención", JOptionPane.WARNING_MESSAGE);
    }

    
    public void ventanaGanador(String mensaje) {
        Icon o = new ImageIcon(getClass().getResource("/edu/avanzada/taller3/vista/ganador.png"));
        JOptionPane.showMessageDialog(null, mensaje, "Ganador ", JOptionPane.PLAIN_MESSAGE, o);
    }
    
    /**public void ventanaInformativa(String mensaje) {
         Icon o = new ImageIcon(getClass().getResource("/edu/avanzada/taller3/vista/jinete.png"));
        JOptionPane.showMessageDialog(null, mensaje, "Conteo Carreras ", JOptionPane.PLAIN_MESSAGE, o);
    }*/
}
