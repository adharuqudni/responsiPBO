/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.model;

/**
 *
 * @author user
 */
public class Karyawan {
    private int id;
    private String nama;
    private int usia;
    private double gaji;

    public Karyawan(int id, String nama, int usia, double gaji) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.gaji = gaji;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
}
