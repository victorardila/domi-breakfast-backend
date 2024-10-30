package com.example.Desayuno.Domains;

public class BebidaDV extends Bebida{
    public BebidaDV() {
        this.Nombre = "Batido de Leche de Almendra";
        this.Volumen = 350;
        this.Temperatura = "Frio";
        this.Tipo = "Vegetal";
        this.Endulzante = "Sin Endulzar";
        this.Precio = 3000;
    }

    public BebidaDV(String nombre, double volumen, String temperatura, String tipo, String endulzante, double precio) {
        super(nombre, volumen, temperatura, tipo, endulzante, precio);
    }
}
