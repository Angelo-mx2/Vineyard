package com.vineyard.catalogo.controller;

import com.vineyard.catalogo.model.*;
import com.vineyard.catalogo.service.CatalogoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CatalogoController {

    private final CatalogoService service;

    public CatalogoController(CatalogoService service) {
        this.service = service;
    }

    @GetMapping("/comidas")
    public List<Comida> listarComidas() {
        return service.listarComidas();
    }

    @PostMapping("/comidas")
    public Comida guardarComida(@RequestBody Comida comida) {
        return service.guardarComida(comida);
    }

    @GetMapping("/bebidas")
    public List<Bebida> listarBebidas() {
        return service.listarBebidas();
    }

    @PostMapping("/bebidas")
    public Bebida guardarBebida(@RequestBody Bebida bebida) {
        return service.guardarBebida(bebida);
    }
}
