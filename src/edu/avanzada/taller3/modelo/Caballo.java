package edu.avanzada.taller3.modelo;

/**
 * La clase Caballo representa un caballo en una carrera, con atributos como
 * nombre, posición actual, número de victorias y estado de interrupción.
 *
 * @autor Ana Quintero, Juan Avila, Samuel Barrera
 */
public class Caballo {

    private String nombre;
    private int x; 
    private int y; 
    private int victorias; 
    private boolean interrumpido; 
    private int posicion; 

    /**
     * Constructor de la clase Caballo. Inicializa el caballo con el nombre,
     * posición en Y y número de posición asignado en la carrera.
     *
     * @param nombre el nombre del caballo.
     * @param y la posición en Y del caballo en la interfaz gráfica.
     * @param posicion la posición del caballo en la carrera.
     */
    public Caballo(String nombre, int y, int posicion) {
        this.nombre = nombre;
        this.x = 420; // Posición inicial en el eje X
        this.y = y;
        this.victorias = 0;
        this.interrumpido = false;
        this.posicion = posicion;
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

    /**
     * Obtiene la posición en el eje X del caballo.
     *
     * @return la posición X del caballo.
     */
    public int getX() {
        return x;
    }

    /**
     * Establece la posición en el eje X del caballo.
     *
     * @param x la nueva posición en X del caballo.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Obtiene la posición en el eje Y del caballo.
     *
     * @return la posición Y del caballo.
     */
    public int getY() {
        return y;
    }

    /**
     * Establece la posición en el eje Y del caballo.
     *
     * @param y la nueva posición en Y del caballo.
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

    /**
     * Obtiene la posición del caballo en la carrera.
     *
     * @return la posición del caballo en la carrera.
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * Establece la posición del caballo en la carrera.
     *
     * @param posicion la nueva posición del caballo en la carrera.
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
