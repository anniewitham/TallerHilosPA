package Control;

import Modelo.Caballo;

public class ControlCaballo implements Runnable {
    private Caballo caballo;
    private boolean carreraEnCurso;
    private Runnable callback;  // Callback para informar al controlador principal sobre el cambio de posición

    public ControlCaballo(Caballo caballo, Runnable callback) {
        this.caballo = caballo;
        this.callback = callback;
        this.carreraEnCurso = true;
    }

    public void iniciarCarrera() {
        new Thread(this).start();
    }

    public void detenerCarrera() {
        this.carreraEnCurso = false;
    }

    @Override
    public void run() {
        while (carreraEnCurso && caballo.getPosicion() < 100) { 
            try {
                // Tiempo de espera aleatorio para cada movimiento
                int tiempoEspera = (int) (Math.random() * 800 + 200); // Espera entre 200 y 1000 ms
                Thread.sleep(tiempoEspera);

                // Avanza el caballo una posición y llama al callback para notificar del cambio
                caballo.setPosicion(caballo.getPosicion() + 1);
                callback.run();

                // Si el caballo llega a la meta, se detiene
                if (caballo.getPosicion() >= 100) {
                    detenerCarrera();
                }
            } catch (InterruptedException e) {
                detenerCarrera(); // Finaliza el hilo en caso de interrupción
            }
        }
    }
}

