/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.view;

import java.awt.event.*;
import responsi.controller.*;

/**
 *
 * @author user
 */
public class ViewInputKaryawan extends ViewForm {
    
    ControllerInputKaryawan controllerInputKaryawan = new ControllerInputKaryawan();
    
    public ViewInputKaryawan() {
        super("Input Karyawan");
        
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
         if (e.getSource() == super.buttonSubmit){
            controllerInputKaryawan.addKaryawan(this);
        }
         if (e.getSource() == super.buttonKembali){
            controllerForm.viewMenu(this);
        }
         if (e.getSource() == super.buttonReset){
            controllerForm.resetForm(this);
        }
    }
}
