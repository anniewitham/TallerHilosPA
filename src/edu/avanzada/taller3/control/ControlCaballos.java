package edu.avanzada.taller3.control;

import edu.avanzada.taller3.modelo.Caballo;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 * La clase ControlCaballos gestiona la creación y almacenamiento de caballos para
 * la carrera. Permite agregar caballos y obtener la lista de caballos creados.
 *
 * @autor Ana Quintero, Juan Avila, Samuel Barrera
 */
public class ControlCaballos {
    
    private ArrayList<Caballo> caballos;
    private ControlPrincipal control;

    /**
     * Constructor de la clase ControlCaballos. Inicializa la lista de caballos
     * y asigna el controlador principal para la gestión de la carrera.
     *
     * @param control el controlador principal del sistema.
     */
    public ControlCaballos(ControlPrincipal control) {
        this.control = control;
        this.caballos = new ArrayList<>();
    }

    /**
     * Agrega caballos a la lista usando los nombres ingresados en la interfaz de usuario.
     * Valida que todos los campos de nombre estén completos antes de crear los caballos.
     *
     * @return true si todos los nombres se ingresaron correctamente y los caballos se agregaron,
     *         false si falta algún nombre.
     */
    public boolean agregarCaballo() {
        // Campos de texto para los nombres de los caballos en la interfaz
        JTextField[] nombres = {
            control.vistaNombres.textNombre1,
            control.vistaNombres.textNombre2,
            control.vistaNombres.textNombre3
        };

        // Posiciones iniciales en el eje Y para cada caballo
        int[] posiciones = {10, 90, 160};

        // Verifica que todos los nombres de caballos estén ingresados
        for (JTextField nombre : nombres) {
            if (nombre.getText().trim().isEmpty()) {
                control.ventanaEmergente.ventanaAtención("Por favor, ingresa el"
                        + " nombre de todos los caballos");
                return false;
            }
        }

        // Crea los caballos y los agrega a la lista
        for (int i = 0; i < nombres.length; i++) {
            Caballo caballo = new Caballo(nombres[i].getText(), posiciones[i], i + 1);
            caballos.add(caballo);
        }
        return true;
    }

    /**
     * Obtiene la lista de caballos creados para la carrera.
     *
     * @return una lista de objetos Caballo.
     */
    public ArrayList<Caballo> getCaballos() {
        return caballos;
    }

    /**
     * Establece una nueva lista de caballos.
     *
     * @param caballos la nueva lista de caballos a asignar.
     */
    public void setCaballos(ArrayList<Caballo> caballos) {
        this.caballos = caballos;
    }
}

