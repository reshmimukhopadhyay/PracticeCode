package org.loop.codingWithJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAllFactors {

    public List<Integer> determineAllFactors(int number) {

        // TODO: Write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=number;i++){
            if(number%i==0){
                list.add(i);
            }
        }return list;
    }

    public static void main(String[] args){
        ArrayListAllFactors arrayListAllFactors=new ArrayListAllFactors();
        System.out.println(arrayListAllFactors.determineAllFactors(45));
    }
}
