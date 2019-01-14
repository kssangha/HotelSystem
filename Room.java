/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.Project;

//import java.util.ArrayList;
/**
 *
 * @author kabirsangha
 */
//description: this class defines a room in the hotel. The parent class of regularRoom and suite.
//  Abstraction function(){
//      return String Display the room ID, and availability;
//  }
//Rep Invariant: Al variants are used
public class Room {
   //instance variables
    public static int IDCount = 1;
    private int ID;
    private boolean availability= true;
    
    private customer customer;
    //constructor
    public Room(){
        this.ID= IDCount;
        IDCount++;
    }
    //Class methods
    public int getID(){
        return ID;
    }
    
    public boolean getAvailability(){
        return availability;
    }
    
    
    public void fillRoom(customer c){
        this.customer=c;
        this.availability= false;
    }
    public void vacateRoom (){
        this.customer= null;
        this.availability= true;
    }
    
    public String getCustomerName(){
        return this.customer.getName();
    }
    
    public boolean repOK(){
        return true;
    }
    
}
