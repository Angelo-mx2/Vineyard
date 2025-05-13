package com.vineyard.catalogo.model;

import lombok.Data;

@Data
public class Bebida {
    private Long id;
    private String nombre;
    private CategoriaBebida categoria;
}
