package co.edu.uniquindio.poo;

public class VehiculoTransporteTropas extends VehiculoMilitar {
    private int capacidadLlevarTropas;

    public VehiculoTransporteTropas(String id, String modelo, int anioFabricacion, int kilometraje, EstadoOperativo estado, int capacidadLlevarTropas) {
        super(id, modelo, anioFabricacion, kilometraje, estado);
        this.capacidadLlevarTropas = capacidadLlevarTropas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehiculo de transporte: ID: " + getId() + ". Modelo: "
                + getModelo() + ". Año de fabricacion:" + getAnioFabricacion() +
                ". Kilometraje: " + getKilometraje() + ". Estado: " + getEstado() +
                ". Capacidad de soldados: " + capacidadLlevarTropas);
    }
}
