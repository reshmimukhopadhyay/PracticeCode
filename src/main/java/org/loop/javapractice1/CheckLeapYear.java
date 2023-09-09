package org.loop.javapractice1;

import java.util.Scanner;

public class CheckLeapYear {

    public String cheakLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            return year + " is Leap Year.";
        }
        return year + " is not a Leap Year.";
    }

    public static void main(String[] args){
        CheckLeapYear checkLeapYear =new CheckLeapYear();
        System.out.println(checkLeapYear.cheakLeapYear());
    }
}
