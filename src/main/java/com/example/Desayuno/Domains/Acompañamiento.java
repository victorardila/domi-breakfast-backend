package com.example.Desayuno.Domains;

public class Acompañamiento {
    protected String Nombre;
    protected int Cantidad;
    protected String UnidadMedida;
    protected String Tipo;
    protected double Precio;

    public Acompañamiento() {
    }

    public Acompañamiento(String nombre, int cantidad, String unidadMedida, String tipo, double precio) {
        Nombre = nombre;
        Cantidad = cantidad;
        UnidadMedida = unidadMedida;
        Tipo = tipo;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        UnidadMedida = unidadMedida;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Acompañamiento{" +
                "Nombre='" + Nombre + '\'' +
                ", Cantidad=" + Cantidad + " " + UnidadMedida +
                ", Tipo='" + Tipo + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
