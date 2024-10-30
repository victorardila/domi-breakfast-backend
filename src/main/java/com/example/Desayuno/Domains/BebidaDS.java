package com.example.Desayuno.Domains;

public class BebidaDS extends Bebida{
    private String Ingrediente;

    public BebidaDS() {
        this.Nombre = "Jugo Verde";
        this.Volumen = 500;
        this.Temperatura = "Frio";
        this.Tipo = "Natural";
        this.Endulzante = "Sin endulzar";
        this.Precio = 2000;
        this.Ingrediente = "Preparado con kale, espinaca, manzana y jengibre";
    }

    public BebidaDS(String ingrediente) {
        Ingrediente = ingrediente;
    }

    public BebidaDS(String nombre, double volumen, String temperatura, String tipo, String endulzante, double precio, String ingrediente) {
        super(nombre, volumen, temperatura, tipo, endulzante, precio);
        Ingrediente = ingrediente;
    }
    public String getIngrediente() {
        return Ingrediente;
    }
    public void setIngrediente(String ingrediente) {
        Ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return super.toString()+
                "BebidaDS{" +
                "Ingrediente='" + Ingrediente + '\'' +
                '}';
    }
}
