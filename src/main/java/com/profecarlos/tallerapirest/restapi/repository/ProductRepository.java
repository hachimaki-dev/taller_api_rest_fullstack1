package com.profecarlos.tallerapirest.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profecarlos.tallerapirest.restapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    /*  Este repositorio hereda de JpaRepository, lo que le da acceso a métodos CRUD
    y otras funcionalidades para interactuar con la base de datos.
    JPA que proporciona métodos CRUD (crear, leer, actualizar, eliminar) 
    y funcionalidades avanzadas como paginación y búsqueda para interactuar con bases de datos. 
    Al extenderla, no necesitas implementar estos métodos manualmente, 
    ya que Spring los genera automáticamente.*/
}
