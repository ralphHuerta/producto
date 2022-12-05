package com.altaproducto.altaproducto.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AddProducto {

    private String id;

    private String name;

    private Boolean precio;

    private String descripcion;

    private String categoria;

    private String existentes;
}
