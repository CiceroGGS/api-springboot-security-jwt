package com.cicerodev.pratica_springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {

    /*====================================================*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    /*====================================================*/

    public UsuarioModel(){}

    public UsuarioModel(Long id, String userName, String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    /*====================================================*/

    public UsuarioModel(String userName, String senhaCriptografada) {
        this.userName = userName;
        this.password = senhaCriptografada; // ✅ CORRETO
    }

    /*====================================================*/

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*====================================================*/

}
