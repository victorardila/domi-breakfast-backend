package com.example.Desayuno.Domains.Patron;

import com.example.Desayuno.Domains.*;

public class DesayunoVeganoFactory implements IDesayunoFactory {

    @Override
    public Bebida CrearBebida() {
        return new BebidaDV();
    }

    @Override
    public PlatoPrincipal CrearPlatoPrincipal() {
        return new PlatoPrincipalDV();
    }

    @Override
    public Acompañamiento CrearAcompañamiento() {
        return new AcompañamientoDV();
    }
}
