package edu.avanzada.taller3.control;

import edu.avanzada.taller3.modelo.Semaforo;
import java.awt.Color;

/**
 * La clase SemaforoThread simula el cambio de estados en un semáforo de forma
 * cíclica utilizando un hilo independiente. Alterna entre los colores rojo,
 * amarillo y verde, con pausas aleatorias entre cada cambio.
 *
 * @autor Ana Quintero, Juan Avila, Samuel Barrera
 */
public class SemaforoThread extends Thread {

    private Semaforo semaforo;
    private ControlPrincipal control;

    /**
     * Constructor de la clase SemaforoThread. Inicializa un nuevo semáforo y
     * establece el controlador principal para manejar la vista de la carrera.
     *
     * @param control el controlador principal del sistema.
     */
    public SemaforoThread(ControlPrincipal control) {
        this.semaforo = new Semaforo();
        this.control = control;
    }

    /**
     * Inicia la ejecución del hilo, simulando el cambio de colores del semáforo.
     * El ciclo se repite hasta que el semáforo esté en estado "verde".
     */
    @Override
    public void run() {
        // Reinicia el semáforo a su estado inicial
        actualizarSemaforo("reiniciar");
        
        // Ciclo de cambio de luces hasta que el semáforo esté en "verde"
        while (!semaforo.getEstado().equals("verde")) {
            try {
                actualizarSemaforo("rojo"); // Cambia a rojo
                Thread.sleep((long) (Math.random() * 5000 + 1000)); // Espera aleatoria
                actualizarSemaforo("amarillo"); // Cambia a amarillo
                Thread.sleep((long) (Math.random() * 5000 + 1000)); // Espera aleatoria
                actualizarSemaforo("verde"); // Cambia a verde
            } catch (InterruptedException e) {
                // Manejo de excepción en caso de interrupción del hilo
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * Actualiza el color del semáforo y cambia el estado visual en la interfaz
     * gráfica de acuerdo al color especificado.
     *
     * @param color el color al que se debe cambiar el semáforo ("rojo", "amarillo", "verde" o "reiniciar").
     */
    public void actualizarSemaforo(String color) {
        switch (color) {
            case "rojo":
                semaforo.setEstado(color);
                control.vistaCarrera.LuzRoja.setBackground(Color.red);
                break;
            case "amarillo":
                semaforo.setEstado(color);
                control.vistaCarrera.LuzRoja.setBackground(Color.white);
                control.vistaCarrera.LuzAmarilla.setBackground(Color.yellow);
                break;
            case "verde":
                semaforo.setEstado(color);
                control.vistaCarrera.LuzVerde.setBackground(Color.green);
                control.vistaCarrera.LuzAmarilla.setBackground(Color.white);
                break;
            case "reiniciar":
                semaforo.setEstado(color);
                control.vistaCarrera.LuzVerde.setBackground(Color.white);
                break;
        }
    }
}

