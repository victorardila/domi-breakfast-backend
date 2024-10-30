package com.example.Desayuno.Domains;

public class AcompañamientoDV extends Acompañamiento{
    public AcompañamientoDV() {
        Nombre = "Frutos Secos (Nueces, Almendras y Semillas)";
        Cantidad = 100;
        UnidadMedida = "Gramos";
        Tipo = "Frutos Secos";
        Precio = 2500;
    }

    public AcompañamientoDV(String nombre, int cantidad, String unidadMedida, String tipo, double precio) {
        super(nombre, cantidad, unidadMedida,  tipo, precio);
    }
}
