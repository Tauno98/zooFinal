/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alain
 */
public class transaciones {
        private static Connection con = null;
        public static final String URL ="jdbc:mysql://localhost:3306/zoo";
    public static final String USER = "root";
    public static final String CLAVE = "";
    public static void transaccion(String sql) {
        try {

            con = (Connection) DriverManager.getConnection(URL,USER,CLAVE);

            con.setAutoCommit(false); ////// ----->> Desactivamos auto commit

            Statement st = con.createStatement();

            // Crear un registro de envíos si se cumple una determinada condición
            if (st.executeUpdate(sql) != 0) {
                JOptionPane.showMessageDialog(null, "Transacción Correcta");
                con.commit();  ///// ---->> reflejar las operaciones en la base de datos

            } else {
                JOptionPane.showMessageDialog(null, "Error, desacemos los cambios");
                con.rollback(); ///// -----> Deshacer operaciones
            }
        } catch (SQLException e) {  //Si se produce una Excepción deshacemos las operaciones

            //System.out.println(e.toString());
            if (con != null) {
                try {
                    JOptionPane.showMessageDialog(null, "Error, desacemos los cambios");
                    con.rollback();///// -----> Deshacer operaciones
                } catch (SQLException ex) {
                    //System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Error, desacemos los cambios");
                }
            }

        } 
    }
}
