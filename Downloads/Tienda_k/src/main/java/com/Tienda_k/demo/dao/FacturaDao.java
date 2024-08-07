
package com.Tienda_k.demo.dao;

import com.Tienda_k.demo.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao extends JpaRepository <Factura,Long> {
     
}
