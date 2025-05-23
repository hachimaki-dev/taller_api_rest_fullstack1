package com.profecarlos.tallerapirest.restapi.service;

import com.profecarlos.tallerapirest.restapi.model.Inventario;
import com.profecarlos.tallerapirest.restapi.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository repository;

    public List<Inventario> getAllInventario() {
        return repository.findAll();
    }

    public Optional<Inventario> getInventarioById(int id) {
        return repository.findById(id);
    }

    public Inventario createInventario(Inventario inv) {
        return repository.save(inv);
    }

    public Inventario updateInventario(int id, Inventario invActualizado) {
        return repository.findById(id).map(inv -> {
            inv.setIdProducto(invActualizado.getIdProducto());
            inv.setNombreSucursal(invActualizado.getNombreSucursal());
            inv.setNombreProducto(invActualizado.getNombreProducto());
            inv.setCantidadProducto(invActualizado.getCantidadProducto());
            inv.setStockMinimo(invActualizado.getStockMinimo());
            inv.setStockMaximo(invActualizado.getStockMaximo());
            return repository.save(inv);
        }).orElse(null);
    }

    public void deleteInventario(int id) {
        repository.deleteById(id);
    }
}
