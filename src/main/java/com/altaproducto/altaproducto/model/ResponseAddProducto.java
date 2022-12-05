package com.altaproducto.altaproducto.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAddProducto {

    private String mensaje;
    private String codigo;
    private Object detalles;

    public ResponseAddProducto(String mensaje, String codigo, Object detalles) {
        super();
        this.mensaje = mensaje;
        this.codigo = codigo;
        this.detalles = detalles;
    }

}
