package org.loop.enumWithJava;

public class WeekendDaysEnum {

    public enum WeekendEnum{
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args){
        WeekendEnum day1 = WeekendEnum.SUNDAY;
        WeekendEnum day2 = WeekendEnum.SATURDAY;
        System.out.println(day1);
        System.out.println(day2);
    }
}
