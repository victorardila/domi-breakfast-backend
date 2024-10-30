package com.example.Desayuno.Domains;

public class AcompañamientoDT extends Acompañamiento{
    public AcompañamientoDT() {
        Nombre = "Pan Tostado con Mantequilla y Mermelada";
        Cantidad = 2;
        UnidadMedida = "Rebanadas";
        Tipo = "Pan";
        Precio = 1500;
    }

    public AcompañamientoDT(String nombre, int cantidad, String unidadMedida, String tipo, double precio) {
        super(nombre, cantidad, unidadMedida, tipo, precio);
    }
}
