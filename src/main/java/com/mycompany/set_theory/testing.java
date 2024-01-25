/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_theory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Anon
 */
public class testing {
    public static void main(String[] args){
   // Define the number of sets dynamically
        int numSets = 3;
        
        // Create sets dynamically
        Set<Integer>[] sets = new HashSet[numSets];
        for (int i = 0; i < numSets; i++) {
            sets[i] = new HashSet<>();
        }
        
        // Add elements to sets (you can customize this part based on your needs)
        sets[0].add(1);
        sets[0].add(2);
        sets[1].add(2);
        sets[1].add(3);
        sets[2].add(1);
        sets[2].add(3);
        
        // Perform set operations
        Set<Integer> union = new HashSet<>(sets[0]);
        Set<Integer> difference = new HashSet<>(sets[0]);
        Set<Integer> complement = new HashSet<>(sets[0]);
        Set<Integer> intersection = new HashSet<>(sets[0]);

        
        System.out.println("OG Sets: " + sets[0]);
        System.out.println("OG Sets: " + sets[1]);
        System.out.println("OG Sets: " + sets[2]);
        
        System.out.println("Union: " + union);
        System.out.println("Difference: " + difference);
        System.out.println("Complement: " + complement);
        System.out.println("Intersection: " + intersection);
        
        
    }
}
