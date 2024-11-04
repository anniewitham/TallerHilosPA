package edu.avanzada.taller3.control;

import edu.avanzada.taller3.modelo.Caballo;
import javax.swing.SwingUtilities;

public class CaballoThread extends Thread {

    private Caballo caballo;
    private ControlPrincipal control;
    private int numCaballo;

    public CaballoThread(ControlPrincipal control, int numCaballo) {
        this.control = control;
        this.numCaballo = numCaballo;
        this.caballo = control.controlCaballos.getCaballos().get(numCaballo-1);
        control.vistaCarrera.actualizarVistaCaballo(numCaballo,420,
                caballo.getY());
    }

    @Override
    public void run() {
        try {
            control.controlSemaforo.join();
            while (!hayGanadorGlobal()) {
                mover(caballo);
                SwingUtilities.invokeLater(() -> control.vistaCarrera.
                        actualizarVistaCaballo(numCaballo, caballo.getX(),
                                caballo.getY()));
                if (caballo.getX() <= 30 && marcarGanadorGlobal()) {
                    control.setHayCarrera(false);
                    caballo.setVictorias(caballo.getVictorias() + 1);
                    control.ventanaEmergente.ventanaGanador("¡El caballo número"
                            + " "+caballo.getPosicion()+" ("+caballo.getNombre()
                            +") ha ganado la carrera!");
                }
                Thread.sleep((long) (Math.random() * 2000 + 1));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void mover(Caballo c) {
        c.setX(c.getX() - 20);
    }

    private static volatile boolean ganadorGlobal = false;

    public synchronized boolean hayGanadorGlobal() {
        return ganadorGlobal;
    }

    public synchronized boolean marcarGanadorGlobal() {
        if (!ganadorGlobal) {
            ganadorGlobal = true;
            return true;
        }
        return false;
    }

    public static synchronized void reiniciarCarrera() {
        ganadorGlobal = false;
    }
}