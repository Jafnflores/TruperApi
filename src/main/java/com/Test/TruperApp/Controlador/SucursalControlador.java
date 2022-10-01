

package com.Test.TruperApp.Controlador;

import com.Test.TruperApp.Modelos.Sucursal;
import com.Test.TruperApp.Servicios.SucursalServicio;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Sucursal")
public class SucursalControlador {

     private final SucursalServicio sucursalservicio;

    public SucursalControlador(SucursalServicio sucursalservicio) {
        this.sucursalservicio = sucursalservicio;
    }
     
     
    @GetMapping()
    public List<Sucursal> obtenerSucursales(){
        var auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getPrincipal());
        System.out.println(auth.getAuthorities());
        System.out.println(auth.isAuthenticated());
        
        return this.sucursalservicio.obtenerSucursales();
    }
    
    @PostMapping()
    public Sucursal guardarSucursal(@RequestBody Sucursal sucursal){
     return this.sucursalservicio.guardarSucursal(sucursal);
    }
    
    
    
}
