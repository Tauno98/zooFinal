
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alain
 */
public class Conectar {
//     public static final String URL ="jdbc:mysql://localhost:3306/zoo";
//    public static final String USER = "root";
//    public static final String CLAVE = "";

    public static final String URL = "jdbc:mysql://servidor.choto.es:3306/alu_Alain_zoo";
    public static final String USER = "unalumno";
    public static final String CLAVE = "soyunalumno2022";
    private static Connection con = null;

//    public Conectar(Connection con) {
//        this.con = con;
//    }
    public Connection getConexion() {

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

   

}
