package com.profecarlos.tallerapirest.restapi.repository;
//--------------------------------------------------------------//
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.profecarlos.tallerapirest.restapi.model.Usuario;
//--------------------------------------------------------------//
@Repository
public interface UsuarioRepository extends JpaRepository< Usuario , Integer >{

    

//--------------------------------------------------------------//    
}
