package co.edu.uniquindio.poo;

import java.util.List;
import java.util.ArrayList;

public abstract class VehiculoMilitar {
    private String id;
    private String modelo;
    private int anioFabricacion;
    private int kilometraje;
    private EstadoOperativo estado;
    private int misionesCompletas;
    private List<Mision> listaMisiones;

    public VehiculoMilitar(String id, String modelo, int anioFabricacion, int kilometraje,
                           EstadoOperativo estado) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.misionesCompletas = 0;
        this.listaMisiones = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public int getMisionesCompletas() {
        return misionesCompletas;
    }

    public EstadoOperativo getEstado() {
        return estado;
    }

    public void setEstado(EstadoOperativo estado) {
        this.estado = estado;
    }

    public abstract void mostrarInfo();

    public void asignarMision(Mision nuevaMision) {
        if (!listaMisiones.contains(nuevaMision)) {
            listaMisiones.add(nuevaMision);
            misionesCompletas++;
        }
    }

    @Override
    public String toString() {
        return modelo + " (" + id + "), Misiones: " + misionesCompletas + ", Estado: " + estado;
    }
}

