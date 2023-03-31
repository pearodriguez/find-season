/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
Seasons

Writes a program that takes a date as input and 
outputs the date's season. The input is a string 
to represent the month and an integer to represent 
the day.

The program loop continues until user type Quit  

Ex: If the input is:

April 11

the output is:

Spring

In addition, check if the string and int are valid 
(an actual month and day).

Ex: If the input is:

Blue 65

the output is:

Invalid

The dates for each season are:
Spring: March 20 - June 20
Summer: June 21 - September 21
Autumn: September 22 - December 20
Winter: December 21 - March 19

*/
package find_season;

import java.util.Scanner;


    
/**
 *
 * @author peterrodriguez
 */
public class Find_season {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for (Season s : Season.values())
//           System.out.println(s); 
        
        String month; 
        int day; 
        Scanner input = new Scanner (System.in); 
        
        System.out.print("Please enter a month: "); 
        month = input.nextLine(); 
        System.out.print("Enter a day: ");
        day = input.nextInt();
        
        
        switch (month){
            case "march":
            case "March": 
                if (day >= 1 && day <=19)
                    System.out.println("WINTER"); 
                else if(day >= 20 && day <= 31)
                    System.out.println("SPRING");
                break;
            case "april":
            case "April": 
                if (day >= 1 && day <= 30)
                    System.out.println("SPRING");
                break;
            case "may":
            case "May": 
                if (day >= 1 && day <= 31)
                    System.out.println("SPRING");
                break;
            case "june":
            case "June": 
                if (day >= 1 && day <= 20)
                    System.out.println("SPRING");
                else if (day >= 21 && day <= 30)
                    System.out.println("SUMMER"); 
                break;
            case "july":
            case "July": 
                if (day >= 1 && day <= 31)
                    System.out.println("SUMMER");
                break;  
            case "august":
            case "August": 
                if (day >= 1 && day <= 31)
                    System.out.println("SUMMER");
                break;
            case "september":
            case "September": 
                if (day >= 1 && day <= 21)
                    System.out.println("SUMMER");
                else if (day >= 21 && day <= 30)
                    System.out.println("AUTUMN"); 
                break;
            case "october":
            case "October": 
                if (day >= 1 && day <= 31)
                    System.out.println("AUTUMN");
                break;
            case "november":
            case "November": 
                if (day >= 1 && day <= 30)
                    System.out.println("AUTUMN");
                break;  
            case "december":
            case "December": 
                if (day >= 1 && day <= 20)
                    System.out.println("AUTUMN");
                else if (day >= 21 && day <= 31)
                    System.out.println("WINTER");
                break; 
            case "january":
            case "January": 
                if (day >= 1 && day <= 30)
                    System.out.println("WINTER");
                break;     
            case "february":
            case "February": 
                if (day >= 1 && day <= 28)
                    System.out.println("WINTER");
                break; 
                default: 
                System.out.println("INVALID. Try again."); 
        }
    }

}
