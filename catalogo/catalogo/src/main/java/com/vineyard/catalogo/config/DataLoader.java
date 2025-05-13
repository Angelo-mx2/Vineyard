package com.vineyard.catalogo.config;

import com.vineyard.catalogo.controller.*;
import com.vineyard.catalogo.model.*;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataLoader {

    private final List<CategoriaComida> categoriasComida = new ArrayList<>();
    private final List<Comida> comidas = new ArrayList<>();
    private final List<CategoriaBebida> categoriasBebida = new ArrayList<>();
    private final List<Bebida> bebidas = new ArrayList<>();

    @PostConstruct
    public void init() {
        // Categorías comida
        CategoriaComida sushi = new CategoriaComida(); sushi.setId(1L); sushi.setNombre("Sushi");
        CategoriaComida carnes = new CategoriaComida(); carnes.setId(2L); carnes.setNombre("Carnes");
        CategoriaComida sandwich = new CategoriaComida(); sandwich.setId(3L); sandwich.setNombre("Sándwiches");
        CategoriaComida papas = new CategoriaComida(); papas.setId(4L); papas.setNombre("Papas Fritas");

        categoriasComida.add(sushi);
        categoriasComida.add(carnes);
        categoriasComida.add(sandwich);
        categoriasComida.add(papas);

        comidas.add(new Comida() {{ setId(1L); setNombre("Sushi Salmón"); setCategoria(sushi); }});
        comidas.add(new Comida() {{ setId(2L); setNombre("Asado de tira"); setCategoria(carnes); }});
        comidas.add(new Comida() {{ setId(3L); setNombre("Sándwich de pollo"); setCategoria(sandwich); }});
        comidas.add(new Comida() {{ setId(4L); setNombre("Papas cheddar"); setCategoria(papas); }});

        // Categorías bebida
        CategoriaBebida gaseosa = new CategoriaBebida(); gaseosa.setId(1L); gaseosa.setNombre("Gaseosas");
        CategoriaBebida jugos = new CategoriaBebida(); jugos.setId(2L); jugos.setNombre("Jugos");
        CategoriaBebida vinos = new CategoriaBebida(); vinos.setId(3L); vinos.setNombre("Vinos");
        CategoriaBebida cocteles = new CategoriaBebida(); cocteles.setId(4L); cocteles.setNombre("Cócteles");

        categoriasBebida.add(gaseosa);
        categoriasBebida.add(jugos);
        categoriasBebida.add(vinos);
        categoriasBebida.add(cocteles);

        bebidas.add(new Bebida() {{ setId(1L); setNombre("Coca-Cola"); setCategoria(gaseosa); }});
        bebidas.add(new Bebida() {{ setId(2L); setNombre("Jugo de naranja"); setCategoria(jugos); }});
        bebidas.add(new Bebida() {{ setId(3L); setNombre("Vino tinto"); setCategoria(vinos); }});
        bebidas.add(new Bebida() {{ setId(4L); setNombre("Mojito"); setCategoria(cocteles); }});
    }

    public List<CategoriaComida> getCategoriasComida() { return categoriasComida; }
    public List<Comida> getComidas() { return comidas; }
    public List<CategoriaBebida> getCategoriasBebida() { return categoriasBebida; }
    public List<Bebida> getBebidas() { return bebidas; }
}
