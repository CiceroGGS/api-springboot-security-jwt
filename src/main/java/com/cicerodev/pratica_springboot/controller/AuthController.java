package com.cicerodev.pratica_springboot.controller;

import com.cicerodev.pratica_springboot.model.UsuarioModel;
import com.cicerodev.pratica_springboot.security.JwtUtil;
import com.cicerodev.pratica_springboot.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> request) {
        UsuarioModel usuario = usuarioService.registrarUsuario(request.get("userName"), request.get("password"));

        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> request) {
        Optional<UsuarioModel> usuario = usuarioService.buscarPorUserName(request.get("userName"));
        if(usuario.isPresent() && usuario.get().getPassword().equals((request.get("password")))) {
            String token = JwtUtil.generateToken(usuario.get().getUserName());
            return ResponseEntity.ok(Map.of("token", token));
        }
        return ResponseEntity.status(401).body("Usuário ou senha inválidos");

    }
}
