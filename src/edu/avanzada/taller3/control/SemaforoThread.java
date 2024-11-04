package edu.avanzada.taller3.control;

import edu.avanzada.taller3.modelo.Semaforo;
import java.awt.Color;

public class SemaforoThread extends Thread {

    private Semaforo semaforo;
    private ControlPrincipal control;

    public SemaforoThread(ControlPrincipal control) {
        this.semaforo = new Semaforo();
        this.control = control;
    }

    @Override
    public void run() {
        actualizarSemaforo("reiniciar");
        
        while (semaforo.getEstado() != "verde") {
            try {
                actualizarSemaforo("rojo");
                Thread.sleep((long) (Math.random() * 5000 + 1000));
                actualizarSemaforo("amarillo");
                Thread.sleep((long) (Math.random() * 5000 + 1000));
                actualizarSemaforo("verde");
            } catch (InterruptedException e) {
            }
        }
    }

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
