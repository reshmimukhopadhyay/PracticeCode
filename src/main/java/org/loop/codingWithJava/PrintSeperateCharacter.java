package org.loop.codingWithJava;

public class PrintSeperateCharacter {

    String str = "My Name is Reshmi";
    public void printCharacter(){
    for(int i=0;i<str.length();i++){
        System.out.println(str.charAt(i));
    }}

    public static void main(String [] args){
        PrintSeperateCharacter printSeperateCharacter = new PrintSeperateCharacter();
        printSeperateCharacter.printCharacter();
    }
}
