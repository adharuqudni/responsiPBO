/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.view;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import responsi.controller.ControllerHitungGaji;
import responsi.model.Karyawan;

/**
 *
 * @author user
 */
public class ViewHitungGaji extends JFrame implements ActionListener{
    ControllerHitungGaji controllerHitungGaji = new ControllerHitungGaji();
    
    private JTextField flembur = new JTextField();
    JLabel fnama = new JLabel();
    JLabel fgaji = new JLabel();
    JLabel fusia = new JLabel();
    JLabel lnama = new JLabel("NAMA:");
    JLabel lgaji = new JLabel("GAJI:");
    JLabel lusia = new JLabel("USIA:");
    JLabel llembur = new JLabel("WAKTU LEMBUR:");
    JLabel ljudul = new JLabel("Menghitung Gaji");
    JButton buttonSubmit = new JButton("Edit");
    JButton buttonReset = new JButton("Hapus");
    JButton buttonKembali = new JButton("Kembali");
    
    JButton buttonGaji = new JButton("Total Gaji");

    Karyawan karyawan;
    public ViewHitungGaji(Karyawan karyawan) {
        
        setTitle("Menghitung Gaji");
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        this.karyawan = karyawan;
        fnama.setText(karyawan.getNama());
        fusia.setText(String.valueOf(karyawan.getUsia()));
        fgaji.setText(String.format("%,.2f", karyawan.getGaji()));
        
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
        this.add(buttonSubmit);
        this.add(buttonReset);
        this.add(buttonKembali);  
        this.add(buttonGaji);
              
        buttonSubmit.setBackground(Color.BLUE);
        buttonReset.setBackground(Color.RED);
        
        ljudul.setBounds(10, 10, 250, 20);
        fnama.setBounds(150, 50, 125, 20);
        fgaji.setBounds(150, 80, 125, 20);
        fusia.setBounds(150, 110, 125, 20);
        lnama.setBounds(10, 50, 40, 20);
        lgaji.setBounds(10, 80, 40, 20);
        lusia.setBounds(10, 110, 40, 20);
        flembur.setBounds(150, 140, 100, 20);
        llembur.setBounds(10, 140, 120, 20);
        buttonGaji.setBounds(80, 170, 100, 30);
        buttonSubmit.setBounds(100, 220, 85, 25);
        buttonReset.setBounds(190, 220, 85, 25);
        buttonKembali.setBounds(10, 220, 85, 25);
        
       
        
        buttonSubmit.addActionListener(this);
        buttonReset.addActionListener(this);
        buttonKembali.addActionListener(this);
        buttonGaji.addActionListener(this);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public JTextField getFlembur() {
        return flembur;
    }



    @Override
    public void actionPerformed(ActionEvent e){
        int total = Integer.parseInt(this.flembur.getText());
        if (e.getSource() == buttonSubmit){
            controllerHitungGaji.edit(this, karyawan);
        }
        if (e.getSource() == buttonReset){
            controllerHitungGaji.delete(this, karyawan.getId());
        }
        if (e.getSource() == buttonKembali){
            controllerHitungGaji.back(this);
        }
        if (e.getSource() == buttonGaji){
            controllerHitungGaji.viewHasil(this, karyawan,total );
        }
    }

}
