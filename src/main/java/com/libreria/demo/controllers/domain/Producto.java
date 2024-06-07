package com.libreria.demo.controllers.domain;

public class Producto {

    private Integer id;
    
    private String isbn;
    private Integer quantity;


    
    public Producto() {
    }

    public Producto(Integer id, String isbn, Integer quantity) {
        this.id = id;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    
    //Getter and setter
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    //Implementar el metodo agregar
   

    
}
