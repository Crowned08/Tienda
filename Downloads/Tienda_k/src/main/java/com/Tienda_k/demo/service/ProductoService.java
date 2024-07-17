
package com.Tienda_k.demo.service;

import com.Tienda_k.demo.domain.Producto;
import java.util.List;


public interface ProductoService {
    //Se recupera la lista de productos de la tabla "producto" dentro de un ArrayList
    public List<Producto>getProductos(boolean activo);
    
    //Se obtiene un registro de ctegorias en un objeto de tipo producto. 
    //Si el idProducto existe, si no es null
    public Producto getProducto(Producto producto);
    
    //Se crea un nuevo registro en la tabla producto, si el objeto producto no tiene
    //idProducto se actualiza el registro de la tabla producto, si el objetio producto
    //tiene un idProducto
    public void save(Producto producto);
    
    public void delete(Producto producto);
    
    public List<Producto> consulta1(double precioInf, double precioSup);
}
