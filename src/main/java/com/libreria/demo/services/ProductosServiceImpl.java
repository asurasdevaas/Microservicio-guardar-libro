package com.libreria.demo.services;

import com.libreria.demo.controllers.domain.Producto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ProductosServiceImpl {

    private List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto(1,"ISBN-999-888-999", 10),
            new Producto(2,"ISBN-888-777-666", 5)
            
    ));

    public List<Producto> getProductos(){
        return productos;
    }
}
