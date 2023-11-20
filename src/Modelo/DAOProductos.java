/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class DAOProductos {
    
        public Productos Insertar(String nom_produ,float precio_comp,String descrip_produ,int id_catg) {
        String transaccion = "INSERT INTO Productos (nom_produ,descrip_produ,precio_comp,id_catg) VALUES('"
                + nom_produ + "', '"
                + descrip_produ + "', '"
                + precio_comp + "', '"
                + id_catg + "')";
                
             if (new Database().Actualizar(transaccion) > 0) {
             return new Productos(nom_produ, precio_comp, descrip_produ, id_catg);
             }
        return null;
    }
    
    public int Actualizar (int id_produ, String nom_produ, float precio_comp , String descrip_produ , int id_catg) {
        
         String transaccion = "UPDATE Productos SET nom_produ='"
           + nom_produ + "', precio_comp='"
           + precio_comp + "', descrip_produ= '"
           + descrip_produ + "', id_catg= '"
           + id_catg + "' WHERE id_produ="
           + id_produ ;
         
        return new Database().Actualizar(transaccion);
    }
    
    public List obtenerDatos() {
      String transaccion = "SELECT * FROM Productos";
      List<Map>  registros = new Database().Listar(transaccion);
      List<Productos> Productos = new ArrayList();
      
      for (Map registro : registros ){
          Productos aut = new Productos ((int) registro.get("id_produ"),
           (String) registro.get("nom_produ"),
           (float) registro.get("precio_comp"),
           (String) registro.get("descrip_produ"),
           (int) registro.get("id_catg")); 
        Productos.add(aut);
    }
    return Productos;
    }
    
    public int Eliminar(int id_produ){
        String transaccion = "DELETE FROM Productos WHERE id_produ='"+ id_produ +"'";
        
        return new Database().Actualizar(transaccion);   
    }

    public List<Productos> buscarProductos(String termino) {
    String transaccion = "SELECT * FROM Productos WHERE " +
                         "id_produ LIKE '%" + termino + "%' OR " +
                         "nom_produ LIKE '%" + termino + "%' OR " +
                         "descrip_produ LIKE '%" + termino + "%'"; 

    List<Map> registros = new Database().Listar(transaccion);
    List<Productos> productos = new ArrayList<>();

    for (Map registro : registros) {
        Productos producto = new Productos((int) registro.get("id_produ"),
                                          (String) registro.get("nom_produ"),
                                          (float) registro.get("precio_comp"),
                                          (String) registro.get("descrip_produ"),
                                          (int) registro.get("id_catg"));
        productos.add(producto);
    }

    return productos;
}
}


