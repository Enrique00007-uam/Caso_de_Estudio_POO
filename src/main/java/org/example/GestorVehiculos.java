package org.example;

public class GestorVehiculos {

    public static void gestionarFlota(Vehiculo[] vehiculos) {
        System.out.println("\n=== GESTIONANDO FLOTA ===");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("\n--- Inspeccionando vehículo ---");

            vehiculo.desplazar();
            System.out.println(vehiculo.mostrarInfo());

            if (vehiculo instanceof combustible c) {
                System.out.println("Nivel de combustible actual: " + c.verNivelCombustible() + " litros");
                c.repostar();
            }

            if (vehiculo instanceof mantenimiento m) {
                m.hacerRevision();
            }
        }
    }
}