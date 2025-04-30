package com.profecarlos.tallerapirest.restapi.ProductoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/productos")
public class ProductoController {
@GetMapping
public String listaProductos() {
return "lista de productos";
}
}
