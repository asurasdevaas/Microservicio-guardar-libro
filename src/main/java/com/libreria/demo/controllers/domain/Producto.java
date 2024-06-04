package com.libreria.demo.controllers.domain;

public class Producto {

    private Integer isbn;
    private Integer quantity;


    public Producto(Integer isbn, Integer quantity) {
        this.isbn = isbn;
        this.quantity = quantity;
    }
    //Getter and setter
    public Integer getIsbn() {
        return isbn;
    }
    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
}
