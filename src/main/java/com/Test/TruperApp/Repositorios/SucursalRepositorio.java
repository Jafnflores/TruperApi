
package com.Test.TruperApp.Repositorios;

import com.Test.TruperApp.Modelos.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SucursalRepositorio extends JpaRepository<Sucursal,Integer> {
    
}
