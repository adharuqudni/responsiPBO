/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.model;

import java.sql.*;
import responsi.Connector;

/**
 *
 * @author user
 */
public class ModelKaryawan {
    Karyawan data[] = new Karyawan[100]; 
    Connector connector = new Connector();  
    
    
    public Karyawan[] getAll(){
         try{
            int jmlData = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String query = "Select * from `karyawan`"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                int id = resultSet.getInt("id");
                int usia = resultSet.getInt("usia");
                double gaji = resultSet.getDouble("gaji");
                String nama = resultSet.getString("nama");
                data[jmlData] = new Karyawan(id,nama,usia,gaji);
                jmlData++;
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data;
    }
    
    public Karyawan getOne(String ids){
         try{
            String query = "Select * from `karyawan` where `id` ='"+ids+"'"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                int id = resultSet.getInt("id");
                int usia = resultSet.getInt("usia");
                double gaji = resultSet.getDouble("gaji");
                String nama = resultSet.getString("nama");
                data[0] = new Karyawan(id,nama,usia,gaji);
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data[0];
    }
    
     public String create(Karyawan karyawan){
         String message = "Bad Request";
         try{
                String nama = karyawan.getNama();
                int usia = karyawan.getUsia();
                double gaji = karyawan.getGaji();
            String query = "INSERT INTO `karyawan`(`nama`, `usia`,`gaji`) VALUES ('"+nama+"',"+usia+","+gaji+")"; 
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query); 
            message = "Queri Berhasil";
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return message;
    }
    public String update(Karyawan karyawan) {
        String message = "Bad Request";
        try {
            String query = "UPDATE karyawan SET nama = '"+karyawan.getNama()+"',usia = "+karyawan.getUsia()+",gaji = "+karyawan.getGaji()+" WHERE id = '" + karyawan.getId() + "'";
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);
            message = "Queri Berhasil";
            connector.statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        return message;
    }
    public String delete(int id) {
        String message = "Bad Request";
        try {
            String query = "DELETE FROM karyawan WHERE id = '" + id + "'";
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);
            message = "Queri Berhasil";
            connector.statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        return message;
    }
}
