/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_theory;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Anon
 */
public class set_Data {
    //change ArrayList to hashset if necessary, vice versa
    
    private int quantity_Sets = 0;
    int testing = 0; //debug
    Set<Integer>[] sets; //initialize set
    private static set_Data instance;
    
    public static set_Data getInstance() {
        if (instance == null) {
            instance = new set_Data();
        }
        return instance;
    }
    
    
    public void add_Sets(int value, int num_Sets){
        sets[num_Sets].add(value);
        //System.out.print(sets.length);
        //System.out.print(quantity_Sets);// debug
    }
    
    public void setQuantity_Sets(int quantity_Sets) {
        this.quantity_Sets = quantity_Sets;
    }

    public int getQuantity_Sets() {
        return quantity_Sets; //for debug
    }
    
    public void init_Sets() {
        if (quantity_Sets != 0){
            sets = new HashSet[quantity_Sets]; //assign how many sets
            for (int i = 0; i < quantity_Sets; i++) {
                sets[i] = new HashSet<>(); //Create the sets
            }
            System.out.print(sets.length);// debug
            //JOptionPane.showMessageDialog(null, sets, "Debug Popup", JOptionPane.INFORMATION_MESSAGE); //debug, the if statement doesnt matter i just used it for debugging
        }else{
            //JOptionPane.showMessageDialog(null, "Didnt work", "Debug Popup", JOptionPane.INFORMATION_MESSAGE); //just for debug
        }
        

    }
    
    
}
