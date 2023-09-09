package org.loop.javapractice1;

import java.sql.SQLOutput;
import java.util.Scanner;



//Write a Java program to find the number of days in a month.

        /*Test Data
        Input a month number: 2
        Input a year: 2016
        Expected Output :
        February 2016 has 29 days*/
public class NumberOfDaysInMonth {

    public String findDaysInAMonth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month in number: ");
        int month = scanner.nextInt();
        System.out.print(" Enter year: ");
        int year = scanner.nextInt();

        switch(month){
            case 1:
                return "January "+year+" has 31 days";
            case 2: if(year%4==0)
                        return "February "+year+" has 29 days";
                    else return "February "+year+" has 28 days";
            case 3:
                return "March "+year+" has 31 days";
            case 4:
                return "April "+year+" has 30 days";
            case 5:
                return "May "+year+" has 31 days";
            case 6:
                return "June "+year+" has 30 days";
            case 7:
                return "July "+year+" has 31 days";
            case 8:
                return "August "+year+" has 31 days";
            case 9:
                return "September "+year+" has 30 days";
            case 10:
                return "October "+year+" has 31 days";
            case 11:
                return "November "+year+" has 30 days";
            case 12:
                return "December "+year+" has 31 days";
                default: return "Wrong Entry";

        }
    }

    public static void main(String[] args){
        NumberOfDaysInMonth numberOfDaysInMonth = new NumberOfDaysInMonth();
        System.out.println(numberOfDaysInMonth.findDaysInAMonth());
    }
}
