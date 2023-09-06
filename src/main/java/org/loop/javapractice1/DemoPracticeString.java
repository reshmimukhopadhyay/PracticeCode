package org.loop.javapractice1;

public class DemoPracticeString {

    public static void main(String[] args){
        String message ="Hello World"+"!!";
        System.out.println(message.length());
        System.out.println(message.toLowerCase());
        System.out.println(message.substring(6));
        System.out.println(message.replace("!!","**"));
        System.out.println(message);
    }
}
