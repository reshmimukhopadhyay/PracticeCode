package org.loop.codingWithJava;

public class StringCountUpperCaseCharacter {

    public int countUppercaseLetters(String str) {

        if(str==null)
            return -1;


        int count=0;

        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args){
        StringCountUpperCaseCharacter stringCountUpperCaseCharacter = new StringCountUpperCaseCharacter();
        System.out.println(stringCountUpperCaseCharacter.countUppercaseLetters("I Love India"));
    }
}
