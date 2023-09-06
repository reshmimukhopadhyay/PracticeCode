package org.loop.codingWithJava1;

import java.util.concurrent.Callable;

public class Customer {

    private String name;
    private Address homeAddress;
    private Address workAddress;


    public Customer(String name,Address homeAddress){
        this.name= name;
        this.homeAddress=homeAddress;
    }

    public void setHomeAddress(Address homeAddress){
        this.homeAddress=homeAddress;
    }

    public Address getHomeAddress(){
        return homeAddress;
    }

    public Address getWorkAddress(){
        return workAddress;
    }
    public void setWorkAddress(Address workAddress){
        this.workAddress=workAddress;
    }



    public String toString(){
        return String.format("Name-%s homeAddress-%s workAddress-%s", name,homeAddress,workAddress);
    }


    public static void main(String[] args){
        Address homeAddress = new Address("Shibpur" ,"Hhowrah", 711102);
        Customer customer=new Customer("Ramu",homeAddress);
        System.out.println(customer);
    }
}
