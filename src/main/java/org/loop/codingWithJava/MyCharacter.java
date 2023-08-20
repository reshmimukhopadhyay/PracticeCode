package org.loop.codingWithJava;

public class MyCharacter {

    public boolean isVowel(char ch) {
        // Use a switch statement to check for each vowel, both lowercase and uppercase

        switch (ch) {
            case 'A','E','I','O','U':
            case 'a','e','i','o','u': return true;
            default: return false;
        }

    }

    public static void main (String[] args){
        MyCharacter myCharacter = new MyCharacter();
        System.out.println(myCharacter.isVowel('K'));
    }
}
