/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.view;

import java.awt.event.ActionEvent;
import responsi.controller.ControllerEditKaryawan;
import responsi.model.Karyawan;

/**
 *
 * @author user
 */
public class ViewEditKaryawan extends ViewForm{
    Karyawan edit;
    ControllerEditKaryawan controllerEditKaryawan = new ControllerEditKaryawan();
    
    public ViewEditKaryawan(Karyawan karyawan) {
        super("Update Karyawan");
        this.edit = karyawan;
        super.getFnama().setText(karyawan.getNama());
        super.getFusia().setText(String.valueOf(karyawan.getUsia()));
        super.getFgaji().setText(String.format("%,.2f", karyawan.getGaji()));
        
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
         if (e.getSource() == super.buttonSubmit){
            controllerEditKaryawan.updateKaryawan(this, edit.getId());
        }
         if (e.getSource() == super.buttonKembali){
            controllerForm.viewMenu(this);
        }
         if (e.getSource() == super.buttonReset){
            controllerForm.resetForm(this);
        }
    }
    
}
