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
//Description: This class defines a nonmember customer, which is a subclass of customer
//  Abstraction function(){
//      return String Name of Member;
//  }
//Abstraction Invariant: Must have a name type String and Age type integer
public class nonmember extends customer{
    private static final double discountMultiplier = 1;
    public nonmember(String s, int a){
        
        super(s, a);
    }
    @Override
    public String toString(){
        String s = this.getName() + ", Non-Member";
        return s;
    }
    
    public double getdiscountMultiplier(){
        return discountMultiplier;
    }
    
    public boolean repOK(){
        return true;
    }
}
