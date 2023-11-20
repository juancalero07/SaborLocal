/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class Database {
private final String URL="jdbc:mysql://localhost:3307/dbluisjavier2";
    private final String user="juancalero";
    private final String password="juancalero";
    
    private Connection conexion;
    public Database() {
        try {
        conexion=DriverManager.getConnection(URL, user, password);
        System.out.println("Conexion Establecida");
        
        } catch (Exception e) {
            System.out.println("Error de conexión");
            e.printStackTrace();
           
        }   
    }
    
    public int Actualizar (String consulta){
            try {
                Statement st=conexion.createStatement();
                return st.executeUpdate(consulta);
            } catch (SQLException e) {
               // e.printStackTrace();
                System.out.println(e);
            }
            return 1; 
    }
    
    private List OrganizarDatos(ResultSet rs){
        List filas=new ArrayList();
        try {
            
            int numColumnas=rs.getMetaData().getColumnCount();
            while (rs.next()){
            Map<String, Object> renglon=new HashMap();
            for (int i=1; i<=numColumnas; i++){
                
            String nombreCampo=rs.getMetaData().getColumnName(i);
            Object valor=rs.getObject(nombreCampo);
            renglon.put(nombreCampo, valor);
            }
            filas.add(renglon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filas;   
    }
    
    public List Listar(String consulta){
        ResultSet rs=null;
        List resultado=new ArrayList();
        try {
                Statement st=conexion.createStatement();
                rs=st.executeQuery(consulta);
                resultado=OrganizarDatos(rs);
                
        } catch (SQLException e) {
            System.out.println("No se realizo la consulta");
            e.printStackTrace();
        }
        return resultado;
        
    }
    private void cerrarConexion(){
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
    
     public List<Map<String, Object>> buscarRegistros(String termino) {
        ResultSet rs = null;
        List<Map<String, Object>> resultados = new ArrayList<>();
        try {
            String consulta = "SELECT * FROM Cliente WHERE columna id_cliente";
            try (var preparedStatement = conexion.prepareStatement(consulta)) {
                preparedStatement.setString(1, "%" + termino + "%");
                
                rs = preparedStatement.executeQuery();
                
                resultados = OrganizarDatos(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error al realizar la búsqueda");
            e.printStackTrace();
        } finally {
         
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return resultados;
    }
  
}

