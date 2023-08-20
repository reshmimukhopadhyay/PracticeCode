package org.loop.codingWithJava;

public class BiNumber {

    int a, b;
    public BiNumber(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int add(){
        int c = a+b;
        return c;
    }

    public int multiplication(){
        int c=a*b;
        return c;
    }

    public void doubleTheNumber(){
        this.a =a*a;
        this.b =b*b;
    }

    public void setNumber1(int a){
        this.a=a;
    }

    public void setNumber2(int b){
        this.b = b;
    }

    public int getNumber1(){
       return this.a;
    }

    public int getNumber2(){
        return this.b;
    }


    public static void main(String[] args){
        BiNumber number = new BiNumber(10,20);
        System.out.println("Add="+number.add());
        System.out.println("Multiply="+number.multiplication());
        System.out.println("getNumber1="+number.getNumber1());
        System.out.println("getNumber2="+number.getNumber2());
        number.doubleTheNumber();
    }
}
