/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_theory;

/**
 *
 * @author Anon
 */
public class complement_Data {
    boolean ano_Pre = true;
    private static complement_Data instance;
            
    public static complement_Data getInstance() {
        if (instance == null) {
            instance = new complement_Data();
        }
        return instance;
    }        
}
