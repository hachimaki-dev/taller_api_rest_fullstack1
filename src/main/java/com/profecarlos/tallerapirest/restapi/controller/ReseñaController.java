package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReseñaController {

    @GetMapping("/api/productos/{productoId}/reseñas")
    public String listarReseñas(
            @PathVariable Long productoId,
            @RequestParam(defaultValue = "1") int calificacionMin,
            @RequestParam(defaultValue = "5") int calificacionMax,
            @RequestParam(defaultValue = "false") boolean mostrarSoloVerificadas) {
        return "Se están listando todas las reseñas del producto con id: " + productoId +
        ".\n" +
        "Se aplicaron los siguientes filtros: \n calificacionMin=" + calificacionMin +
        ", \n calificacionMax=" + calificacionMax + 
        " , \n mostrar solo verificadas: " + mostrarSoloVerificadas;
    }
}