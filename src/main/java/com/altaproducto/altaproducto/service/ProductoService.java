package com.altaproducto.altaproducto.service;

import com.altaproducto.altaproducto.entity.Producto;
import com.altaproducto.altaproducto.model.AddProducto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoService {

    Producto guardar(AddProducto producto);
    Producto buscar(String id);
    Producto editar(String id, AddProducto producto);
    List<Producto> allProducto();
    void  eliminar(String id);

}
