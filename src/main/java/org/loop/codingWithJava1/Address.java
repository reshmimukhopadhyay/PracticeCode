package org.loop.codingWithJava1;

public class Address {

    private String line1;
    private String city;
    private int pincode;


    public Address(String line1,String city, int pincode){
        super();
        this.line1=line1;
        this.city=city;
        this.pincode=pincode;

    }

    public String toString(){
        return line1+" "+city+" "+pincode;
    }
}
