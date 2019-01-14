/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.Project;

/**
 *
 * @author kabirsangha
 */

//Description: this class defines a suite in the hotel, a subclass of a room.
//  Abstraction function(){
//      return String Display the room ID, and availability;
//  }
//Rep Invariant: Al variants are used
public class suite extends Room{
    private static final int price=400;
    public suite(){
        super();
    }
    
    @Override
    public String toString(){
        String s;
        if(this.getAvailability()==true){
            s = "Room " + Integer.toString(this.getID()) + "| Suite" + "| Vacant"; 
        }
        else{
            s = "Room " + Integer.toString(this.getID()) + "| Suite" + "| Occupied by: " + this.getCustomerName();   
        }
        return s;
    }
    
    public double getPrice(){
        return price;
    }
    
    public boolean repOK(){
        return true;
    }
}
