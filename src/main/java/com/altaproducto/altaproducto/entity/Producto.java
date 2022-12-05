package com.altaproducto.altaproducto.entity;


import com.altaproducto.altaproducto.model.AddProducto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table
public class Producto implements Serializable {

    private  static final long serialVesrsionUID = 1;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator( name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "precio")
    private Boolean precio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "Productos-existentes")
    private String existentes;

    public static Producto from(AddProducto addProducto){
        Producto producto = new Producto();
        producto.setName(addProducto.getName());
        producto.setPrecio(addProducto.getPrecio());
        producto.setDescripcion(addProducto.getDescripcion());
        producto.setCategoria(addProducto.getCategoria());
        producto.setExistentes(addProducto.getExistentes());

        return producto;
    }

    public  AddProducto to(){
        AddProducto addProducto = new AddProducto();
        addProducto.setId(getId());
        addProducto.setName(getName());
        addProducto.setPrecio(getPrecio());
        addProducto.setDescripcion(getDescripcion());
        addProducto.setCategoria(getCategoria());
        addProducto.setExistentes(getExistentes());

        return addProducto;
    }
}
