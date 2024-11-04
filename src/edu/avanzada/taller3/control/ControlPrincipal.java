package edu.avanzada.taller3.control;

import edu.avanzada.taller3.modelo.Caballo;
import edu.avanzada.taller3.vista.Carrera;
import edu.avanzada.taller3.vista.Nombres;
import edu.avanzada.taller3.vista.VentanaEmergente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class ControlPrincipal implements ActionListener {

    protected Carrera vistaCarrera;
    protected Nombres vistaNombres;
    protected SemaforoThread controlSemaforo;
    protected VentanaEmergente ventanaEmergente;
    protected ControlCaballos controlCaballos;
    private CaballoThread caballo1;
    private CaballoThread caballo2;
    private CaballoThread caballo3;
    private boolean hayCarrera;
    private Caballo caballoGanador;
    private ArrayList<CaballoThread> hilos;

    public ControlPrincipal() throws IOException {
        ventanaEmergente = new VentanaEmergente();

        vistaCarrera = new Carrera(this);
        vistaCarrera.botonEmpezar1.addActionListener(this);
        vistaCarrera.botonInterrumpir.addActionListener(this);
        vistaCarrera.botonSalir.addActionListener(this);
        vistaCarrera.botonSalir.setActionCommand("Salir");

        vistaNombres = new Nombres(this);
        vistaNombres.botonContinuar.addActionListener(this);
        vistaNombres.botonSalir.addActionListener(this);
        vistaNombres.botonSalir.setActionCommand("Salir");
        vistaNombres.setVisible(true);

        controlCaballos = new ControlCaballos(this);

        hayCarrera = false;
        caballoGanador = null;
        hilos = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Salir":
                if (!hayCarrera) {
                    if (caballoGanador != null) {
                        mostrarCaballoGanador();
                    }
                    System.exit(0);
                } else {
                    ventanaEmergente.ventanaAtención("¡Hay una carrera en curso!");
                }
                break;
            case "Empezar Carrera":
                hilos.clear();
                hayCarrera = true;
                reiniciarPosiciones();
                controlSemaforo = new SemaforoThread(this);
                controlSemaforo.start();
                caballo1 = new CaballoThread(this, 1);
                caballo2 = new CaballoThread(this, 2);
                caballo3 = new CaballoThread(this, 3);
                caballo1.start();
                caballo2.start();
                caballo3.start();
                hilos.add(caballo1);
                hilos.add(caballo2);
                hilos.add(caballo3);
                break;
            case "Continuar":
                if (controlCaballos.agregarCaballo()) {
                    vistaNombres.dispose();
                    vistaCarrera.setVisible(true);
                }
                break;
            case "Interrumpir":
                if (hayCarrera) {
                    int x;
                    do {
                        x = (int) (Math.random() * 3);
                    } while (controlCaballos.getCaballos().get(x).isInterrumpido());
                    hilos.get(x).interrupt();
                    controlCaballos.getCaballos().get(x).setInterrumpido(true);
                    ventanaEmergente.ventanaAtención("El caballo número " + controlCaballos.getCaballos().get(x).getPosicion() + " (" + controlCaballos.getCaballos().get(x).getNombre() + ") ha sido interrumpido");
                }
                break;

        }
    }

    public void mostrarCaballoGanador() {
        int maxVictorias = 0;

        for (Caballo caballo : controlCaballos.getCaballos()) {
            if (caballo.getVictorias() > maxVictorias) {
                maxVictorias = caballo.getVictorias();
                caballoGanador = caballo;
            }
        }
        ventanaEmergente.ventanaGanador("¡El caballo número " + caballoGanador.getPosicion() + "(" + caballoGanador.getNombre() + ") fue el que obtuvo mas vitorias (" + maxVictorias + ")!");
    }

    public void reiniciarPosiciones() {
        for (Caballo caballo : controlCaballos.getCaballos()) {
            caballo.setX(420);
            caballo.setInterrumpido(false);
        }
        CaballoThread.reiniciarCarrera();
    }

    public void setHayCarrera(boolean hayCarrera) {
        this.hayCarrera = hayCarrera;
    }
}
