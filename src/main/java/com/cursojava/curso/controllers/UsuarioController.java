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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Yanpieer");
        usuario.setApellido("Romero");
        usuario.setEmail("yanpieer13@gmail.com");
        usuario.setTelefono("940591870");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Marco");
        usuario2.setApellido("Gutierrez");
        usuario2.setEmail("marco@gmail.com");
        usuario2.setTelefono("987654321");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Pedro");
        usuario3.setApellido("Larico");
        usuario3.setEmail("pedro@gmail.com");
        usuario3.setTelefono("965487321");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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
