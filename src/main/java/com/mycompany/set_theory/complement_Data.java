/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_theory;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Anon
 */
public class complement_Data {
    boolean ano_Pre = true;
    boolean may_UniveesalSet = false;
    
    private static complement_Data instance;
    Set<Integer> universal_Set = new HashSet<>();
            
    public static complement_Data getInstance() {
        if (instance == null) {
            instance = new complement_Data();
        }
        return instance;
    }        
    
    public void add_Sets(int value){
        universal_Set.add(value);
        //System.out.print(sets.length);
        //System.out.print(quantity_Sets);// debug
    }
}
