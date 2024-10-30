package com.example.Desayuno.Domains;

public class PlatoPrincipalDV extends PlatoPrincipal{
    public PlatoPrincipalDV() {
        Nombre = "Sándwich de Aguacate con Tomate y Brotes de Alfalfa";
        Ingredientes = "Aguacate, tomate, brotes de alfalfa, pan integral";
        TipoCoccion = "Frito";
        TamañoPorcion = "Mediano";
        Precio = 2500;
    }

    public PlatoPrincipalDV(String nombre, String ingredientes, String tipoCoccion, String tamañoPorcion, double precio) {
        super(nombre, ingredientes, tipoCoccion, tamañoPorcion, precio);
    }
}
