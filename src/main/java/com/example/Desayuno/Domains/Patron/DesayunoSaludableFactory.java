package com.example.Desayuno.Domains.Patron;

import com.example.Desayuno.Domains.*;

public class DesayunoSaludableFactory implements IDesayunoFactory {

    @Override
    public Bebida CrearBebida() {
        return new BebidaDS();
    }

    @Override
    public PlatoPrincipal CrearPlatoPrincipal() {
        return new PlatoPrincipalDS();
    }

    @Override
    public Acompañamiento CrearAcompañamiento() {
        return new AcompañamientoDS();
    }
}
