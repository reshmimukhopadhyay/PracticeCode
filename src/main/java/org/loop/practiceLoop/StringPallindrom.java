package org.loop.practiceLoop;

public class StringPallindrom {

    String givenWord = "Reshmi", reverse="";
    String temp=givenWord;

    public void stringPallindrom(){
        for(int i = givenWord.length()-1;i>=0;i--){
            reverse = reverse+givenWord.charAt(i);
        }

       if(temp.equals(reverse)){
           System.out.println("It is pallindrom");
       } else {
           System.out.println("It is not pallindrom");
       }
    }
}
