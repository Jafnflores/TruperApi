

package com.Test.TruperApp.Controlador;

import com.Test.TruperApp.Modelos.Producto;
import com.Test.TruperApp.Servicios.ProductoServicio;
import java.util.List;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/Producto")
public class ProductoControlador {

    private final ProductoServicio productoservicio;

    public ProductoControlador(ProductoServicio productoservicio) {
        this.productoservicio = productoservicio;
    }
    
    
    @PostMapping
     public Producto guardarProducto(@RequestBody Producto producto){
      return productoservicio.guardarProducto(producto);
    }
    
    
    @GetMapping
    public List<Producto> obtenerProductos(){
      return productoservicio.obtenerProductos();
    }
         
    
    @DeleteMapping(value="/{idP}")
    public void borrarProducto(@PathVariable("idP") int idP){
      productoservicio.borrarProducto(idP);
    }

    @PutMapping("/actualiza")
   public Producto actualizaProducto(@RequestBody Producto producto)
   {
      return productoservicio.guardarProducto(producto);
   }
    
}
