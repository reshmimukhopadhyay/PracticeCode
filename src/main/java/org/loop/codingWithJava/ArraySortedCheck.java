package org.loop.codingWithJava;

public class ArraySortedCheck {

    public boolean isSorted(int... array) {

        if(array.length<=1)
            return true;


        for(int i=0;i<=array.length-2;i++){
            if(array[i+1]<array[i]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] arga){
        ArraySortedCheck arraySortedCheck = new ArraySortedCheck();
        System.out.println(arraySortedCheck.isSorted(20,1,3,45,2));
    }
}
