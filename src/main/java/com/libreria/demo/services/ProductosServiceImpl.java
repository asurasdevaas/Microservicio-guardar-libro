package com.libreria.demo.services;

import com.libreria.demo.controllers.domain.Producto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductosServiceImpl {

    private List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto("ISBN-999-888-999", 10),
            new Producto("ISBN-888-777-656", 5)

    ));

    public List<Producto> getProductos() {
        return productos;
    }

    public void saveProducto(Producto producto) {

    }
}
