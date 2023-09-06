package org.loop.codingWithJava;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayStudent {

    String name;
    int sum=0;
    int maximumMark=0;
    int minimumMark;
    BigDecimal average;

    private ArrayList<Integer> marks = new ArrayList<Integer>();
    public ArrayStudent(String name, int... marks){
        this.name=name;
        for(int mark:marks){
            this.marks.add(mark);
        }

    }


    public int getNumberOfMarks(){
        return marks.size();
    }

    public int getTotalSumOfMarks(){
        for(int mark:marks){
            sum = sum+mark;
        }
        return sum;
    }

    public int getMaximumMark2(){
        for(int mark:marks){
            if(mark>maximumMark){
                maximumMark=mark;
            }

        }

        return maximumMark;
    }


    public int getMinimumMark2(){
        minimumMark=Integer.MAX_VALUE;
        for(int mark:marks){
            if(mark<minimumMark){
                minimumMark=mark;
            }
        }
        return minimumMark;
    }

    public BigDecimal getAverageMarks() {
        int number = 0;
        for (int mark : marks) {
            sum = getTotalSumOfMarks();
            number = getNumberOfMarks();
        }
        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);
    }

    public void addNewMarks(int mark){
        marks.add(mark);
        System.out.println(marks);
    }

    public void removeMarkAtIndex(int mark){
        marks.remove(mark);
        System.out.println(marks);
    }

    public String toString(){
        return name+marks;
    }
    public static void main(String[] args){
        ArrayStudent arrayStudent=new ArrayStudent("Ram",23,43,22,12,30);
        System.out.println("Number Of Marks: "+arrayStudent.getNumberOfMarks());
        System.out.println("Total Sum Of Marks: "+arrayStudent.getTotalSumOfMarks());
        System.out.println("Average Marks: "+arrayStudent.getAverageMarks());
        System.out.println("Maximum Mark logic 2: "+arrayStudent.getMaximumMark2());
        System.out.println("Minimum Mark 2: "+arrayStudent.getMinimumMark2());
        arrayStudent.addNewMarks(20);
        arrayStudent.removeMarkAtIndex(2);
        System.out.println(arrayStudent);
    }
}
