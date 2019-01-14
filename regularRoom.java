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
//description: this class defines a regular room in the hotel, a subclass of a room.

//Rep Invariant: Al variants are used
public class regularRoom extends Room{
   private static final int price= 200;
    public regularRoom(){
        super();
    }
    @Override
    public String toString(){
        String s;
        if(this.getAvailability()==true){
            s = "Room " + Integer.toString(this.getID()) + "| Regular Room" + "| Vacant"; 
        }
        else{
            s = "Room " + Integer.toString(this.getID()) + "| Regular Room" + "| Occupied by: " + this.getCustomerName();   
        }
        return s;
    }
    
    public double getPrice(){
        return price;
    }
}
