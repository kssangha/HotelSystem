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
//Description: this class defines an abstraction of a customer within the hotel. 
//This is the parent class to member and nonmember.

//  Abstraction function(){
//      return String Name of Member;
//  }
//Rep Invariant: Must have a name type String and Age type integer
public class customer {
    private String name;
    private int age;
    
    public customer(String s, int a){
        this.age=a;
        this.name=s;
    }
    
    public void setName(String s){
        this.name= s;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        this.age= a;
    }
    public int getAge(){
        return age;
    }
    
    public boolean repOK(){
    
        return true;
    }
}
