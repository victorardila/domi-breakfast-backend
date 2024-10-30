package com.example.Desayuno.Domains;

public class Bebida {
    protected String Nombre;
    protected double Volumen;
    protected String Temperatura;
    protected String Tipo;
    protected String Endulzante;
    protected double Precio;

    public Bebida() {
    }

    public Bebida(String nombre, double volumen, String temperatura, String tipo, String endulzante, double precio) {
        Nombre = nombre;
        Volumen = volumen;
        Temperatura = temperatura;
        Tipo = tipo;
        Endulzante = endulzante;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getVolumen() {
        return Volumen;
    }

    public void setVolumen(double volumen) {
        Volumen = volumen;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String temperatura) {
        Temperatura = temperatura;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getEndulzante() {
        return Endulzante;
    }

    public void setEndulzante(String endulzante) {
        Endulzante = endulzante;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Acompañamiento{" +
                "Nombre='" + Nombre + '\'' +
                ", Volumen=" + Volumen +"ML"+
                ", Temperatura='" + Temperatura + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Endulzante='" + Endulzante + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
