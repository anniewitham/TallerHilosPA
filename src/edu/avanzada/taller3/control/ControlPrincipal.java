package edu.avanzada.taller3.control;

import edu.avanzada.taller3.vista.Carrera;
import edu.avanzada.taller3.vista.Nombres;
import edu.avanzada.taller3.vista.VentanaEmergente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControlPrincipal implements ActionListener {

    protected Carrera vistaCarrera;
    protected Nombres vistaNombres;
    private SemaforoThread controlSemaforo;
    protected VentanaEmergente ventanaEmergente;
    private ControlCaballos controlCaballos;

    public ControlPrincipal() throws IOException {
        ventanaEmergente = new VentanaEmergente();

        vistaCarrera = new Carrera(this);
        vistaCarrera.botonEmpezar1.addActionListener(this);
        vistaCarrera.botonInterrumpir.addActionListener(this);
        vistaCarrera.botonSalir.addActionListener(this);
        vistaCarrera.botonSalir.setActionCommand("Salir");
        vistaCarrera.botonTerminar.addActionListener(this);

        vistaNombres = new Nombres(this);
        vistaNombres.botonContinuar.addActionListener(this);
        vistaNombres.botonSalir.addActionListener(this);
        vistaNombres.botonSalir.setActionCommand("Salir");
        vistaNombres.setVisible(true);

        controlCaballos = new ControlCaballos(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Salir":
                System.exit(0);
                break;
            case "Empezar Carrera":
                controlSemaforo = new SemaforoThread(this);
                controlSemaforo.start();
                break;
            case "Continuar":
                if (controlCaballos.agregarCaballo()) {
                    vistaNombres.dispose();
                    vistaCarrera.setVisible(true);
                }
                break;
        }
    }
}
