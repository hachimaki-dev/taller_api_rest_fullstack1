package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ReseñaController {

    @GetMapping("/api/productos/{productoId}/resenas")

    public String ProductoReseña(@PathVariable int productoId,
                                 @RequestParam (defaultValue = "1") int calificacionMin,
                                 @RequestParam (defaultValue = "5") int calificacionMax,
                                 @RequestParam (defaultValue = "false") boolean mostrarSoloVerificadas) {

        String mostrarSoloVerificadasV;

        if (mostrarSoloVerificadas == true) {

            mostrarSoloVerificadasV = "Mostrando reseñas verificadas";
        } else {

            mostrarSoloVerificadasV = "Mostrando todo tipo de reseñas";

        }

        return "ID Producto: " + productoId +
                ", Calificación mínima: " + calificacionMin +
                ", Calificación máxima: " + calificacionMax + 
                " " + mostrarSoloVerificadasV;
    }
}
