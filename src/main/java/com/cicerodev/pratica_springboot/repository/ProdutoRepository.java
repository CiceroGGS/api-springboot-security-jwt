package com.cicerodev.pratica_springboot.repository;

import com.cicerodev.pratica_springboot.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> { }
