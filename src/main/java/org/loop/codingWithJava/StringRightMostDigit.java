package org.loop.codingWithJava;

public class StringRightMostDigit {
    public int getRightmostDigit(String str) {

        if(str==""||str==null)
            return -1;


        for(int i=str.length()-1;i>=0;i--){
            if(Character.isDigit(str.charAt(i))){
                return Character.getNumericValue(str.charAt(i));
            }
        }

        return -1;
    }
    public static void main(String[] args){
        StringRightMostDigit stringRightMostDigit = new StringRightMostDigit();
        System.out.println(stringRightMostDigit.getRightmostDigit("I bought 5 apples, 4 bananas, and 3 oranges"));
    }
}
