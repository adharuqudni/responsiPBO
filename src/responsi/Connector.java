/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.sql.*;
/**
 *
 * @author user
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/responsiPBO?serverTimezone=UTC";
    String DBusername = "root";
    String DBpassword = "";
    public Connection koneksi;
    public Statement statement;
    public Connector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
