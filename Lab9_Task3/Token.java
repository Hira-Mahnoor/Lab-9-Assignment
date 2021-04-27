/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Task3;

import java.util.StringTokenizer;

public class Token {
    public int countTokens(StringTokenizer Token){
        int count=Token.countTokens();
       String s;
        int totalCount=0;
        
        //loop to count the token in string
       for(int i=0;i<count;i++){
           
            s=Token.nextToken();
       
         
                totalCount++;
        }
        return totalCount;
    }
}
