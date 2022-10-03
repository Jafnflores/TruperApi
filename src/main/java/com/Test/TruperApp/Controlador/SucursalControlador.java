

package com.Test.TruperApp.Controlador;

import com.Test.TruperApp.Modelos.Sucursal;
import com.Test.TruperApp.Servicios.SucursalServicio;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/Sucursal")
public class SucursalControlador {

     private final SucursalServicio sucursalservicio;

    
    public SucursalControlador(SucursalServicio sucursalservicio) {
        this.sucursalservicio = sucursalservicio;
    }
     
     
    @GetMapping()
    public List<Sucursal> obtenerSucursales(){
        return sucursalservicio.obtenerSucursales();
    }
    
    @PostMapping()
    public Sucursal guardarSucursal(@RequestBody Sucursal sucursal){
     return sucursalservicio.guardarSucursal(sucursal);
    }
    
    @DeleteMapping(value="/{sucursal_id}")
    public void borrarSucursal(@PathVariable("sucursal_id") int sucursal_id){
        sucursalservicio.borrarSucursal(sucursal_id);
     }
    
    @PutMapping(value="/sucursalActualizar")
    public Sucursal actualizarSucursal(@RequestBody Sucursal producto){
     return sucursalservicio.guardarSucursal(producto);
    }
    
    
}
