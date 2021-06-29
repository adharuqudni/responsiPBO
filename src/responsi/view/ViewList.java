/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;
import javax.swing.table.*;
import responsi.controller.ControllerList;
import responsi.model.Karyawan;

/**
 *
 * @author user
 */
public class ViewList extends JFrame implements MouseListener, ActionListener {
    ControllerList controllerList = new ControllerList();
    
    JLabel ljudul = new JLabel("Data Karyawan");
    JButton buttonBack = new JButton("Kembali");    
    JTable tabel;
    DefaultTableModel model;
    Karyawan[] karyawans = new Karyawan[500];
    
    public ViewList(Karyawan[] karyawans){
        addMouseListener(this); 
        this.karyawans = karyawans;
        setTitle("Data Karyawan");
        setSize(600,380);
        setVisible(true);
        setLayout(null);
        this.add(ljudul);
        ljudul.setFont(new Font("Century Gothic",Font.BOLD,18));
        ljudul.setBounds(10, 10, 250, 30);
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "Nama", "Usia", "Gaji"});
        tabel = new JTable(model);
        					
        TableColumn column;
        tabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = tabel.getColumnModel().getColumn(0); 
        column.setPreferredWidth(50);
        column = tabel.getColumnModel().getColumn(1); 
        column.setPreferredWidth(250); 
        column = tabel.getColumnModel().getColumn(2); 
        column.setPreferredWidth(50); 
        column = tabel.getColumnModel().getColumn(3); 
        column.setPreferredWidth(200); 
             
        tabel.setSelectionBackground(Color.gray);
        tabel.setSelectionForeground(Color.white);
        tabel.setRowSelectionAllowed(true);
        tabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        tabel.setFont(new Font("Century Gothic",Font.PLAIN,14));
        
        JScrollPane scroll = new JScrollPane(tabel);
        this.add(scroll);
        this.addData();
        scroll.setBounds(20,50,550,250);
        
        
        this.add(buttonBack);
        buttonBack.setBounds(0,320,600,20);
        
        buttonBack.addActionListener(this);
        tabel.addMouseListener(this); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addData() {
        Karyawan[] list = this.karyawans;
       for (Karyawan karyawan : list) {//type value : values
            try {
                model.addRow(new Object[]{karyawan.getId(), karyawan.getNama(),
                    karyawan.getUsia(), String.format("%,.2f", karyawan.getGaji())});
            } catch (Exception e) {

            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (tabel.getSelectedRow() != -1) {
            int index = tabel.getSelectedRow() ;
            controllerList.viewPerhitunganGaji(this, karyawans[index]);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == buttonBack){
            controllerList.back(this);
        }
    }
}
