package com.libreria.demo.persistance.entities;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "productos")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)// @GeneratedValue se usa preferiblemente en tipos numericos
    private String isbn;
    private Integer quantity;
}
