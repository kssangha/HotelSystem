/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.Project;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author kabirsangha
 */

//Contains Main 
//Class test does not define an abstraction of any hotel related object and is never instanced.

public class Test {
public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;
    
    ArrayList <Room> roomList = new ArrayList<>();
    ArrayList <regularRoom> regularRooms= new ArrayList<>();
    ArrayList <suite> suites= new ArrayList<>();
    ArrayList <customer> guestList = new ArrayList<>();
    
    for (int i =0; i<5; i++){
        regularRoom e= new regularRoom();
        roomList.add(e);
        regularRooms.add(e);
    }
    for (int i =0; i<5; i++){
        suite s= new suite();
        roomList.add(s);
        suites.add(s);
    }
    
    int choice;
    while(true){
        try{
            System.out.println("Hotel System control\n");
            System.out.println("-------------------------");
            System.out.print("1.) View Available Rooms \n");
            System.out.print("2.) View Room Rates\n");
            System.out.print("3.) Book a Room\n");
            System.out.print("4.) Vacate a Room\n");
            System.out.print("5.) View Guest List\n");
            System.out.print("6.) Exit\n");
            System.out.print("\nEnter Your Menu Choice: ");

        choice = input.nextInt();
        }
        
        catch(Exception e){
            System.out.println("You have entered an invalid selection. Please reload the program");
            
            break;
        }


    switch(choice){
    //View Available Rooms
    case 1:
        for(Room r: roomList){
            System.out.println(r.toString());
        }
        break;
    //Show Prices
    case 2: 
        System.out.println("Suite Prices are $400");
        System.out.println("Regular Room Prices are $200");
        break;
    //Book a Room
    case 3:
            // book a room
        
        System.out.println("What is your name?");
        String Name = input.next(); 
        
        //Name must be type string
        System.out.println("What is your age?");
        int Age = input.nextInt();
        
            //Age must be type int
        System.out.println("Are you a member?\n");
        System.out.println("-------------------");
        System.out.println("1.) YES");
        System.out.println("Other Number.) NO");
        int member = input.nextInt();
            //member must be type int
        System.out.println("\n Which type of room would you like?");
        System.out.println("--------------------------------------");
        System.out.print("1.) Regular Room\n");
        System.out.print("2.) Suite\n");
        System.out.print("3.) Exit\n");
        int roomChoice = input.nextInt();
        
        switch(roomChoice){
            //Book a regular Room
            case (1):
                
                //member booking regular room
                if(member==1){
                    boolean booked= false;
                    member m = new member(Name, Age);
                    guestList.add(m);
                    
                    for (regularRoom r: regularRooms){
                        if(r.getAvailability()==true){
                            r.fillRoom(m);
                            System.out.println("you have been booked into room #" + r.getID() + "\n");
                            double price = r.getPrice()*0.5;
                            System.out.println("Your Price is:" + price +"\n");
                            booked=true;
                            break;
                        }
                        
                    }
                    
                    if(booked=false){
                        System.out.println("there are no more available regular rooms");
                    }
                }
                //nonmember booking a regular room
                else{
                    boolean booked=false;
                    nonmember m = new nonmember(Name, Age);
                    guestList.add(m);
                    
                    for (regularRoom r: regularRooms){
                        if(r.getAvailability()==true){
                            r.fillRoom(m);
                            System.out.println("you have been booked into room #" + r.getID());
                            double price = r.getPrice();
                            System.out.println("Your Price is:" + price);
                            booked=true;
                            break;
                        }
                        
                    }
                    if(booked=false){
                        System.out.println("there are no more available regular rooms");
                    }    
                }
                
                break;
                //book a suite
            case (2):
               
                //member booking a suite
                if(member==1){
                    boolean booked=false;
                    member m = new member(Name, Age);
                    guestList.add(m);
                    
                    for (suite r: suites){
                        if(r.getAvailability()==true){
                            r.fillRoom(m);
                            System.out.println("you have been booked into room #" + r.getID() + " ,which is a suite");
                            double price = r.getPrice()*m.getdiscountMultiplier();
                            System.out.println("Your Price is:" + price);
                            booked=true;
                            break;
                        }
                        if(booked=false){
                            System.out.println("there are no more available suites");
                        }
                    }
                }
                //nonmember booking a suite
                else{
                    boolean booked=false;
                    nonmember m = new nonmember(Name, Age);
                    guestList.add(m);
                    
                    for (suite r: suites){
                        if(r.getAvailability()==true){
                            r.fillRoom(m);
                            System.out.println("you have been booked into room #" + r.getID() + "which is a suite");
                            double price = r.getPrice()*m.getdiscountMultiplier();
                            System.out.println("Your Price is:" + price);
                            break;
                        }
                        
                    }
                    if(booked=false){
                            System.out.println("there are no more available suites");
                    }
                }
                
                break;
            case (3):
                //exit the system
                System.out.println("Exiting Program...");
                System.exit(0);
                break;
            default :
             System.out.println("This is not a valid Option! You will now be returned to the menu!\n");
             break;
            
        
        
        }
         
        break;
    //Vacate a Room
    case 4: 
        //Vacate a room
        System.out.println("Which room would you like to vacate?\n");
        int vacateChoice= input.nextInt();
        
        if(vacateChoice<9 && vacateChoice>=0){
            roomList.get(vacateChoice-1).vacateRoom();
            System.out.println("Room number " + roomList.get(vacateChoice-1).getID() +" has been vacated\n");
        }
        else{
            System.out.println("Sorry, this room does not exist \n");
        }
        break;
    //View Guest List
    case 5:
            for (customer c: guestList){
                System.out.println(c.toString());
            }
        break;

    case 6: 
        System.out.println("Exiting Program...");
        System.exit(0);
         break;
         
    case 7:
        break;
    default :
             System.out.println("This is not a valid Menu Option! Please Select Another");
             break;

    }


    }




    }

}
