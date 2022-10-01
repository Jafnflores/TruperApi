

package com.Test.TruperApp.Controlador;

import com.Test.TruperApp.Modelos.Orden;
import com.Test.TruperApp.Servicios.OrdenServicio;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Orden")
public class OrdenControlador {

    private final OrdenServicio ordenservicio;

    public OrdenControlador(OrdenServicio ordenservicio) {
        this.ordenservicio = ordenservicio;
    }
    
    @GetMapping()
    public List<Orden> obtenerOrdenes(){    
      return this.ordenservicio.obtenerOrdenes();
    } 
   
    
    @GetMapping("/porsucursal")
    public List<Orden> obtenerOrdenesPorSucursal(int numID){    
      return this.ordenservicio.obtenerPorSucursal(numID);
    }
    
    
    @PostMapping()
    public Orden guardarOrden(@RequestBody Orden orden){
      return this.ordenservicio.guardarOrdenes(orden);
    }
    
    
    
}
