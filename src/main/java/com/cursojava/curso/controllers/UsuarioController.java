package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import com.sun.org.apache.xerces.internal.xs.StringList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Yanpieer");
        usuario.setApellido("Romero");
        usuario.setEmail("yanpieer13@gmail.com");
        usuario.setTelefono("940591870");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Yanpieer");
        usuario.setApellido("Romero");
        usuario.setEmail("yanpieer13@gmail.com");
        usuario.setTelefono("940591870");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
       usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "api/usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Yanpieer");
        usuario.setApellido("Romero");
        usuario.setEmail("yanpieer13@gmail.com");
        usuario.setTelefono("940591870");
        return usuario;
    }
}
