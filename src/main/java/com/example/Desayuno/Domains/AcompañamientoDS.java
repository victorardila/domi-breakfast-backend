package com.example.Desayuno.Domains;

public class AcompañamientoDS extends Acompañamiento{
    public AcompañamientoDS() {
        Nombre = "Yogur Natural con Semillas de Chía y Almendras";
        Cantidad = 200;
        UnidadMedida = "Gramos";
        Tipo = "Lacteo";
        Precio = 2000;
    }
    public AcompañamientoDS(String nombre, int cantidad, String unidadMedida, String tipo, double precio) {
        super(nombre, cantidad, unidadMedida, tipo, precio);
    }


}
