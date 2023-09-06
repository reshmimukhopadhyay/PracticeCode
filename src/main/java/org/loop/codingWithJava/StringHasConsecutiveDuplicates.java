package org.loop.codingWithJava;

public class StringHasConsecutiveDuplicates {


    public boolean hasConsecutiveDuplicates(String str) {
        if(str==""){
            return false;
        }


        for(int i =0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                return true;
            }
        }return false;
    }

    public static void main(String[] args){
        StringHasConsecutiveDuplicates stringHasConsecutiveDuplicates = new StringHasConsecutiveDuplicates();
        System.out.println(stringHasConsecutiveDuplicates.hasConsecutiveDuplicates("Helo"));
    }
}
