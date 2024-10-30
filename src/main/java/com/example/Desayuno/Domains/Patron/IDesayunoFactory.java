package com.example.Desayuno.Domains.Patron;

import com.example.Desayuno.Domains.*;

public interface IDesayunoFactory {
    Bebida CrearBebida();
    PlatoPrincipal CrearPlatoPrincipal();
    Acompañamiento CrearAcompañamiento();
}
