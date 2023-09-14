package org.loop.codeWithFunction;

class Person {

    private final String name;
    final GENDER gender;

    public Person(String name, GENDER gender){
        this.name= name;
        this.gender = gender;
    }

    enum GENDER{
        MALE,FEMALE;
    }

    public String toString(){
        return "name: "+name+", gender: "+gender;
    }
}
