package com.vineyard.catalogo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaBebida categoria;
}