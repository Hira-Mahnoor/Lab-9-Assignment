/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Task1_Clock;

public class Child extends Clock{
    public Child(int hours, int minutes, int seconds) {
        
        super(hours, minutes, seconds);
        
    }
    
    @Override
    public void display(){
        System.out.println("24 Hour Format:");
        System.out.println("hh:mm:ss");
        super.display();
        System.out.println("12 Hour Format:");
    
     String format;    //String to store AM and PM
     if(hours > 12 ){
         hours=hours-12;
         format="PM";
     }
     else if (hours == 00) {
            hours = 12;
            format = "AM";
        }
        else if (hours == 12) {
            hours = 12;
            format = "PM";
        }
        else {
            format = "AM";
        }
     System.out.println("hh:mm:ss");
     System.out.println( hours+":"+minutes+":"+seconds +""+ format);
    }
    
}

