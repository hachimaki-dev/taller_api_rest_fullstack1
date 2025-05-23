package com.profecarlos.tallerapirest.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profecarlos.tallerapirest.restapi.model.Venta;
import com.profecarlos.tallerapirest.restapi.repository.VentaRepository;


@RestController
@RequestMapping("retro/v1")
public class VentaController {

    @Autowired
    private VentaRepository ventaRepository;

    @PostMapping("venta")
    public ResponseEntity<Venta> insertVenta(@RequestBody Venta venta) {
        Venta savedVenta = ventaRepository.save(venta);
        return new ResponseEntity<>(savedVenta, HttpStatus.CREATED);
    }

     @GetMapping("ventas")
    public ResponseEntity<List<Venta>> getAllVentas() {
        List<Venta> ventas = ventaRepository.findAll();
        return new ResponseEntity<>(ventas, HttpStatus.OK);
    }


}
