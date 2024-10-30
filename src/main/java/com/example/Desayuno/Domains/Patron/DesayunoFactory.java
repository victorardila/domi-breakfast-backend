package com.example.Desayuno.Domains.Patron;

public class DesayunoFactory {
    public static IDesayunoFactory CrearDesayuno(String tipo) {
        switch(tipo){
            case "Saludable": return new DesayunoSaludableFactory();
            case "Tradicional": return new DesayunoTradicionalFactory();
            default: return new DesayunoVeganoFactory();
        }
    }
}
