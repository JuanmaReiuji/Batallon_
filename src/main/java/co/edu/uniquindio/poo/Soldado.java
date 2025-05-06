package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Soldado {
    private String nombre;
    private String rango;
    private String id;
    private List<Mision> misMisiones;

    public Soldado(String nombre, String rango, String id) {
        this.nombre = nombre;
        this.rango = rango;
        this.id = id;
        this.misMisiones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getRango() {
        return rango;
    }

    public String getId() {
        return id;
    }

    public List<Mision> getMisMisiones() {
        return misMisiones;
    }

    public void asignarMision(Mision mision) {
        if (!misMisiones.contains(mision)) {
            misMisiones.add(mision);
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + rango + ")";
    }
}
