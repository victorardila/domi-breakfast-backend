package com.example.Desayuno.Domains;

public class PlatoPrincipal {
    protected String Nombre;
    protected String Ingredientes;
    protected String TipoCoccion;
    protected String TamañoPorcion;
    protected double Precio;

    public PlatoPrincipal() {
    }

    public PlatoPrincipal(String nombre, String ingredientes, String tipoCoccion, String tamañoPorcion, double precio) {
        Nombre = nombre;
        Ingredientes = ingredientes;
        TipoCoccion = tipoCoccion;
        TamañoPorcion = tamañoPorcion;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        Ingredientes = ingredientes;
    }

    public String getTipoCoccion() {
        return TipoCoccion;
    }

    public void setTipoCoccion(String tipoCoccion) {
        TipoCoccion = tipoCoccion;
    }

    public String getTamañoPorcion() {
        return TamañoPorcion;
    }

    public void setTamañoPorcion(String tamañoPorcion) {
        TamañoPorcion = tamañoPorcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String
    toString() {
        return "PlatoPrincipal{" +
                "Nombre='" + Nombre + '\'' +
                ", Ingredientes='" + Ingredientes + '\'' +
                ", TipoCoccion='" + TipoCoccion + '\'' +
                ", TamañoPorcion='" + TamañoPorcion + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
