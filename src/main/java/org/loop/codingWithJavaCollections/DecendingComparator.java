package org.loop.codingWithJavaCollections;

import java.util.Comparator;

public class DecendingComparator implements Comparator <Student>{
    public int compare(Student student1,Student student2){
        return Integer.compare(student2.getId(), student1.getId());
    }
}
