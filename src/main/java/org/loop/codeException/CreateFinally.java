package org.loop.codeException;

import java.util.Scanner;

public class CreateFinally {

    public void createFinallyCheck(){
        Scanner scanner = null;

        try{
            scanner=new Scanner(System.in);
            int [] i = {4,2,5,6,9};
            int a= i[5];

        }catch(Exception e){
            System.out.println("Exception block");
            e.printStackTrace();
        }finally {
            System.out.println("scanner close");
            scanner.close();
        }
    }

    public static void main(String[] args){
        CreateFinally createFinally = new CreateFinally();
        createFinally.createFinallyCheck();
    }
}
