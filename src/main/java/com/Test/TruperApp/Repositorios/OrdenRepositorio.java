package com.Test.TruperApp.Repositorios;

import com.Test.TruperApp.Modelos.Orden;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface OrdenRepositorio extends JpaRepository<Orden,Integer> {

    @Query("from Orden v where v.orden_id = ?1")
    List<Orden> ordenesPorSucursal(int numID);
    
}
