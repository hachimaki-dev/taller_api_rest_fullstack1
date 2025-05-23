//Matias Gallardo Aqui hago mi codigo 

//--------------------------------------------------------------//
Usuario.java 
//--------------------------------------------------------------//

package com.profecarlos.tallerapirest.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// creo la tabla llamada usuario
@Entity
@Table(name = "Usuario")
public class Usuario {

    // id autoincremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // columna nombre
    @Column(nullable = false)
    private String nombre;

    // columna email
    @Column(nullable = false)
    private String email;

    // columna password
    @Column(nullable = false)
    private String password;

    // parametros
    public Usuario(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    // constructor vacio  por jpa
    public Usuario() {
    }

    // get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
//--------------------------------------------------------------//
UsuarioRepository
//--------------------------------------------------------------//
package com.profecarlos.tallerapirest.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.profecarlos.tallerapirest.restapi.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByEmail(String email);

    boolean existsByEmail(String email);
}

//--------------------------------------------------------------//
UsuarioController
//--------------------------------------------------------------//
package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.profecarlos.tallerapirest.restapi.model.Usuario;
import com.profecarlos.tallerapirest.restapi.repository.UsuarioRepository;

import java.util.List;

@RestController // es una clase rest
@RequestMapping("/api/v1") //la ruta
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // crear usuario con post (registro)
    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            return new ResponseEntity<>(HttpStatus.CONFLICT); // correo ya registrado
        }
        Usuario nuevo = usuarioRepository.save(usuario);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }

    // registrar usuario con get 
    @GetMapping("/usuario/registrar")
    public ResponseEntity<String> registrarUsuarioPorGet(
            @RequestParam String nombre,
            @RequestParam String email,
            @RequestParam String password) {

        if (usuarioRepository.existsByEmail(email)) {
            return new ResponseEntity<>("correo ya registrado", HttpStatus.CONFLICT);
        }

        Usuario nuevo = new Usuario();
        nuevo.setNombre(nombre);
        nuevo.setEmail(email);
        nuevo.setPassword(password);

        usuarioRepository.save(nuevo);
        return new ResponseEntity<>("usuario registrado correctamente", HttpStatus.CREATED);
    }

    // iniciar sesion con get
    @GetMapping("/usuario/login")
    public ResponseEntity<String> loginUsuarioPorGet(
            @RequestParam String email,
            @RequestParam String password) {

        Usuario usuario = usuarioRepository.findByEmail(email);

        if (usuario != null && usuario.getPassword().equals(password)) {
            return new ResponseEntity<>("inicio de sesion exitoso", HttpStatus.OK);
        }

        return new ResponseEntity<>("credenciales invalidas", HttpStatus.UNAUTHORIZED);
    }

    // listar todos los usuarios
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    // obtener usuario por id
    @GetMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable int id) {
        return usuarioRepository.findById(id)
                .map(usuario -> new ResponseEntity<>(usuario, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // actualizar usuario por id
    @PutMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable int id, @RequestBody Usuario usuarioActualizado) {
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuario.setNombre(usuarioActualizado.getNombre());
                    usuario.setEmail(usuarioActualizado.getEmail());
                    usuario.setPassword(usuarioActualizado.getPassword());
                    Usuario actualizado = usuarioRepository.save(usuario);
                    return new ResponseEntity<>(actualizado, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // eliminar usuario por id
    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable int id) {
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuarioRepository.delete(usuario);
                    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
