package org.loop.codingWithJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDetermineMultiple {

    public List<Integer> determineMultiples(int number, int limit) {

        // TODO: Write your code here

        ArrayList<Integer> list = new ArrayList<Integer>();

        if(number<=0 || limit<=0){
            return list;
        }


        for(int i=number;i<limit;i++){
            if(i%number==0){
                list.add(i);
            }
        }return list;

    }
    public static void main(String[] args){
        ArrayListDetermineMultiple arrayListDetermineMultiple = new ArrayListDetermineMultiple();
        System.out.println(arrayListDetermineMultiple.determineMultiples(3,20));
    }
}
