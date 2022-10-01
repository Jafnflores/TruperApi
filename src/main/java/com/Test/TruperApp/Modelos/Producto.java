
package com.Test.TruperApp.Modelos;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTOS")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer producto_id;
    
    @Column(nullable = false,length = 20)
     private String codigo;

     @Column(nullable = false, length = 200)
     private String descripcion;
     
     @Column(nullable=false)
     private Double precio;
   
    
     public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     
   
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion; 
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
      public Integer getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(Integer producto_id) {
        this.producto_id = producto_id;
    }

     

}
