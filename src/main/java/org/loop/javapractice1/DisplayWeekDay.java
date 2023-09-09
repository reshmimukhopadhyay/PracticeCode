package org.loop.javapractice1;

import java.util.Scanner;

//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

        /*Test Data
        Input number: 3
        Expected Output :
        Wednesday*/
public class DisplayWeekDay {

    public String showWeekDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int number = scanner.nextInt();

        switch(number){
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thirsday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Not Correct Day";
        }
    }
    public static void main(String[] args){
        DisplayWeekDay displayWeekDay = new DisplayWeekDay();
        System.out.println(displayWeekDay.showWeekDay());
    }
}
