package com.libreria.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<Producto> productos = productosService.getProductos();
        return ResponseEntity.ok(productos);
    }


    public ResponseEntity<?> fakeProductosAPI(){
        
        List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto(55555, 88),
            new Producto(2222, 99),
            new Producto(333333, 55)
        ));
        return ResponseEntity.ok(productos);
    }
}
