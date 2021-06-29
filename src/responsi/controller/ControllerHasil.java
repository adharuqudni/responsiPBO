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
public class ControllerHasil {
     public void back(ViewHasil hasil){
        hasil.toBack();
        hasil.setVisible(false);
        
    }
}
