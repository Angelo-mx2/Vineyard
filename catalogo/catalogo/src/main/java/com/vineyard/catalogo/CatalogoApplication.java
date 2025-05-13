package com.vineyard.catalogo;

import com.vineyard.catalogo.config.DataLoader;
import com.vineyard.catalogo.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CatalogoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogoApplication.class, args);
    }

    @Bean
    public CategoriaComidaController categoriaComidaController(DataLoader data) {
        return new CategoriaComidaController(data.getCategoriasComida());
    }

    @Bean
    public ComidaController comidaController(DataLoader data) {
        return new ComidaController(data.getComidas());
    }

    @Bean
    public CategoriaBebidaController categoriaBebidaController(DataLoader data) {
        return new CategoriaBebidaController(data.getCategoriasBebida());
    }

    @Bean
    public BebidaController bebidaController(DataLoader data) {
        return new BebidaController(data.getBebidas());
    }
}

