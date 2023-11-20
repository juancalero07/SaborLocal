/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mysql.cj.xdevapi.Statement;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class DAOCliente {
    public Cliente Insertar(String nom_cl,String apelli_cl,String cedula_cl,String tele_cl) {
        String transaccion = "INSERT INTO Cliente (nom_cl,apelli_cl,cedula_cl,tele_cl) VALUES('"
                + nom_cl + "', '"
                + apelli_cl + "', '"
                + cedula_cl + "', '"
                + tele_cl + "')";
                
             if (new Database().Actualizar(transaccion) > 0) {
             return new Cliente(nom_cl, apelli_cl, cedula_cl, tele_cl);
             }
        return null;
    }
    
    public int Actualizar (int id_cliente, String nom_cl, String apelli_cl, String cedula_cl, String tele_cl) {
        
         String transaccion = "UPDATE Cliente SET nom_cl='"
           + nom_cl + "', apelli_cl='"
           + apelli_cl + "', cedula_cl='"
           + cedula_cl + "', tele_cl= '"
           + tele_cl + "'WHERE id_cliente= "
           + id_cliente ;
         
        return new Database().Actualizar(transaccion);
    }
    
    public List obtenerDatos() {
      String transaccion = "SELECT * FROM Cliente";
      List<Map> registros = new Database().Listar(transaccion);
      List<Cliente> Cliente = new ArrayList();
      
      for (Map registro : registros ){
          Cliente aut = new Cliente ((int) registro.get("id_cliente"),
           (String) registro.get("nom_cl"),
           (String) registro.get("apelli_cl"),
           (String) registro.get("cedula_cl"),
           (String) registro.get("tele_cl")); 
        Cliente.add(aut);
    }
    return Cliente;
    }
    
    public int Eliminar(int id_cliente){
        String transaccion = "DELETE FROM Cliente WHERE id_cliente='"+ id_cliente +"'";
        
        return new Database().Actualizar(transaccion);   
    }
    
    public List<Cliente> buscarClientes(String termino) {
    String transaccion = "SELECT * FROM Cliente WHERE " +
                         "nom_cl LIKE '%" + termino + "%' OR " +
                         "apelli_cl LIKE '%" + termino + "%' OR " +
                         "cedula_cl LIKE '%" + termino + "%' OR " +
                         "tele_cl LIKE '%" + termino + "%'";
    
    List<Map> registros = new Database().Listar(transaccion);
    List<Cliente> clientes = new ArrayList<>();
    
    for (Map registro : registros) {
        Cliente cliente = new Cliente((int) registro.get("id_cliente"),
                                      (String) registro.get("nom_cl"),
                                      (String) registro.get("apelli_cl"),
                                      (String) registro.get("cedula_cl"),
                                      (String) registro.get("tele_cl"));
        clientes.add(cliente);
    }
    return clientes;
}
}

