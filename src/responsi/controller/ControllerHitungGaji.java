/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.controller;

import javax.swing.JOptionPane;
import responsi.model.Karyawan;
import responsi.model.ModelKaryawan;
import responsi.view.*;

/**
 *
 * @author user
 */
public class ControllerHitungGaji {

    public void edit(ViewHitungGaji gaji, Karyawan karyawan) {
        gaji.toBack();
        ViewEditKaryawan baru = new ViewEditKaryawan(karyawan);
        baru.toFront();
    }

    public void delete(ViewHitungGaji gaji, int id) {
        int input = JOptionPane.showConfirmDialog(gaji,
                "Yakin ingin menghapus?", "Hapus data",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        System.out.println(input);
        if (input == 0) {
            ModelKaryawan mk = new ModelKaryawan();
            String msg = mk.delete(id);
            JOptionPane.showMessageDialog(gaji,msg);
            gaji.toBack();
        }
    }
     public void back(ViewHitungGaji gaji){
        gaji.toBack();
        gaji.setVisible(false);
        
    }
     public void viewHasil(ViewHitungGaji gaji, Karyawan karyawan, int total) {
        gaji.toBack();
        ViewHasil baru = new ViewHasil(karyawan, total);
        baru.toFront();
    }
     
}
