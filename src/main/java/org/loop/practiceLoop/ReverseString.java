package org.loop.practiceLoop;

public class ReverseString {
    String givenString = "Senthil", reverseString="";
    public void reverseString(){
        for(int i=givenString.length()-1;i>=0;i--){
            reverseString = reverseString+givenString.charAt(i);
        }

        System.out.println("Reverse String = "+reverseString);
    }
}
