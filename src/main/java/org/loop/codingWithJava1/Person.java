package org.loop.codingWithJava1;

public class Person {

    private String name;
    private String phone;
    private String email;

    public Person(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public String toString(){
        return String.format("Name-%s Phone-%s Email-%s",name,phone,email);
    }
}
