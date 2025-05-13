package com.vineyard.catalogo.model;

import lombok.Data;

@Data
public class Comida {
    private Long id;
    private String nombre;
    private CategoriaComida categoria;
}
