package org.loop.codingWithJava;

import javax.swing.*;

public class SwitchOperationOnDayAndMonth {

    public static String isWeekDay(int dayNumber){
        switch(dayNumber){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thirsday";
            case 5: return "Friday";
            case 6: return "Saturday";

        }
        return "Invalid Day";
    }

    public static String determineNameOfTheMonth(int monthNumber){
        switch(monthNumber){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";


        }

        return "Invalid_month";
    }

    public static void main(String[] args){

        System.out.println(SwitchOperationOnDayAndMonth.isWeekDay(0));
        System.out.println(SwitchOperationOnDayAndMonth.determineNameOfTheMonth(3));
    }

}
