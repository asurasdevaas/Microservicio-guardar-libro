package com.libreria.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.demo.controllers.domain.Producto;
import com.libreria.demo.services.ProductosServiceImpl;

@RestController
@RequestMapping("/productos")
public class ProductosControllerRest {

    private ProductosServiceImpl productosService = new ProductosServiceImpl();

    @GetMapping
    public ResponseEntity<?> getProductos(){
        List<Producto> productos = productosService.geProductos();
        return ResponseEntity.ok(productos);
    }
}
