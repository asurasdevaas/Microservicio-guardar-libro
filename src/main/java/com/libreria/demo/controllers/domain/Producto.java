package com.libreria.demo.controllers.domain;

public class Producto {

    private String isbn;
    private Integer quantity;

    public Producto() {
    }

    public Producto(String isbn, Integer quantity) {

        this.isbn = isbn;
        this.quantity = quantity;
    }

    // Getter and setter

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

}
