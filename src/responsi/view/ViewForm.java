/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import responsi.controller.*;

/**
 *
 * @author user
 */
public class ViewForm extends JFrame implements ActionListener {
    ControllerForm controllerForm = new ControllerForm();
    
 protected String judul;

    
private JTextField fnama = new JTextField();
private JTextField fgaji = new JTextField();
private JTextField fusia = new JTextField();
JLabel lnama = new JLabel("NAMA:");
JLabel lgaji = new JLabel("GAJI:");
JLabel lusia = new JLabel("USIA:");
JLabel ljudul = new JLabel("");
JButton buttonSubmit = new JButton("Submit");
JButton buttonReset = new JButton("Reset");
JButton buttonKembali = new JButton("Kembali");

    
    public ViewForm(String judul) {
        
        setTitle("Menu Utama");
        setSize(210,260);
        setVisible(true);
        
        this.judul = judul;
        
        ljudul.setText(this.judul);
        
        this.setLayout(null);
        this.add(fnama);
        this.add(fgaji);
        this.add(fusia);
        this.add(lnama);
        this.add(lgaji);
        this.add(lusia);
        this.add(ljudul);
        this.add(buttonSubmit);
        this.add(buttonReset);
        this.add(buttonKembali);
              
        buttonSubmit.setBackground(Color.BLUE);
        buttonReset.setBackground(Color.RED);

        fnama.setBounds(70, 50, 125, 20);
        fgaji.setBounds(70, 80, 125, 20);
        fusia.setBounds(70, 110, 125, 20);
        lnama.setBounds(10, 50, 40, 20);
        lgaji.setBounds(10, 80, 40, 20);
        lusia.setBounds(10, 110, 40, 20);
        ljudul.setBounds(10, 10, 250, 20);
        buttonSubmit.setBounds(35, 160, 75, 25);
        buttonReset.setBounds(120, 160, 75, 25);
        buttonKembali.setBounds(0, 200, 195, 20);
        
        

        
        buttonSubmit.addActionListener(this);
        buttonReset.addActionListener(this);
        buttonKembali.addActionListener(this);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public JTextField getFnama() {
        return fnama;
    }

    public JTextField getFgaji() {
        return fgaji;
    }

    public JTextField getFusia() {
        return fusia;
    }


    @Override
    public void actionPerformed(ActionEvent e){
       
    }

}
