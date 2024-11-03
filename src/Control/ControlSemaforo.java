package Control;

import Modelo.Semaforo;

public class ControlSemaforo implements Runnable {
    private Semaforo semaforo;
    private Runnable callback;

    public ControlSemaforo(Semaforo semaforo, Runnable callback) {
        this.semaforo = semaforo;
        this.callback = callback;
    }

    public void iniciarSemaforo() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            actualizarEstado("rojo");
            Thread.sleep((long) (Math.random() * 2000 + 1000));

            actualizarEstado("amarillo");
            Thread.sleep((long) (Math.random() * 2000 + 1000));

            actualizarEstado("verde");
        } catch (InterruptedException e) {
            // Finaliza el hilo si es interrumpido
        }
    }

    private void actualizarEstado(String estado) {
        semaforo.setEstado(estado);
        callback.run(); // Llama al callback para que el controlador principal actualice la vista si es necesario
    }
}

