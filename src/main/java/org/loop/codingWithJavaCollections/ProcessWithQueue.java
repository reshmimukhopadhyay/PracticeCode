package org.loop.codingWithJavaCollections;

import java.util.Comparator;

public class ProcessWithQueue implements Comparator<String> {

    @Override
    public int compare(String ele1, String ele2) {
        return Integer.compare(ele1.length(),ele2.length());
    }
}
