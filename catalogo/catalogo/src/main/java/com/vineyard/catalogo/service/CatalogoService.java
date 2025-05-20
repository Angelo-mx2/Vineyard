package com.vineyard.catalogo.service;

import com.vineyard.catalogo.model.*;
import com.vineyard.catalogo.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoService {
    private final ComidaRepository comidaRepo;
    private final BebidaRepository bebidaRepo;

    public CatalogoService(ComidaRepository comidaRepo, BebidaRepository bebidaRepo) {
        this.comidaRepo = comidaRepo;
        this.bebidaRepo = bebidaRepo;
    }

    public List<Comida> listarComidas() {
        return comidaRepo.findAll();
    }

    public Comida guardarComida(Comida comida) {
        return comidaRepo.save(comida);
    }

    public List<Bebida> listarBebidas() {
        return bebidaRepo.findAll();
    }

    public Bebida guardarBebida(Bebida bebida) {
        return bebidaRepo.save(bebida);
    }
}
