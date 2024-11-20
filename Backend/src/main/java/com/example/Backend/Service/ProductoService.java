
package com.example.Backend.Service;


import com.example.Backend.Entity.Producto;
import com.example.Backend.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }


    public Producto getProductoById(int id) {

        return productoRepository.findById(id).orElse(null);
    }


    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }


    public void deleteProducto(int id) {
        productoRepository.deleteById(id);
    }
}
