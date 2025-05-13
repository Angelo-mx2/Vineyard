package com.vineyard.catalogo.controller;

import com.vineyard.catalogo.model.Comida;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comidas")
public class ComidaController {

    private final List<Comida> comidas;

    public ComidaController(List<Comida> comidas) {
        this.comidas = comidas;
    }

    @GetMapping
    public List<Comida> listarComidas() {
        return comidas;
    }
}
