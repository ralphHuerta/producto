package com.altaproducto.altaproducto.service;

import com.altaproducto.altaproducto.entity.Producto;
import com.altaproducto.altaproducto.model.AddProducto;
import com.altaproducto.altaproducto.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements  ProductoService {

    private ProductoRepository productoRepository;

    public  ProductoServiceImpl(ProductoRepository productoRepository){

        this.productoRepository = productoRepository;
    };
    @Override
    public Producto guardar(AddProducto producto) {
        Producto addproducto = Producto.from(producto);
        return productoRepository.save(addproducto);
    }

    @Override
    public Producto buscar(String id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> ProductoException.from("Produto no encontrado", id));
    }

    @Override
    public Producto editar(String id, AddProducto producto) {
        Producto productos = productoRepository.findById(id)
                .orElseThrow(() -> ProductoException.from("No s encontro producto", id));
        productos = productos.from(producto);
        productos = productoRepository.save(productos);
        return productos;
    }

    @Override
    public List<Producto> allProducto() {
        return productoRepository.findAll();
    }

    @Override
    public void eliminar(String id) {
        productoRepository.findById(id)
                .orElseThrow(() -> ProductoException.from("No se encontro producto", id));

        productoRepository.delete(id);
    }
}
