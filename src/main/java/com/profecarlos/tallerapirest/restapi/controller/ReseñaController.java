package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class ReseñaController {

    @GetMapping("/api/productos/{productoId}/resenas")

    public String ProductoReseña(@PathVariable int productoId,
                                 @RequestParam (defaultValue = "1") int calificacionMin,
                                 @RequestParam (defaultValue = "5") int calificacionMax,
                                 @RequestParam (defaultValue = "false") String mostrarSoloverificadas) {

        return "ID producto: " + productoId +
                ", calificación mínima: " + calificacionMin +
                ", calificación máxima: " + calificacionMax +
                ", solo verificadas: " + (Objects.equals(mostrarSoloverificadas, "true") ? "true" : "false");

    }
}
