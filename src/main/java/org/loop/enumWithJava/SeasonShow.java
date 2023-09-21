package org.loop.enumWithJava;

import java.util.Arrays;

public class SeasonShow {

    public static void main(String[] args){
        System.out.println(Season.WINTER);

        System.out.println(Season.valueOf("WINTER"));
        System.out.println(Arrays.toString(Season.values()));
        System.out.println(Season.WINTER.ordinal());

        System.out.println(Season1.SUMMER.getValue());
    }
}
