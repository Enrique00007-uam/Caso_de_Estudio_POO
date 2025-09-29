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

Análisis del Código Base

- Explicar cómo se utiliza la herencia en las clases `Automovil` y `Bicicleta`.
1. La herencia y el polimorfismo definen la estructura. Automovil y Bicicleta extienden a Vehiculo.
Ambas clases heredan los atributos marca, modelo, y anio. Es posible sobrescribir el método mostrarInfo().
Las clases deben implementar obligatoriamente el método desplazar() debido a que es abstracto.

- Identificar dónde se aplica el polimorfismo en el método `mover()` y `obtenerDetalles()`.
2. El polimorfismo permite que el método desplazar() tenga una implementación única para cada subclase.
Cada clase puede sobrescribir mostrarInfo() para añadir datos concretos.
Se manejan objetos de distintos tipos de forma uniforme usando la referencia Vehiculo.

- Describir el uso de la palabra clave `super` en el código y su propósito.
3. El uso de super resulta esencial. Con super(marca, modelo, anio), se llama al constructor de la clase superior.
Con super.mostrarInfo(), se ejecuta el método de la clase superior antes de añadir más detalles.
 Esto reusa y extiende el código de la clase padre.

- Explicar el rol de la interfaz `Combustible` y por qué solo `Automovil` la implementa.
4. La interfaz Combustible establece un contrato para veículos que usan combustible.
Solo Automovil la implementa; Bicicleta no requiere combustible. Esta interfaz asegura que los vehículos
 motorizados tengan métodos para repostar y verificar el nivel.


Reflexión Escrita

El polimorfismo es algo muy importante para expandir el sistema de manejo de veículos. En el codigo tenemos  distintas clases de
veículos igual usando la clase Vehículo principal. En el código del cliente, por ejemplo, el metodo procesarVeículos,
no necesita saber detalles internos de cada uno para funcionar correctamente. Añadir nuevos tipos de veículos, como una Motosicleta o un carro,
no requiere cambiar el código viejo. Interfaces como ep Combustible y Mantenimiento aseguran comportamientos
concretos. La herencia nos permite reusar el código compartido. Está arquitectura simplifica el mantenimiento,
reduce repetición de código y da flexibilidad al sistema para futuros ajustes.
*/
