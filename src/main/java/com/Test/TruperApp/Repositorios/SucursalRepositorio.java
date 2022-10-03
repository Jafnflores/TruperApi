
package com.Test.TruperApp.Repositorios;

import com.Test.TruperApp.Modelos.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SucursalRepositorio extends JpaRepository<Sucursal,Integer> {
   
    @Query(value="Delete from SUCURSALES where SUCURSAL_ID =?1 ",nativeQuery=true)
    void borrarSucursal(int sucursal_id);
    
}
