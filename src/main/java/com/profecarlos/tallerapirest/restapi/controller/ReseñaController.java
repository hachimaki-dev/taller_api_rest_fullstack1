package com.profecarlos.tallerapirest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReseñaController {
    
    @GetMapping("/productos/{productoId}/reseñas")
    public String reseña(
        @PathVariable Long productoId,
        @RequestParam(defaultValue = "1") int calificacionMin,
        @RequestParam(defaultValue = "5") int calificacionMax,
        @RequestParam(defaultValue = "false") Boolean mostrarSoloVerificadas 
    ) {
        if (mostrarSoloVerificadas == true){
            return "ID Producto: "+ productoId +"\nCalificacionMin: "+ calificacionMin + "\nCalificacionMax: "+ calificacionMax + "\nmostrarSoloVerificadas: " + mostrarSoloVerificadas;
        }else{
            return "Error 001. No se ha mostrado la reseña: Reseña sin verificar";
        }
    }

}
