/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.controller;

import responsi.view.*;

/**
 *
 * @author user
 */
public class ControllerForm {
    
    public void viewMenu(ViewForm form){
        form.toBack();
        form.setVisible(false);
        
    }
    public void resetForm(ViewForm form){
        form.getFnama().setText("");
        form.getFusia().setText("");
        form.getFgaji().setText("");
    }
}
