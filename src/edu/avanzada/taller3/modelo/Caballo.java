package edu.avanzada.taller3.modelo;

/**
 * La clase Caballo representa un caballo en una carrera, con atributos como nombre, 
 * posición actual, número de victorias y estado de interrupción.
 * 
 * @autor Ana Quientero, Juan Avila, Samuel Barrera
 */
public class Caballo {
    private String nombre;
    private int x;
    private int y;
    private int victorias;
    private boolean interrumpido;
    private boolean ganador;

    public Caballo(String nombre, int y) {
        this.nombre = nombre;
        this.x = 420;
        this.y = y;
        this.victorias = 0;
        this.interrumpido = true;
        this.ganador = false;
    }

    public Caballo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    /**
     * Obtiene la posición actual del caballo en la carrera.
     * 
     * @return la posición actual del caballo.
     */
    public void setY(int y) {
        this.y = y;
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

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }
    
    
}

