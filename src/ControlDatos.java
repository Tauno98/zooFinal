


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alain
 */
public class ControlDatos {
    private static Connection con= null ;
   public static Connection Conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://servidor.choto.es:3306/alu_Alain_zoo", "unalumno", "soyunalumno2022");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio unn error inesperado");
        }
        return con;
    }
    
   
    
    //El resulset y resulsetConcurrency, es para pedi datos concurrentes y el tipo
   public  static boolean ejecutarConsulta (int resultSetType, int resultSetConcurrency, String sql) {
       Conectar();
        try {
            
            Statement stmt =  con.createStatement();
            stmt.executeUpdate(sql);
//            stmt.close();
            return true;
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        

    }
   
   public static ResultSet consulta(int resultSetType, int resultSetConcurrency, String sql) {
       
       

        try {
            Statement stmt =  con.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            return res;
        } catch (SQLException e) {
            System.out.println("Error de consulta :" + e.getMessage());
        }
        return null;
    }
   
   public static void closeConnect(Connection con){
        try{
            if (con!= null) con.close();
        }catch(Exception e){
            System.out.println("Error cerrando conexiones: " + e.toString());
        }
    }

  
    
    
    
    
}

