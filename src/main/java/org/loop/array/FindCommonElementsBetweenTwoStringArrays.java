package org.loop.array;

public class FindCommonElementsBetweenTwoStringArrays {

    public static void main(String[] args){

        String[] str = {"Ram","Leela","Ram","Koli","Raji"};
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++) {
                if (str[i].matches(str[j])) {

                    System.out.println("duplicate found");
                }
            }

        }

    }
}
