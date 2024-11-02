package Control;

import Modelo.Semaforo;

import Vista.Carrera;
import Vista.Nombres;
import Vista.VentanaEmergente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Control implements ActionListener {

    private Carrera carrera;
    private Semaforo semaforo;
    private Carrera vistaCarrera;
    private Nombres vistaNombres;
   
    private VentanaEmergente ventanaEmergente;

    public Control() throws IOException {
        ventanaEmergente = new VentanaEmergente();

        vistaCarrera = new Carrera(this);
        vistaCarrera.botonEmpezar1.addActionListener(this);
        vistaCarrera.botonInterrumpir.addActionListener(this);
        vistaCarrera.botonSalir.addActionListener(this);
        vistaCarrera.botonTerminar.addActionListener(this);

        vistaNombres = new Nombres(this);
        vistaNombres.botonContinuar.addActionListener(this);
   
        vistaNombres.botonSalir.addActionListener(this);
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
