package com.cicerodev.pratica_springboot.service;

import com.cicerodev.pratica_springboot.model.UsuarioModel;
import com.cicerodev.pratica_springboot.repository.UsuarioReporisoty;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    /*====================================================*/

    private final UsuarioReporisoty usuarioReporisoty;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioReporisoty usuarioReporisoty, PasswordEncoder passwordEncoder) {
        this.usuarioReporisoty = usuarioReporisoty;
        this.passwordEncoder = passwordEncoder; // ✅ Forma correta de atribuir a dependência
    }
    /*====================================================*/

    public UsuarioModel registrarUsuario(String userNane, String password) {
        String senhaCriptografada = passwordEncoder.encode(password);
        UsuarioModel usuario = new UsuarioModel(userNane, senhaCriptografada);
        return usuarioReporisoty.save(usuario);
    }

    public Optional<UsuarioModel> buscarPorUserName(String userName) {
        return usuarioReporisoty.findByUserName(userName);
    }

    /*====================================================*/

}
