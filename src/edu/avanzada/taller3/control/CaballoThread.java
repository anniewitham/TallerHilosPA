package edu.avanzada.taller3.control;

import edu.avanzada.taller3.modelo.Caballo;
import javax.swing.SwingUtilities;

/**
 * La clase CaballoThread representa el hilo de ejecución de cada caballo en una
 * carrera. Controla el movimiento del caballo y verifica si ha ganado la carrera.
 *
 * @autor Ana Quintero, Juan Avila, Samuel Barrera
 */
public class CaballoThread extends Thread {

    private Caballo caballo;
    private ControlPrincipal control;
    private int numCaballo;

    /**
     * Constructor de la clase CaballoThread. Inicializa el caballo correspondiente
     * al número dado y actualiza la vista inicial del caballo en la carrera.
     *
     * @param control el controlador principal de la aplicación.
     * @param numCaballo el número del caballo en la carrera.
     */
    public CaballoThread(ControlPrincipal control, int numCaballo) {
        this.control = control;
        this.numCaballo = numCaballo;
        this.caballo = control.controlCaballos.getCaballos().get(numCaballo - 1);
        // Coloca al caballo en la posición inicial en la interfaz
        control.vistaCarrera.actualizarVistaCaballo(numCaballo, 420, caballo.getY());
    }

    /**
     * Método principal de ejecución del hilo, que mueve al caballo en la carrera.
     * Espera la señal del semáforo antes de comenzar, y luego avanza al caballo
     * hasta que haya un ganador global.
     */
    @Override
    public void run() {
        try {
            // Espera hasta que el semáforo esté en verde
            control.controlSemaforo.join();
            while (!hayGanadorGlobal()) {
                // Mueve al caballo y actualiza la vista de su posición
                mover(caballo);
                SwingUtilities.invokeLater(() -> control.vistaCarrera
                        .actualizarVistaCaballo(numCaballo, caballo.getX(), caballo.getY()));
                
                // Verifica si el caballo ha llegado a la meta y gana la carrera
                if (caballo.getX() <= 30 && marcarGanadorGlobal()) {
                    control.setHayCarrera(false);
                    caballo.setVictorias(caballo.getVictorias() + 1);
                    control.ventanaEmergente.ventanaGanador("¡El caballo número " 
                            + caballo.getPosicion() + " (" + caballo.getNombre() + ") ha ganado la carrera!");
                }
                Thread.sleep((long) (Math.random() * 2000 + 1)); // Pausa aleatoria entre movimientos
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Manejo de interrupción
        }
    }

    /**
     * Mueve al caballo hacia adelante en la carrera reduciendo su posición en el eje X.
     *
     * @param c el caballo a mover.
     */
    public synchronized void mover(Caballo c) {
        c.setX(c.getX() - 20); // Reduce el valor de X para simular avance
    }

    // Indicador estático para verificar si ya hay un ganador global
    private static volatile boolean ganadorGlobal = false;

    /**
     * Verifica si ya hay un ganador en la carrera.
     *
     * @return true si ya hay un ganador global, de lo contrario false.
     */
    public synchronized boolean hayGanadorGlobal() {
        return ganadorGlobal;
    }

    /**
     * Marca un ganador global en la carrera si aún no existe uno.
     *
     * @return true si el caballo logra marcarse como ganador, false si ya existe un ganador.
     */
    public synchronized boolean marcarGanadorGlobal() {
        if (!ganadorGlobal) {
            ganadorGlobal = true;
            return true;
        }
        return false;
    }

    /**
     * Reinicia el estado de la carrera, permitiendo que se pueda iniciar otra carrera
     * sin un ganador inicial.
     */
    public static synchronized void reiniciarCarrera() {
        ganadorGlobal = false;
    }
}
