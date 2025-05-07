package com.profecarlos.tallerapirest.restapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
    
@RestController
@RequestMapping("/api/productos")
public class ReseñaController {
    

@GetMapping("/{productoId}/reseñas")
public String obtenerReseñas(
    @PathVariable int productoId,
    @RequestParam(defaultValue = "1") int calificacionMin,
    @RequestParam(defaultValue = "5") int calificacionMax,
    @RequestParam(defaultValue = "falso") boolean mostrarSoloVerificadas
    ) {
        return String.format("Reseñas para producto %d - Calificación entre %d y %d, Solo verificadas: %b",
            productoId, calificacionMin, calificacionMax, mostrarSoloVerificadas);
        
    }

}
