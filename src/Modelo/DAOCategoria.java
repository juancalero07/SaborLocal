/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.*;
/**
 *
 * @author HP
 */
public class DAOCategoria {
    public Categoria Insertar(String cate){
        String transaccion = "INSERT INTO Categoria (cate_produ) VALUES('"
                + cate + "')";
                
             if(new Database().Actualizar(transaccion) > 0){
             return new Categoria(cate);
             }
        return null;
    }
    
    public int Actualizar (int id_catg, String cate_produ) {
        
         String transaccion = "UPDATE Categoria SET cate_produ='"
           + cate_produ + "'WHERE id_catg="
           + id_catg ;
         
        return new Database().Actualizar(transaccion);
    }
    
    public List obtenerDatos() {
      String transacion = "SELECT * FROM categoria";
      List<Map>  registros = new Database().Listar(transacion);
      List<Categoria> Categoria = new ArrayList();
      
      for (Map registro : registros){
        Categoria aut = new Categoria((int) registro.get("id_catg"),
        (String) registro.get("cate_produ"));
        Categoria.add(aut);
    }
    return Categoria;
    }
    
    public int Eliminar(int id_catg){
        String transaccion = "DELETE FROM Categoria WHERE id_catg='"+ id_catg +"'";
        
        return new Database().Actualizar(transaccion);   
    }
    
    public List<Categoria> buscarCategorias(String termino) {
    String transaccion = "SELECT * FROM Categoria WHERE cate_produ LIKE '%" + termino + "%'";
    
    List<Map> registros = new Database().Listar(transaccion);
    List<Categoria> categorias = new ArrayList<>();
    
    for (Map registro : registros) {
        Categoria categoria = new Categoria((int) registro.get("id_catg"),
                                           (String) registro.get("cate_produ"));
        categorias.add(categoria);
    }   
    return categorias;
}
}
