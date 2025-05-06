package co.edu.uniquindio.poo;

public class VehiculoApoyo extends VehiculoMilitar {
    private TipoFuncion funcion;

    public VehiculoApoyo(String id, String modelo, int anioFabricacion, int kilometraje, EstadoOperativo estado, TipoFuncion funcion) {
        super(id, modelo, anioFabricacion, kilometraje, estado);
        this.funcion = funcion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehiculo de apoyo: ID: " + getId() + ". Modelo: "
                + getModelo() + ". Año de fabricacion:" + getAnioFabricacion() +
                ". Kilometraje: " + getKilometraje() + ". Estado: " + getEstado() +
                ". Función: " + funcion);
    }
}
