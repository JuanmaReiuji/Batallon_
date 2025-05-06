package co.edu.uniquindio.poo;

public class VehiculoBlindado extends VehiculoMilitar {
    private int blindaje;

    public VehiculoBlindado(String id, String modelo, int anioFabricacion, int kilometraje, EstadoOperativo estado, int blindaje) {
        super(id, modelo, anioFabricacion, kilometraje, estado);
        this.blindaje = blindaje;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehiculo blindado: ID: " + getId() + ". Modelo: "
                + getModelo() + ". Año de fabricacion:" + getAnioFabricacion() +
                ". Kilometraje: " + getKilometraje() + ". Estado: " + getEstado() +
                ". Nivel de blindaje: " + blindaje + "%");
    }
}
