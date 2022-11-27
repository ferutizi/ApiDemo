package com.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.demo.model.Usuario;

public interface UsuarioServices {
    
    ArrayList<Usuario> getAllUser();
    Optional<Usuario> getUserById(long id);
    Usuario saveUser(Usuario u);
    boolean deleteUserById(long id);
}
