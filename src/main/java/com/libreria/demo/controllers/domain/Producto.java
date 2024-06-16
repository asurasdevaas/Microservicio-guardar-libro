package com.libreria.demo.controllers.domain;

public class Producto {

    private String isbn;
    private Integer quantity;
    private String supplier;

    public Producto() {
    }

    

    // Getter and setter

    public Producto(String isbn, Integer quantity, String supplier) {
        this.isbn = isbn;
        this.quantity = quantity;
        this.supplier = supplier;
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

}
