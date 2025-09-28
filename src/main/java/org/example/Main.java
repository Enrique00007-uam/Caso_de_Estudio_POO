package org.example;


public class Main {

    public static void main(String[] args) {
        System.out.println("=== GESTOR DE FLOTA - PRUEBA ===\n");

        Vehiculo auto = new Automovil("Mercedes", "G63", 2019, 50.0);
        Vehiculo bici = new Bicicleta("Specialized", "Allez", 2021, 16);
        Vehiculo moto = new Motocicleta("Kawasaki", "Ninja", 2024, 1000, 18.5);

        System.out.println("--- INSPECCIÓN RÁPIDA DE VEHÍCULOS ---\n");

        System.out.println("COCHE DE PRUEBA:");
        auto.desplazar();
        System.out.println(auto.mostrarInfo());
        ((combustible) auto).repostar();
        System.out.println("Nivel de combustible: " + ((combustible) auto).verNivelCombustible());
        ((mantenimiento) auto).hacerRevision();

        System.out.println("\nBICI DE PRUEBA:");
        bici.desplazar();
        System.out.println(bici.mostrarInfo());

        System.out.println("\nMOTO DE PRUEBA:");
        moto.desplazar();
        System.out.println(moto.mostrarInfo());
        ((combustible) moto).repostar();
        System.out.println("Nivel de combustible: " + ((combustible) moto).verNivelCombustible());
        ((mantenimiento) moto).hacerRevision();

        Vehiculo[] vehiculos = {
                new Automovil("Opel", "Corsa", 2018, 38.0),
                new Bicicleta("Cannondale", "Synapse", 2020, 20),
                new Motocicleta("Ducati", "Panigale", 2022, 1100, 14.0),
                new Automovil("Mercedes", "s500", 2023, 55.0)
        };

        GestorVehiculos.gestionarFlota(vehiculos);

        System.out.println("\n=== FIN DE LA EJECUCIÓN ===");
    }
}

/*REFLEXIÓN ESCRITA:

El polimorfismo es clave para expandir el sistema de manejo de veículos. Usted trata distintas clases de
veículos igual usando la clase Vehículo principal. El código del cliente, por ejemplo, el metodo procesarVeículos,
no necesita saber detalles internos de cada uno. Añadir nuevos tipos de veículos, como una Motosicleta,
no requiere cambiar el código viejo. Interfaces como Combustible y Mantenimiento aseguran comportamientos
concretos. La herencia nos permite reusar código compartido. Está arquitectura simplifica el mantenimiento,
reduce repetición de código y da flexibilidad al sistema para futuros ajustes.
*/
