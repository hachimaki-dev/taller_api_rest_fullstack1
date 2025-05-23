package com.profecarlos.tallerapirest.restapi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.profecarlos.tallerapirest.restapi.model.Usuario;




public interface UsuarioRepository extends JpaRepository <Usuario, Integer>  {


     List<Usuario> findByrol(String rol);
    
}   
    


