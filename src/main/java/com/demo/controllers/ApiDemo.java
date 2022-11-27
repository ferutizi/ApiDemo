package com.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Usuario;
import com.demo.services.UsuarioServices;

@RestController
@RequestMapping("api")

public class ApiDemo {

    @Autowired
    UsuarioServices UsuarioService;

    @GetMapping("/saludar")

    public String saludar(){
        return "hola mundo";
    }

    @GetMapping("/all")
    public ArrayList<Usuario> getAllUser(){
        return UsuarioService.getAllUser();
    }

/*     @GetMapping("/find/{id}")
    public Optional<Usuario> getUserById(@PathVariable("id")) {
        return UsuarioService.getUserById("id")
    } */
}
