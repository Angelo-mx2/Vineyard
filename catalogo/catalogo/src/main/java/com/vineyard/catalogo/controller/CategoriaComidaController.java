package com.vineyard.catalogo.controller;

import com.vineyard.catalogo.model.CategoriaComida;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias-comida")
public class CategoriaComidaController {

    private final List<CategoriaComida> categorias;

    public CategoriaComidaController(List<CategoriaComida> categorias) {
        this.categorias = categorias;
    }

    @GetMapping
    public List<CategoriaComida> listarCategorias() {
        return categorias;
    }
}
