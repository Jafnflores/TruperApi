


package com.Test.TruperApp.Modelos;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.*;




@Entity
@Table(name = "SUCURSALES")
public class Sucursal {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(unique =true, nullable = false)
        private Integer sucursal_id;
        
        @Column(nullable=false, length = 50)
        private String nombre;

        

    public String getNombre() {
        return nombre;
    }

    public Integer getSucursal_id() {
        return sucursal_id;
    }

    public void setSucursal_id(Integer sucursal_id) {
        this.sucursal_id = sucursal_id;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
        
        
    
}
