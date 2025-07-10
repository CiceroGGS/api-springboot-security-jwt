package com.cicerodev.pratica_springboot.repository;

import com.cicerodev.pratica_springboot.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioReporisoty extends JpaRepository<UsuarioModel, Long> {

    Optional<UsuarioModel> findByUserName(String userName);

}
