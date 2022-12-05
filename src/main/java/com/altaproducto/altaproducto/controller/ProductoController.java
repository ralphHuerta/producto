package com.altaproducto.altaproducto.controller;

import com.altaproducto.altaproducto.model.AddProducto;
import com.altaproducto.altaproducto.service.ProductoServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("procto/v1")
public class ProductoController {
    private static final Logger log = Logger.getLogger(String.valueOf(ProductoController.class));

    private ProductoServiceImpl productoServiceImp;

    @PostMapping(path = "/agregar")
    public  String crear(@RequestBody AddProducto addProducto){
        String response = null;
        try {
            response = String.valueOf(productoServiceImp.guardar(addProducto));
        } catch (Exception e){
            System.out.println("Error" + e);
        }
        return response;
    }
}
