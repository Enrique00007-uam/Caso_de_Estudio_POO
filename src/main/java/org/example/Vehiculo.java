package org.example;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public abstract void desplazar();

    public String mostrarInfo() {
        return "Vehículo: " + marca + " " + modelo + " (" + anio + ")";
    }
}