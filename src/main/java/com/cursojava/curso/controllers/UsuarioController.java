package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import com.sun.org.apache.xerces.internal.xs.StringList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuarios/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Yanpieer");
        usuario.setApellido("Romero");
        usuario.setEmail("yanpieer13@gmail.com");
        usuario.setTelefono("940591870");
        return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Yanpieer");
        usuario.setApellido("Romero");
        usuario.setEmail("yanpieer13@gmail.com");
        usuario.setTelefono("940591870");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Yanpieer");
        usuario.setApellido("Romero");
        usuario.setEmail("yanpieer13@gmail.com");
        usuario.setTelefono("940591870");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Yanpieer");
        usuario.setApellido("Romero");
        usuario.setEmail("yanpieer13@gmail.com");
        usuario.setTelefono("940591870");
        return usuario;
    }
}
