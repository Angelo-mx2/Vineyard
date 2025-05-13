package com.vineyard.catalogo.controller;

import com.vineyard.catalogo.model.CategoriaBebida;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias-bebida")
public class CategoriaBebidaController {

    private final List<CategoriaBebida> categorias;

    public CategoriaBebidaController(List<CategoriaBebida> categorias) {
        this.categorias = categorias;
    }

    @GetMapping
    public List<CategoriaBebida> listarCategorias() {
        return categorias;
    }
}

