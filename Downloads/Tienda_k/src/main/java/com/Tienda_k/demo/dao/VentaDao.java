
package com.Tienda_k.demo.dao;


import com.Tienda_k.demo.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends JpaRepository <Venta,Long> {
     
}
