package org.loop.codingWithJava;

import java.util.Arrays;

public class StringWithArray {

    String[] day;

    public StringWithArray(String... day){
        this.day=day;
    }

    public String getDays() {
        return Arrays.toString(day);
    }

    public String findDaysWithMaxNumberLetter(){
        String dayWithMaxCharacter="";
        for (String days:day){
            if(days.length()>dayWithMaxCharacter.length()){
                dayWithMaxCharacter=days;
            }
        }
        return dayWithMaxCharacter;
    }

    public void reverseString(){
        for(int i= day.length-1;i>=0;i--){
            System.out.print(day[i]+",");
        }

    }

    public static void main(String [] args){
        StringWithArray stringWithArray = new StringWithArray("SunDay","Monday","TuesDay","ThirsDay","Friday","Saturday");
        System.out.println(stringWithArray.getDays());
        System.out.println(stringWithArray.findDaysWithMaxNumberLetter());
        stringWithArray.reverseString();

    }

}
