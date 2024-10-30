package com.example.Desayuno.Domains;

public class PlatoPrincipalDS extends PlatoPrincipal{
    private String Calorias;
    public PlatoPrincipalDS(){
        this.Nombre = " Ensalada de Frutas Frescas";
        Ingredientes = "fresas, plátano, kiwi y arándanos";
        TipoCoccion = "Crudo";
        TamañoPorcion = "Mediano";
        Precio = 2000;
        this.Calorias = "250";
    }
    public PlatoPrincipalDS(String Calorias) {
        this.Calorias = Calorias;
    }

    public PlatoPrincipalDS(String nombre, String ingredientes, String tipoCoccion, String tamañoPorcion, double precio, String calorias) {
        super(nombre, ingredientes, tipoCoccion, tamañoPorcion, precio);
        this.Calorias = calorias;
    }

    public String getCalorias() {
        return Calorias;
    }

    public void setCalorias(String calorias) {
        Calorias = calorias;
    }

    @Override
    public String toString() {
        return super.toString()+
                "PlatoPrincipalDS{" +
                "Calorias='" + Calorias + '\'' +
                '}';
    }
}
