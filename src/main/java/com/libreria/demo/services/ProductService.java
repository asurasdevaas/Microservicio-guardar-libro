package com.libreria.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.libreria.demo.controllers.domain.Producto;

public class ProductService {

  List<Producto> productStore = new ArrayList<>();

      public List<Producto> getProductos(){
        return productStore;
      };
    
    
    public void saveProducto(Producto producto){
      productStore.add(producto);
    };
}
