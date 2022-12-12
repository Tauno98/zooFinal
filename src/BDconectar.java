/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author alainfernandeznunez
 */
public class BDconectar {
     private String host;
    private String puerto;
    private String dbName;
    private String user;
    private String pass;

    public BDconectar(String host, String puerto, String dbName, String user, String pass) {
        this.host = host;
        this.puerto = puerto;
        this.dbName = dbName;
        this.user = user;
        this.pass = pass;
    }    
    
    public Connection makeConnect(){
        try{
            String url="jdbc:mysql://" + this.host+":"+this.puerto+"/"+this.dbName;
            Connection conex = DriverManager.getConnection(url,this.user,this.pass);
            return conex;
        }catch(SQLException ex){
            System.out.println("Error al establecer la conexion " + ex.getMessage());
            return null;
        }
    }
    
    public void closeConnect(Connection con){
        try{
            if (con!= null) con.close();
        }catch(Exception e){
            System.out.println("Error cerrando conexiones: " + e.toString());
        }
    } 
    
    
    
}
