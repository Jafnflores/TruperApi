
package com.Test.TruperApp.Controlador;

import com.Test.TruperApp.Modelos.Orden;
import com.Test.TruperApp.Servicios.OrdenServicio;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Orden")
public class OrdenControlador {

    private final OrdenServicio ordenservicio;

    public OrdenControlador(OrdenServicio ordenservicio) {
        this.ordenservicio = ordenservicio;
    }
    
    @GetMapping()
    public List<Orden> obtenerOrdenes(){    
      return ordenservicio.obtenerOrdenes();
    } 
   
    
    @GetMapping("/porsucursal")
    public List<Orden> obtenerOrdenesPorSucursal(int numID){    
      return ordenservicio.obtenerPorSucursal(numID);
    }
    
    
    @PostMapping()
    public Orden guardarOrden(@RequestBody Orden orden){
      return ordenservicio.guardarOrdenes(orden);
    }
    
    @DeleteMapping(value = "/borrarOrden/{orden_id}")
    public void borrarOrden(@PathVariable ("orden_id") int orden_id){
      ordenservicio.borrarOrden(orden_id);
    
    }
    
    
    
}
