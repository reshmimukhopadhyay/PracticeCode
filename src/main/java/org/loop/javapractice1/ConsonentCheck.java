package org.loop.javapractice1;

import java.util.Scanner;

//Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

        /*Test Data
        Input an alphabet: p
        Expected Output :
        Input letter is Consonant*/
public class ConsonentCheck {

    public String checkConsonent(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String alphabet = scanner.nextLine();

        if(alphabet.length()>1){
            return "Not Alphabet";
        }else{
            switch(alphabet.toLowerCase()){
                case "a": return "Vowel";
                case "e": return "Vowel";
                case "i": return "Vowel";
                case "o": return "Vowel";
                case "u": return "Vowel";
                default: return "Consonent";
            }
        }
    }

    public static void main(String[] args){
        ConsonentCheck consonentCheck = new ConsonentCheck();
        System.out.println(consonentCheck.checkConsonent());
    }
}
