package org.loop.codingWithJavaCollections;

import java.util.Comparator;

public class AscendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(),student2.getId());
    }
}
