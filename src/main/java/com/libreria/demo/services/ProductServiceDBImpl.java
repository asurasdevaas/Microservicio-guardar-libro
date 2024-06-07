package com.libreria.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import com.libreria.demo.controllers.domain.Producto;
import com.libreria.demo.persistance.entities.ProductEntity;
import com.libreria.demo.persistance.repositories.ProductsRepository;

import java.util.ArrayList;
import java.util.List;

@Service("BD")
@ConditionalOnProperty(value = "productos.estrategia", havingValue = "EN_BD")

public class ProductServiceDBImpl implements ProductService{

    @Autowired
    private ProductsRepository productsRepository;

    public List<Producto> getProductos(){
        List<ProductEntity> productsEntities = productsRepository.findAll();
        List<Producto> productos = new ArrayList<>();
        for(ProductEntity productEntity : productsEntities){
            Producto producto = new Producto();
            producto.setId(productEntity.getId());
            producto.setIsbn(productEntity.getIsbn());
            producto.setQuantity(productEntity.getQuantity());
            ((List<Producto>) producto).add(producto);
        }
        return productos;
    }

    @Override
    public void saveProducto(Producto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveProducto'");
    }
}