package co.edu.uniquindio.poo;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class Batallon {
    private List<VehiculoMilitar> listaVehiculos;
    private List<Mision> listaMisiones;
    private List<Soldado> listaSoldados;

    public Batallon() {
        this.listaVehiculos = new ArrayList<>();
        this.listaMisiones = new ArrayList<>();
        this.listaSoldados = new ArrayList<>();
    }

    public List<VehiculoMilitar> getListaVehiculos() {
        return listaVehiculos;
    }

    public List<Mision> getListaMisiones() {
        return listaMisiones;
    }

    public List<Soldado> getListaSoldados() {
        return listaSoldados;
    }

    @Override
    public String toString() {
        return "Batallón:\n" +
                "Vehículos: " + listaVehiculos.size() + "\n" +
                "Misiones: " + listaMisiones.size() + "\n" +
                "Soldados: " + listaSoldados.size();
    }

    // ---------- Vehículos ----------
    public void cambiarEstadoVehiculo(String id, EstadoOperativo estado) {
        for (VehiculoMilitar aux : listaVehiculos) {
            if (aux.getId().equals(id)) {
                aux.setEstado(estado);
                return;
            }
        }
    }

    public List<VehiculoMilitar> obtenerVehiculosReemplazables() {
        List<VehiculoMilitar> vehiculosReemplazables = new ArrayList<>();
        for (VehiculoMilitar aux : listaVehiculos) {
            if (aux.getMisionesCompletas() > 50) {
                vehiculosReemplazables.add(aux);
            }
        }
        return vehiculosReemplazables;
    }

    public String registrarVehiculoMilitar(VehiculoMilitar nuevoVehiculo) {
        Optional<VehiculoMilitar> optionalVehiculo = buscarVehiculoMilitar(nuevoVehiculo.getId());
        if (optionalVehiculo.isPresent()) {
            return "El vehículo ya está registrado";
        } else {
            listaVehiculos.add(nuevoVehiculo);
            return "Vehículo registrado exitosamente";
        }
    }

    public VehiculoMilitar buscarVehiculoMasMisiones() {
        VehiculoMilitar mayorVehiculo = null;
        int mayor = -1;
        for (VehiculoMilitar aux : listaVehiculos) {
            if (aux.getMisionesCompletas() > mayor) {
                mayor = aux.getMisionesCompletas();
                mayorVehiculo = aux;
            }
        }
        return mayorVehiculo;
    }

    private Optional<VehiculoMilitar> buscarVehiculoMilitar(String id) {
        return listaVehiculos.stream().filter(v -> v.getId().equals(id)).findFirst();
    }

    // ---------- Misiones ----------
    public String registrarMision(Mision nuevaMision) {
        Optional<Mision> optionalMision = buscarMision(nuevaMision.getIdMision());
        if (optionalMision.isPresent()) {
            return "La misión ya está registrada";
        } else {
            listaMisiones.add(nuevaMision);
            return "Misión registrada exitosamente";
        }
    }

    private Optional<Mision> buscarMision(String idMision) {
        return listaMisiones.stream().filter(m -> m.getIdMision().equals(idMision)).findFirst();
    }

    // ---------- Soldados ----------
    public String registrarSoldado(Soldado nuevoSoldado) {
        Optional<Soldado> optionalSoldado = buscarSoldado(nuevoSoldado.getNombre());
        if (optionalSoldado.isPresent()) {
            return "El soldado ya está registrado";
        } else {
            listaSoldados.add(nuevoSoldado);
            return "Soldado registrado exitosamente";
        }
    }

    private Optional<Soldado> buscarSoldado(String nombre) {
        return listaSoldados.stream().filter(s -> s.getNombre().equals(nombre)).findFirst();
    }

    public void mostrarSoldados() {
        if (listaSoldados.isEmpty()) {
            System.out.println("No hay soldados registrados.");
        } else {
            System.out.println("Soldados del batallón:");
            for (Soldado s : listaSoldados) {
                System.out.println("- " + s);
            }
        }
    }
}
