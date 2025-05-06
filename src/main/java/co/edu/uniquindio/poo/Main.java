package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear batallón
        Batallon batallon = new Batallon();

        // Crear vehículos
        VehiculoBlindado blindado = new VehiculoBlindado("VB001", "Tanque Abrams", 2012, 15000, EstadoOperativo.DISPONIBLE, 75);
        VehiculoApoyo apoyo = new VehiculoApoyo("VA001", "Vehículo Médico", 2016, 9000, EstadoOperativo.EN_MANTENIMIENTO, TipoFuncion.MEDICO);
        VehiculoTransporteTropas transporte = new VehiculoTransporteTropas("VT001", "Camión Tropa", 2018, 7000, EstadoOperativo.DISPONIBLE, 12);

        // Registrar vehículos en el batallón
        batallon.registrarVehiculoMilitar(blindado);
        batallon.registrarVehiculoMilitar(apoyo);
        batallon.registrarVehiculoMilitar(transporte);

        // Crear soldados
        Soldado soldado1 = new Soldado("Carlos Gómez", "Sargento", "S001");
        Soldado soldado2 = new Soldado("María Ruiz", "Teniente", "S002");

        // Registrar soldados en el batallón
        batallon.registrarSoldado(soldado1);
        batallon.registrarSoldado(soldado2);

        // Crear misión con los soldados y vehículos creados
        List<Soldado> soldadosMision = new ArrayList<>();
        soldadosMision.add(soldado1);
        soldadosMision.add(soldado2);

        List<VehiculoMilitar> vehiculosMision = new ArrayList<>();
        vehiculosMision.add(blindado);
        vehiculosMision.add(transporte);

        Mision mision = new Mision("M001", LocalDate.now(), "Zona Alfa", soldadosMision, vehiculosMision);

        // Registrar misión en el batallón
        String resultado = batallon.registrarMision(mision);
        System.out.println("\n" + resultado);

        // Mostrar estado completo del batallón
        System.out.println("\n== Estado del Batallón ==");
        System.out.println(batallon);
    }
}
