package org.loop.codingWithJavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

    public static void main(String[] args){
        List<Student> student = List.of(new Student(1,"Raja"),new Student(40,"Rami"),new Student(3,"Rakul"));
        ArrayList<Student> studentList = new ArrayList<>(student);
        Collections.sort(studentList);
        System.out.println(studentList);

        studentList.sort(new AscendingComparator());
        System.out.println("Ascending: "+studentList);

        studentList.sort(new DecendingComparator());
        System.out.println("Descending: "+studentList);
    }
}
