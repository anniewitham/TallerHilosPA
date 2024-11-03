package edu.avanzada.taller3.modelo;

/**
 * La clase Semaforo representa el semaforo que da inicio a la carrera.
 * 
 * @author Ana Quientero, Juan Avila, Samuel Barrera.
 */
public class Semaforo {
    private String estado;

    /**
     * Obtiene el estado actual del semáforo.
     * 
     * @return el estado actual del semáforo, que puede ser, por ejemplo, "rojo", "verde" o "amarillo".
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del semáforo.
     * 
     * @param estado el nuevo estado del semáforo, que puede ser "rojo", "verde" o "amarillo".
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}

