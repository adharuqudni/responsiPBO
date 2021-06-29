/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.controller;

import responsi.model.Karyawan;
import responsi.model.ModelKaryawan;
import responsi.view.*;

/**
 *
 * @author user
 */
public class ControllerMenuUtama {
    public void viewLihat(ViewMenuUtama menu){
        ModelKaryawan mk = new ModelKaryawan();
        Karyawan[] result = mk.getAll();
        menu.toBack();
        ViewList baru = new ViewList(result);
        baru.toFront(); 
    }
    public void viewTambah(ViewMenuUtama menu){
        menu.toBack();
        ViewInputKaryawan baru = new ViewInputKaryawan();
        baru.toFront(); 
    }
}
