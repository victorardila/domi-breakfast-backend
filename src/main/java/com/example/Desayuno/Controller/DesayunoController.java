package com.example.Desayuno.Controller;

import com.example.Desayuno.Domains.Patron.*;
import com.example.Desayuno.Domains.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/Desayuno")
public class DesayunoController {
    @PostMapping("Crear/{Tipo}")
    public ResponseEntity<?> CrearDesayuno(@PathVariable("Tipo") String Tipo) {
        IDesayunoFactory desayunoFactory = DesayunoFactory.CrearDesayuno(Tipo);

        Bebida bebida = desayunoFactory.CrearBebida();
        PlatoPrincipal platoPrincipal = desayunoFactory.CrearPlatoPrincipal();
        Acompañamiento acompañamiento = desayunoFactory.CrearAcompañamiento();

        Desayuno desayuno = new Desayuno.DesayunoBuilder()
                .setTipo(Tipo)
                .setBebida(bebida)
                .setPlatoPrincipal(platoPrincipal)
                .setAcompañamiento(acompañamiento)
                .setMensaje("Para empezar almenos bien el Dia")
                .Armar();
        desayuno.CalcularPrecioTotal();

        return ResponseEntity.ok(desayuno.toString());

    }
}
