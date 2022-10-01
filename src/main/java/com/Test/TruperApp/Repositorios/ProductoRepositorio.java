/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Test.TruperApp.Repositorios;

import com.Test.TruperApp.Modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {
    
}
