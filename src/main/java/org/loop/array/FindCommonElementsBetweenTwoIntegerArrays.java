package org.loop.array;

public class FindCommonElementsBetweenTwoIntegerArrays {

    public static void main(String[] args){
        int[] arr1={2,8,0,4,1,5};
        int[] arr2={5,9,7,3,0,1};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println("common elements are "+arr1[i]);
                }
            }
        }
    }
}
