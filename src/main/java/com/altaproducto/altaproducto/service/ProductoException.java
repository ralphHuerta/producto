package com.altaproducto.altaproducto.service;

public class ProductoException extends RuntimeException{
    private final String id;

    public ProductoException(String message, String id) {
        super(message);
        this.id = id;
    }
    public static ProductoException from(String message, String id){
        return new ProductoException(message, id);
    }

    public String getId(){
        return id;
    }
}
