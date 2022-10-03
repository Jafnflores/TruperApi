

package com.Test.TruperApp.Servicios;

import com.Test.TruperApp.Modelos.Orden;
import com.Test.TruperApp.Repositorios.OrdenRepositorio;
import java.util.List;
import org.springframework.stereotype.Service;



@Service
public class OrdenServicio {

    
    private final OrdenRepositorio ordenrepositorio;

    public OrdenServicio(OrdenRepositorio ordenrepositorio) {
       
        this.ordenrepositorio = ordenrepositorio;
    
    }
    
    
    public List<Orden> obtenerOrdenes(){
        
      return ordenrepositorio.findAll();
    
    }
    
    
    public Orden guardarOrdenes(Orden orden){
        
      return ordenrepositorio.save(orden);
    
    }
    
    
    public List<Orden> obtenerPorSucursal(int numID){
      return ordenrepositorio.ordenesPorSucursal(numID);
    }
    
    
    public void borrarOrden(int orden_id){
       ordenrepositorio.deleteById(orden_id);
    }
    
    
}
