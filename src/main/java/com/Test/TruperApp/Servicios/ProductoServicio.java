
package com.Test.TruperApp.Servicios;

import com.Test.TruperApp.Modelos.Producto;
import com.Test.TruperApp.Repositorios.ProductoRepositorio;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class ProductoServicio {

    
    private final ProductoRepositorio productorepositorio;

    public ProductoServicio(ProductoRepositorio productorepositorio) {
        this.productorepositorio = productorepositorio;
    }
    
    
    public List<Producto> obtenerProductos(){
       return this.productorepositorio.findAll();
    }
    
    public Producto guardarProducto(Producto producto){
    
       return this.productorepositorio.save(producto);
    }
    
    public void borrarProducto(int idP){
       this.productorepositorio.deleteById(idP);
    }
    
}
