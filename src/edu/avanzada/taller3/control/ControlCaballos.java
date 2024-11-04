package edu.avanzada.taller3.control;

import edu.avanzada.taller3.modelo.Caballo;
import java.util.ArrayList;
import javax.swing.JTextField;

public class ControlCaballos {
    private ArrayList<Caballo> caballos;
    private ControlPrincipal control;

    public ControlCaballos(ControlPrincipal control) {
        this.control = control;
        this.caballos = new ArrayList<>();
    }

    public boolean agregarCaballo() {
        JTextField[] nombres = {
            control.vistaNombres.textNombre1,
            control.vistaNombres.textNombre2,
            control.vistaNombres.textNombre3
        };

        int[] posiciones = {10, 90, 160};

        for (JTextField nombre : nombres) {
            if (nombre.getText().trim().isEmpty()) {
                control.ventanaEmergente.ventanaAtención("Por favor, ingresa el nombre de todos los caballos");
                return false;
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            Caballo caballo = new Caballo(nombres[i].getText(), posiciones[i], i+1);
            caballos.add(caballo);
        }
        return true;
    }

    public ArrayList<Caballo> getCaballos() {
        return caballos;
    }

    public void setCaballos(ArrayList<Caballo> caballos) {
        this.caballos = caballos;
        
    }
}
