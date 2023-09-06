package org.loop.codingWithJava1;

public class Runner {

    public static void main(String[] args){

        Animal[] runner = {new Dog(),new Cat()};
        for (Animal animalRunner:runner) {
            animalRunner.bark();
        }

    }
}
