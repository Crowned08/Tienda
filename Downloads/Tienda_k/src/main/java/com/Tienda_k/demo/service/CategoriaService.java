
package com.Tienda_k.demo.service;

import com.Tienda_k.demo.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    //Se recupera la lista de categorias de la tabla "categoria" dentro de un ArrayList
    public List<Categoria>getCategorias(boolean activo);
    
    //Se obtiene un registro de ctegorias en un objeto de tipo categoria. 
    //Si el idCategoria existe, si no es null
    public Categoria getCategoria(Categoria categoria);
    
    //Se crea un nuevo registro en la tabla categoria, si el objeto categoria no tiene
    //idCategoria se actualiza el registro de la tabla categoria, si el objetio categoria
    //tiene un idCategoria
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
}
