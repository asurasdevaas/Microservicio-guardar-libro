package com.libreria.demo.services;

import java.util.List;

import com.libreria.demo.controllers.domain.Producto;

public interface ProductService {

      public List<Producto> getProductos();
    
    
    public void saveProducto(Producto producto);
}
