package com.vineyard.catalogo.controller;

import com.vineyard.catalogo.model.Bebida;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bebidas")
public class BebidaController {

    private final List<Bebida> bebidas;

    public BebidaController(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    @GetMapping
    public List<Bebida> listarBebidas() {
        return bebidas;
    }
}
