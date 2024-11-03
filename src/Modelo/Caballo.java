package Modelo;

/**
 * La clase Caballo representa un caballo en una carrera, con atributos como nombre, 
 * posición actual, número de victorias y estado de interrupción.
 * 
 * @autor Ana Quientero, Juan Avila, Samuel Barrera
 */
public class Caballo {
    private String nombre;
    private int posicion;
    private int victorias;
    private boolean interrumpido;

    /**
     * Obtiene el nombre del caballo.
     * 
     * @return el nombre del caballo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del caballo.
     * 
     * @param nombre el nombre a asignar al caballo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la posición actual del caballo en la carrera.
     * 
     * @return la posición actual del caballo.
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición del caballo en la carrera.
     * 
     * @param posicion la posición a asignar al caballo.
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     * Obtiene el número de victorias que ha conseguido el caballo.
     * 
     * @return el número de victorias del caballo.
     */
    public int getVictorias() {
        return victorias;
    }

    /**
     * Establece el número de victorias del caballo.
     * 
     * @param victorias el número de victorias a asignar al caballo.
     */
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    /**
     * Verifica si el caballo está interrumpido en la carrera.
     * 
     * @return true si el caballo está interrumpido, false en caso contrario.
     */
    public boolean isInterrumpido() {
        return interrumpido;
    }

    /**
     * Establece el estado de interrupción del caballo en la carrera.
     * 
     * @param interrumpido true para interrumpir al caballo, false en caso contrario.
     */
    public void setInterrumpido(boolean interrumpido) {
        this.interrumpido = interrumpido;
    }
}

