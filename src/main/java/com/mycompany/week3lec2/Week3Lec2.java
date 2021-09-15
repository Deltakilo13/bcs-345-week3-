/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week3lec2;

/**/ Create a methond that takes a String and returns how many characters are there.
 *
 * @author dkuzm
 */
public class Week3Lec2 {
    
    int getStrLngth(String name){
       int l= name.length();
       return l;
        
    }
    
     public static void main(String[]args) {
       
        Week3Lec2 nc = new Week3Lec2();
        String str = "Dan Kuzma";
        int z = nc.getStrLngth(str);
        System.out.println("The length is "+ z);
    }
}
