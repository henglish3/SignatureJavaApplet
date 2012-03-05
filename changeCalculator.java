/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Harrison English
 * ChangeCalculator
 *
 * Takes in a double to represent a monetary amount.  Then checks for valid
 * input and then breaks it down into money components. i.e. 20 dollar bills
 * quarters and so forth.
 *
 * Private Helper Methods
 * void printChange()
 * prints the change in the proper format
 *
 */
public class changeCalculator {
    // Creates an Array to hold the value for each bill/coin
     static int change []= new int[9];
     //holds the value for each type of bill/coin
     static int values []= new int[9];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates variable for user input amount
        int amt=0;
        double damt=0;
        //boolean to test validity of input
        boolean invalid = true;

        //Constant values representing types of bills/coins
        values[0] = 2000;  //20 dollar bill
        values[1] = 1000;  //10 dollar bill
        values[2] = 500;   //5 dollar bill
        values[3] = 100;   //1 dollar bill
        values[4] = 25; //quarter
        values[5] = 10; //dime
        values[6] = 05; //nickle
        values[7] = 01; //penny

        //Scanner for input
        Scanner scanner = new Scanner(System.in);

        //loops untill valid input is recieved
        while(invalid){
            invalid = false;

            //Grabs input from user
            System.out.print("Amount: ");
            String temp = scanner.next();

            // Test to see if user inputed a $ and deletes it
            if(temp.substring(0, 1).equals("$")){
              temp = temp.substring(1);
            }

            //changes input into double if it's valid if not restarts loop
            try{
                damt = Double.parseDouble(temp);
            }
            catch(Exception e){
                System.out.println("Invalid Input, Try again.");
                invalid = true;
            }
        }
        
        //multiply by 100 to prevent loss of precision
        amt = (int) (damt*100);

        //loops through dividing the ammount into the components and saving
        //them to the change array
        for(int i = 0; i < 8; i++){         
            change[i]= amt / values[i];

            //substracts component just found
            amt = amt - change[i]*values[i];
        }

        //call printChange helper method
        printChange();

        
    }//end of main

    //Internal use only properly formats the change to print to screen
    private static void printChange(){
        //Checks to add proper plural
        String plural []= new String[7];
        for(int i =0; i < 7; i ++){
            if(change[i]==1) {
                plural[i] = "";
            }
            else {
                plural[i] = "s";
            }
        }

        //prints out components of amount
        System.out.println(change[0] +" twenty dollar bill" + plural[0]);
        System.out.println(change[1] +" ten dollar bill" + plural[1]);
        System.out.println(change[2] +" five dollar bill" + plural[2]);
        System.out.println(change[3] +" one dollar bill" + plural[3]);
        System.out.println(change[4] +" quarter" + plural[4]);
        System.out.println(change[5] +" dime" + plural[5]);
        System.out.println(change[6] +" nickle" + plural[6]);
        if(change[7]== 1)
            System.out.println(change[7] +" penny");
        else
            System.out.println(change[7] +" pennies");
    }//end of printChange

}//end of changeCalculator