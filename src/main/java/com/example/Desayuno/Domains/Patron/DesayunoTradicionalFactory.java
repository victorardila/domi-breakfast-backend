package com.example.Desayuno.Domains.Patron;

import com.example.Desayuno.Domains.*;

public class DesayunoTradicionalFactory implements IDesayunoFactory {
    @Override
    public Bebida CrearBebida() {
        return new BebidaDT();
    }

    @Override
    public PlatoPrincipal CrearPlatoPrincipal() {
        return new PlatoPrincipalDT();
    }

    @Override
    public Acompañamiento CrearAcompañamiento() {
        return new AcompañamientoDT();
    }
}
