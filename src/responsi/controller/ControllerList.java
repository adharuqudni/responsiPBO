/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.controller;

import responsi.model.Karyawan;
import responsi.view.*;

/**
 *
 * @author user
 */
public class ControllerList {
    
    public void viewPerhitunganGaji(ViewList list, Karyawan karyawan){
        list.toBack();
        ViewHitungGaji baru = new ViewHitungGaji(karyawan);
        baru.toFront(); 
    }
    public void back(ViewList list){
        list.toBack();
        list.setVisible(false);
        
    }
}
