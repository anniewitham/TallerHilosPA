package edu.avanzada.taller3.control;

import edu.avanzada.taller3.modelo.Caballo;

public class CaballoThread extends Thread {
    private Caballo caballo;

    public CaballoThread(String nombre, int y) {
        this.caballo = new Caballo(nombre, y);
    }

    @Override
    public void run() {
        /**while (!(caballo.isGanador())) { 
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
        }**/
    }
}

