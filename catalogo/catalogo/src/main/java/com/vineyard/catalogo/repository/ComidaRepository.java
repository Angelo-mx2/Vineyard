package com.vineyard.catalogo.repository;

import com.vineyard.catalogo.model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComidaRepository extends JpaRepository<Comida, Long> {}