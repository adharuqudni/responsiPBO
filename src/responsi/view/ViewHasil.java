/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import responsi.controller.ControllerHasil;
import responsi.model.Karyawan;

/**
 *
 * @author user
 */
public class ViewHasil extends JFrame implements ActionListener{
    ControllerHasil controllerHasil = new ControllerHasil();
    JLabel flembur = new JLabel();
    JLabel fnama = new JLabel();
    JLabel fgaji = new JLabel();
    JLabel fusia = new JLabel();
    JLabel lnama = new JLabel("NAMA:");
    JLabel lgaji = new JLabel("GAJI:");
    JLabel lusia = new JLabel("USIA:");
    JLabel llembur = new JLabel("TOTAL GAJI:");
    JLabel ljudul = new JLabel("Menghitung Gaji");
    JButton buttonKembali = new JButton("Kembali");
    
    public ViewHasil(Karyawan karyawan, int total) {

        setTitle("Menghitung Gaji");
        setSize(300,300);
        setVisible(true);
        
        setLocationRelativeTo(null);
        
        fnama.setText(karyawan.getNama());
        fusia.setText(String.valueOf(karyawan.getUsia()));
        fgaji.setText(String.valueOf(String.format("%,.2f", karyawan.getGaji())));
        flembur.setText(String.format("%,.2f", (total*25000)+karyawan.getGaji()));
        
        this.setLayout(null);
        this.add(fnama);
        this.add(fgaji);
        this.add(fusia);
        this.add(flembur);
        this.add(lnama);
        this.add(lgaji);
        this.add(lusia);
        this.add(ljudul);
        this.add(llembur);   
        this.add(buttonKembali);
        
        ljudul.setBounds(10, 10, 250, 20);
        fnama.setBounds(150, 50, 125, 20);
        fgaji.setBounds(150, 80, 125, 20);
        fusia.setBounds(150, 110, 125, 20);
        lnama.setBounds(10, 50, 40, 20);
        lgaji.setBounds(10, 80, 40, 20);
        lusia.setBounds(10, 110, 40, 20);
        flembur.setBounds(150, 140, 100, 20);
        llembur.setBounds(10, 140, 120, 20);
        buttonKembali.setBounds(10, 220, 85, 25);
        
        buttonKembali.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
     @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == buttonKembali){
            controllerHasil.back(this);
        }

    }
}
