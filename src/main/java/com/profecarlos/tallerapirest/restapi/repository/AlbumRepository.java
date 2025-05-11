package com.profecarlos.tallerapirest.restapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.profecarlos.tallerapirest.restapi.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer>{
    
}
