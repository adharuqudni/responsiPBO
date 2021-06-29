/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.view;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import responsi.controller.*;

/**
 *
 * @author user
 */
public class ViewMenuUtama extends JFrame implements ActionListener{
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    JLabel ljudul = new JLabel("Main Menu");
    
    //button
    JButton btambah = new JButton("Tambah Karyawan");
    JButton blihat = new JButton("Lihat Karyawan");

    public ViewMenuUtama(){
        setTitle("Menu Utama");
        setSize(175,225);
        setVisible(true);
        this.setLayout(null);
        
        setLocationRelativeTo(null);
        this.add(ljudul);
        this.add(btambah);
        this.add(blihat);
        
        
        ljudul.setFont(new Font("Baskerville Old Face",Font.BOLD,21));
        
        ljudul.setBounds(25,10, 250, 35);
        btambah.setBounds(15, 60, 125, 50);
        blihat.setBounds(15, 120, 125, 50);
        
        btambah.addActionListener(this);
        blihat.addActionListener(this);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == blihat){
            controllerMenuUtama.viewLihat(this);
        }
        if (e.getSource() == btambah){
            controllerMenuUtama.viewTambah(this);
        }
    }
}
