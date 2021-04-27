/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Task1_Clock;


public class Clock {
     int hours;
     int minutes;
     int seconds;
    
    //Constructor 
    public Clock(int hours, int minutes, int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    
    //Display method 24 hour format
    public void display(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}


