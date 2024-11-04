package edu.avanzada.taller3.control;

import edu.avanzada.taller3.modelo.Caballo;
import edu.avanzada.taller3.vista.Carrera;
import edu.avanzada.taller3.vista.Nombres;
import edu.avanzada.taller3.vista.VentanaEmergente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase ControlPrincipal que gestiona la lógica de la carrera de caballos.
 * 
 * Esta clase actúa como controlador principal en el patrón MVC (Modelo-Vista-Controlador).
 * Se encarga de gestionar la interacción entre las vistas (Carrera y Nombres),
 * los hilos que representan a los caballos en la carrera, y el semáforo que controla el inicio de la carrera.
 */
public class ControlPrincipal implements ActionListener {

    // Vistas y controladores necesarios
    protected Carrera vistaCarrera;
    protected Nombres vistaNombres;
    protected SemaforoThread controlSemaforo;
    protected VentanaEmergente ventanaEmergente;
    protected ControlCaballos controlCaballos;
    
    // Hilos que representan a los caballos
    private CaballoThread caballo1;
    private CaballoThread caballo2;
    private CaballoThread caballo3;
    
    // Estado de la carrera
    private boolean hayCarrera;
    private Caballo caballoGanador; // Caballo que ganó la carrera
    private ArrayList<CaballoThread> hilos; // Lista de hilos de caballos

    /**
     * Constructor de la clase ControlPrincipal.
     * Inicializa las vistas y los controladores, y configura los eventos de los botones.
     * 
     * @throws IOException si ocurre un error al inicializar las vistas o los controladores.
     */
    public ControlPrincipal() throws IOException {
        ventanaEmergente = new VentanaEmergente(); // Crea la ventana para mensajes emergentes

        // Inicializa la vista de la carrera y los botones
        vistaCarrera = new Carrera(this);
        vistaCarrera.botonEmpezar1.addActionListener(this);
        vistaCarrera.botonInterrumpir.addActionListener(this);
        vistaCarrera.botonSalir.addActionListener(this);
        vistaCarrera.botonSalir.setActionCommand("Salir");

        // Inicializa la vista de nombres y sus botones
        vistaNombres = new Nombres(this);
        vistaNombres.botonContinuar.addActionListener(this);
        vistaNombres.botonSalir.addActionListener(this);
        vistaNombres.botonSalir.setActionCommand("Salir");
        vistaNombres.setVisible(true); // Muestra la vista de nombres

        controlCaballos = new ControlCaballos(this); // Crea el controlador de caballos

        // Inicializa el estado de la carrera
        hayCarrera = false;
        caballoGanador = null; // No hay caballo ganador al inicio
        hilos = new ArrayList<>(); // Inicializa la lista de hilos
    }

    /**
     * Maneja los eventos de los botones de la vista.
     * 
     * @param e el evento de acción que contiene información sobre la acción del usuario.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Manejo de eventos según el comando de acción recibido.
        switch (e.getActionCommand()) {
            case "Salir":
                // Verifica si no hay una carrera en curso antes de salir.
                if (!hayCarrera) {
                    if (caballoGanador != null) {
                        mostrarCaballoGanador(); // Muestra al caballo ganador, si hay uno.
                    }
                    System.exit(0); // Cierra la aplicación.
                } else {
                    // Muestra una advertencia si hay una carrera en curso.
                    ventanaEmergente.ventanaAtención("¡Hay una carrera en curso!");
                }
                break;
            case "Empezar Carrera":
                // Reinicia el estado y posiciones antes de comenzar una nueva carrera.
                hilos.clear();
                hayCarrera = true; // Indica que hay una carrera en curso.
                reiniciarPosiciones(); // Reinicia las posiciones de los caballos.
                controlSemaforo = new SemaforoThread(this); // Crea un nuevo hilo para el semáforo.
                controlSemaforo.start(); // Inicia el semáforo.

                // Crea y comienza los hilos para cada caballo.
                caballo1 = new CaballoThread(this, 1);
                caballo2 = new CaballoThread(this, 2);
                caballo3 = new CaballoThread(this, 3);
                caballo1.start();
                caballo2.start();
                caballo3.start();
                hilos.add(caballo1); // Agrega los hilos de los caballos a la lista.
                hilos.add(caballo2);
                hilos.add(caballo3);
                break;
            case "Continuar":
                // Intenta agregar un nuevo caballo y mostrar la vista de carrera si tiene éxito.
                if (controlCaballos.agregarCaballo()) {
                    vistaNombres.dispose(); // Cierra la ventana de nombres.
                    vistaCarrera.setVisible(true); // Muestra la vista de la carrera.
                }
                break;
            case "Interrumpir":
                // Maneja la interrupción de caballos si hay una carrera en curso.
                if (hayCarrera) {
                    int interrumpidos = 0; // Contador de caballos interrumpidos.

                    // Verifica cuántos caballos están interrumpidos.
                    for (Caballo caballo : controlCaballos.getCaballos()) {
                        if (caballo.isInterrumpido()) {
                            interrumpidos++; // Aumenta el contador si el caballo está interrumpido.
                        }
                    }

                    // Si los tres caballos están interrumpidos.
                    if (interrumpidos == 3) {
                        for (CaballoThread hilo : hilos) {
                            hilo.interrupt(); // Interrumpe todos los hilos de los caballos.
                        }
                        // Informa al usuario que la carrera ha terminado.
                        ventanaEmergente.ventanaAtención("¡La carrera ha terminado porque todos los caballos han sido interrumpidos!");
                        hayCarrera = false; // Marca que la carrera ha terminado.
                    } else {
                        // Si no todos los caballos están interrumpidos, interrumpe uno al azar.
                        int x;
                        do {
                            x = (int) (Math.random() * 3); // Selecciona un caballo al azar.
                        } while (controlCaballos.getCaballos().get(x).isInterrumpido()); // Asegura que el caballo no esté ya interrumpido.
                        
                        hilos.get(x).interrupt(); // Interrumpe el hilo del caballo seleccionado.
                        controlCaballos.getCaballos().get(x).setInterrumpido(true); // Marca el caballo como interrumpido.
                        // Informa al usuario sobre la interrupción del caballo.
                        ventanaEmergente.ventanaAtención("El caballo número " + controlCaballos.getCaballos().get(x).getPosicion() + " (" + controlCaballos.getCaballos().get(x).getNombre() + ") ha sido interrumpido");
                    }
                }
                break;
        }
    }

    /**
     * Muestra al usuario el caballo ganador de la carrera.
     * 
     * Este método determina qué caballo ha ganado y muestra un mensaje emergente con la información del caballo ganador.
     */
    public void mostrarCaballoGanador() {
        int maxVictorias = 0;

        for (Caballo caballo : controlCaballos.getCaballos()) {
            if (caballo.getVictorias() > maxVictorias) {
                maxVictorias = caballo.getVictorias();
                caballoGanador = caballo; // Actualiza el caballo ganador.
            }
        }
        ventanaEmergente.ventanaGanador("¡El caballo número " + caballoGanador.getPosicion() + "(" + caballoGanador.getNombre() + ") fue el que obtuvo más victorias (" + maxVictorias + ")!");
    }

    /**
     * Reinicia las posiciones de todos los caballos a su estado inicial.
     * 
     * Este método se llama antes de comenzar una nueva carrera.
     */
    public void reiniciarPosiciones() {
        for (Caballo caballo : controlCaballos.getCaballos()) {
            caballo.setX(420); // Reinicia la posición del caballo.
            caballo.setInterrumpido(false); // Marca el caballo como no interrumpido.
        }
        CaballoThread.reiniciarCarrera(); // Reinicia la carrera.
    }

    /**
     * Establece el estado de la carrera.
     * 
     * @param hayCarrera indica si hay una carrera en curso.
     */
    public void setHayCarrera(boolean hayCarrera) {
        this.hayCarrera = hayCarrera; // Actualiza el estado de la carrera.
    }
}
