/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Task3;

import java.util.StringTokenizer;


public class Token_Runner {
    public static void main(String[] args){
        StringTokenizer s1 = new StringTokenizer("One string");
       int total= s1.countTokens();
       //printout the total token in string
        System.out.println( "TOTAL TOKEN: "+total);
        
}
    
}