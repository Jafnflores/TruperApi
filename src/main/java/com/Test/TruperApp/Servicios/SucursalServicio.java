package com.Test.TruperApp.Servicios;

import com.Test.TruperApp.Modelos.Sucursal;
import com.Test.TruperApp.Repositorios.SucursalRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;



@Service
public class SucursalServicio {

    private final SucursalRepositorio sucursalrepositorio;

    public SucursalServicio(SucursalRepositorio sucursalrepositorio) {
        this.sucursalrepositorio = sucursalrepositorio;
    }
    
    
    public List<Sucursal> obtenerSucursales(){
        return this.sucursalrepositorio.findAll();          
    }
    
    
    public Sucursal guardarSucursal(Sucursal sucursal){
    
        return this.sucursalrepositorio.save(sucursal);
    }
    
    public void borrarSucursal(int sucursal_id){
       sucursalrepositorio.deleteById(sucursal_id);
    }
    
    
}
