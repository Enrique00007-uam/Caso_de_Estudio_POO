package org.example;

public class Automovil extends Vehiculo implements combustible, mantenimiento {
    private double nivelCombustible;

    public Automovil(String marca, String modelo, int anio, double nivelCombustible) {
        super(marca, modelo, anio);
        this.nivelCombustible = nivelCombustible;
    }

    @Override
    public void desplazar() {
        if (nivelCombustible > 0) {
            System.out.println("El automóvil " + marca + " " + modelo + " está conduciendo.");
            nivelCombustible -= 0.5;
        } else {
            System.out.println("El automóvil " + marca + " " + modelo + " no tiene combustible.");
        }
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Combustible: " + nivelCombustible + " litros";
    }

    @Override
    public void repostar() {
        nivelCombustible = 50.0;
        System.out.println("El automóvil " + marca + " " + modelo + " ha sido recargado con combustible.");
    }

    @Override
    public double verNivelCombustible() {
        return nivelCombustible;
    }

    @Override
    public void hacerRevision() {
        System.out.println("Revisando motor del automóvil " + marca + " " + modelo);
    }
}