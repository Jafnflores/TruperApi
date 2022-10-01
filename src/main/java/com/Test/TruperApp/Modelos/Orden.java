

package com.Test.TruperApp.Modelos;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.*;



@Entity
@Table(name = "ORDENES")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Integer orden_id;
   
    @ManyToOne
    private Sucursal sucursal; 
    
    @OneToMany
    private List<Producto> producto;

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }
    
    @Column(nullable=false)
    private Date fecha;

    @Column(nullable=false)
    private double total;

    public Integer getOrden_id() {
        return orden_id;
    }

    public void setOrden_id(Integer orden_id) {
        this.orden_id = orden_id;
    }

   
     
  
        
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    
   
   
    
    
}
