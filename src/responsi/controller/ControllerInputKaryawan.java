/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.controller;

import javax.swing.JOptionPane;
import responsi.model.*;
import responsi.view.*;

/**
 *
 * @author user
 */
public class ControllerInputKaryawan {
    public void addKaryawan(ViewInputKaryawan input){
        try{
            String nama = input.getFnama().getText();
            int usia = Integer.parseInt(input.getFusia().getText());
            double gaji = Double.parseDouble(input.getFgaji().getText());
            
            if(usia <= 0 || gaji < 0){
                throw new ArithmeticException("Bilangan Harus Positif");  
            }
            
            Karyawan baru = new Karyawan(0,nama,usia,gaji);
        
            ModelKaryawan mk = new ModelKaryawan();
            String msg = mk.create(baru);
            JOptionPane.showMessageDialog(input,msg);
        }catch(Exception e){
            System.out.print(e.getMessage());
            if ("Bilangan Harus Positif".equals(e.getMessage())) {
                JOptionPane.showMessageDialog(input,e.getMessage());
            }else{
                JOptionPane.showMessageDialog(input,"Usia dan Gaji Harus Bilangan");
            }
        }
        
        
        
        
    }
}
