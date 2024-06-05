package com.libreria.demo.services;

import com.libreria.demo.controllers.domain.Producto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ProductosServiceImpl {

    private List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto(9999, 10),
            new Producto(8888, 5)
            
    ));

    public List<Producto> getProductos(){
        return productos;
    }
}
