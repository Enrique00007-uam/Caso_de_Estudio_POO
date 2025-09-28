package org.example;

public class Motocicleta extends Vehiculo implements combustible, mantenimiento {
    private int cilindrada;
    private double nivelCombustible;

    public Motocicleta(String marca, String modelo, int anio, int cilindrada, double nivelCombustible) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
        this.nivelCombustible = nivelCombustible;
    }

    @Override
    public void desplazar() {
        if (nivelCombustible > 0) {
            System.out.println("La motocicleta " + marca + " " + modelo + " está acelerando con " + cilindrada + " cc.");
            nivelCombustible -= 0.3;
        } else {
            System.out.println("La motocicleta " + marca + " " + modelo + " no tiene combustible.");
        }
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Cilindrada: " + cilindrada + " cc, Combustible: " + nivelCombustible + " litros";
    }

    @Override
    public void repostar() {
        nivelCombustible = 20.0;
        System.out.println("La motocicleta " + marca + " " + modelo + " ha sido recargada con combustible.");
    }

    @Override
    public double verNivelCombustible() {
        return nivelCombustible;
    }

    @Override
    public void hacerRevision() {
        System.out.println("Cambiando aceite de la motocicleta " + marca + " " + modelo);
    }
}
