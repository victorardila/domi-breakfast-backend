package com.example.Desayuno.Domains;


public class PlatoPrincipalDT extends PlatoPrincipal{
    public PlatoPrincipalDT() {
        Nombre = "Huevos Revueltos con Jamón y Queso";
        Ingredientes = "Huevos, jamón, queso";
        TipoCoccion = "Frito";
        TamañoPorcion = "Grande";
        Precio = 3000;
    }

    public PlatoPrincipalDT(String nombre, String ingredientes, String tipoCoccion, String tamañoPorcion, double precio) {
        super(nombre, ingredientes, tipoCoccion, tamañoPorcion, precio);
    }
}
