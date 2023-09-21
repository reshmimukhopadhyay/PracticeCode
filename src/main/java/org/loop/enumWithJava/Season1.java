package org.loop.enumWithJava;

public enum Season1 {

    SUMMER(3),
    SPRING(1),
    WINTER(2),
    AUTUMN(4);

    private int value;
     private Season1(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }
}
