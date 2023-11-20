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
public class DAOOrden {
    public Orden Insertar( java.sql.Date fecha_orden,java.sql.Time hora_orden,String no_mesa, int id_cliente) {
        String transaccion = "INSERT INTO Orden (fecha_orden,hora_orden,no_mesa,id_cliente) VALUES('"
                + fecha_orden + "', '"
                + hora_orden + "', '"
                + no_mesa + "', '"
                + id_cliente + "')";
                
             if (new Database().Actualizar(transaccion) > 0) {
             return new Orden(fecha_orden, hora_orden, no_mesa, id_cliente);
             }
        return null;
    }
    
    public int Actualizar (int id_orden, java.sql.Date fecha_orden, java.sql.Time hora_orden,
            String no_mesa, int id_cliente) {
        
         String transaccion = "UPDATE Orden SET fecha_orden='"
           + fecha_orden + "', hora_orden='"
           + hora_orden + "', no_mesa='"
           + no_mesa + "', id_cliente='"
           + id_cliente + "'WHERE id_orden="
           + id_orden;
         
        return new Database().Actualizar(transaccion);
    }
    
    public List obtenerDatos() {
      String transaccion = "SELECT * FROM orden";
      List<Map> registros = new Database().Listar(transaccion);
      List<Orden> Orden = new ArrayList();
      
      for (Map registro : registros ){
          Orden aut = new Orden 
          ((int) registro.get("id_orden"),
           (java.sql.Date) registro.get("fecha_orden"),
           (java.sql.Time) registro.get("hora_orden"),
           (String) registro.get("no_mesa"),
           (int) registro.get("id_cliente")); 
        Orden.add(aut);
    }
    return Orden;
    }
    
    public int Eliminar(int id_orden){
        String transaccion = "DELETE FROM Orden WHERE id_orden='"+ id_orden + "'";
        
        return new Database().Actualizar(transaccion);   
    }
    
    public List<Orden> buscarOrdenes(String termino) {
    String transaccion = "SELECT * FROM Orden WHERE " +
            "fecha_orden LIKE '%" + termino + "%' OR " +
            "hora_orden LIKE '%" + termino + "%' OR " +
            "no_mesa LIKE '%" + termino + "%' OR " +
            "id_cliente LIKE '%" + termino + "%'";

    List<Map> registros = new Database().Listar(transaccion);
    List<Orden> ordenes = new ArrayList<>();

    for (Map registro : registros) {
        Orden orden = new Orden(
                (int) registro.get("id_orden"),
                (java.sql.Date) registro.get("fecha_orden"),
                (java.sql.Time) registro.get("hora_orden"),
                (String) registro.get("no_mesa"),
                (int) registro.get("id_cliente")
        );
        ordenes.add(orden);
    }
    return ordenes;
}
}
