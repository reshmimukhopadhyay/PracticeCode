package org.loop.codingWithJava1;

public class FlyableRunner {

    public static void main(String[] args) {
        Flyable [] flyingObject= {new Bird(),new Aeroplane()};
        for (Flyable object:flyingObject) {
            object.fly();
        }

    }
}
