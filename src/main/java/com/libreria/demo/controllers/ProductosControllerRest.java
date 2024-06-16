package com.libreria.demo.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.libreria.demo.controllers.domain.Producto;
import com.libreria.demo.services.ProductService;
import com.libreria.demo.services.ProductServiceDBImpl;

@RestController
@RequestMapping("/productos")
public class ProductosControllerRest {

    private ProductServiceDBImpl productosService = new ProductServiceDBImpl();

    @GetMapping
    public ResponseEntity<?> getProductos() {
        List<Producto> productos = productosService.getProductos();
        return ResponseEntity.ok(productos);
    }

    @PostMapping
    public ResponseEntity<?> altaProducto(@RequestBody Producto producto) {

        productosService.saveProducto(producto);

        return ResponseEntity.ok(producto);
    }

    public ResponseEntity<?> fakeProductosAPI() {

        List<Producto> productos = new ArrayList<>(Arrays.asList(
                new Producto("ISBN-111-222-333", 88),
                new Producto("ISBN-555-666-222", 99),
                new Producto("ISBN-777-555-111", 55)));
        return ResponseEntity.ok(productos);
    }
}
