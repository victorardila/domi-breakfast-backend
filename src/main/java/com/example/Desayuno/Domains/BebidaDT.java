package com.example.Desayuno.Domains;

public class BebidaDT extends Bebida{
    public BebidaDT() {
        this.Nombre = "Cafe con Leche";
        this.Volumen = 500;
        this.Temperatura = "Caliente";
        this.Tipo = "Con Cafeina";
        this.Endulzante = "Con Azucar";
        this.Precio = 1500;
    }

    public BebidaDT(String nombre, double volumen, String temperatura, String tipo, String endulzante, double precio) {
        super(nombre, volumen, temperatura, tipo, endulzante, precio);
    }
}
