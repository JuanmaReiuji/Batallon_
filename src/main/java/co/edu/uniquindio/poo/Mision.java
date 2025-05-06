package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Mision {
    private String idMision;
    private LocalDate fecha;
    private String ubicacion;
    private List<Soldado> soldadosAsignados;
    private List<VehiculoMilitar> vehiculosAsignados;

    public Mision(String idMision, LocalDate fecha, String ubicacion,
                  List<Soldado> soldadosAsignados, List<VehiculoMilitar> vehiculosAsignados) {
        this.idMision = idMision;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.soldadosAsignados = new ArrayList<>(soldadosAsignados);
        this.vehiculosAsignados = new ArrayList<>(vehiculosAsignados);
    }

    public String getIdMision() {
        return idMision;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Soldado> getSoldadosAsignados() {
        return soldadosAsignados;
    }

    public List<VehiculoMilitar> getVehiculosAsignados() {
        return vehiculosAsignados;
    }

    public void asignarSoldado(Soldado nuevoSoldado) {
        if (!soldadosAsignados.contains(nuevoSoldado)) {
            soldadosAsignados.add(nuevoSoldado);
            nuevoSoldado.asignarMision(this);
        }
    }

    public void asignarVehiculo(VehiculoMilitar nuevoVehiculo) {
        if (!vehiculosAsignados.contains(nuevoVehiculo)) {
            vehiculosAsignados.add(nuevoVehiculo);
            nuevoVehiculo.asignarMision(this);
        }
    }

    @Override
    public String toString() {
        return "Misión: " + idMision + ", Fecha: " + fecha +
                ", Ubicación: " + ubicacion +
                ", Soldados: " + soldadosAsignados +
                ", Vehículos: " + vehiculosAsignados;
    }
}


