package com.profecarlos.tallerapirest.restapi.controller;

import com.profecarlos.tallerapirest.restapi.model.Inventario;
import com.profecarlos.tallerapirest.restapi.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
@CrossOrigin(origins = "*")
public class InventarioController {

    @Autowired
    private InventarioService service;

    @GetMapping
    public List<Inventario> getAll() {
        return service.getAllInventario();
    }

    @GetMapping("/{id}")
    public Inventario getById(@PathVariable int id) {
        return service.getInventarioById(id).orElse(null);
    }

    @PostMapping
    public Inventario create(@RequestBody Inventario inv) {
        return service.createInventario(inv);
    }

    @PutMapping("/{id}")
    public Inventario update(@PathVariable int id, @RequestBody Inventario inv) {
        return service.updateInventario(id, inv);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteInventario(id);
    }
}
