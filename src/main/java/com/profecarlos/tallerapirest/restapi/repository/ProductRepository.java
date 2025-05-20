package com.profecarlos.tallerapirest.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profecarlos.tallerapirest.restapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    

    // Este metodo no es de JPA, si no uno personalizado creado por nosotros
    // Esto parece magia, pero es gracias a que JPA trabaja por convencion de nombres
    // Lo de abajo en el fondo, hace que JPA haga algo como esto
    // SELECT * FROM product WHERE categoria = :categoria
    // Pero ojo, que si voy a trabajar de esta manera, es obligatorio que mi modelo tenga dicho atributo (categoria en este caso)


    List<Product> findByCategoria(String categoria);
}
