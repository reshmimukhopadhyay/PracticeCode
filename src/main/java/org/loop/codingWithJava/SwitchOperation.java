package org.loop.codingWithJava;

import java.util.Scanner;

public class SwitchOperation {

    int number1, number2,choice;

    public SwitchOperation(int number1,int number2,int choice){
        this.number1=number1;
        this.number2=number2;
        this.choice=choice;

    }
    public void useTheSwitchOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st no.: ");
        this.number1 = scanner.nextInt();

        System.out.println("Enter 2nd no.: ");
        this.number2 = scanner.nextInt();

        System.out.println("Choice 1: Addition");
        System.out.println("Choice 2: Multiplication");
        System.out.println("Choice 3: Division");
        System.out.println("Choice 4: Subtraction");

        System.out.println("Select choice.: ");
        this.choice = scanner.nextInt();

        System.out.println("Number1: "+this.number1);
        System.out.println("Number2: "+this.number2);
        System.out.println("Choice Selected:" +this.choice);

        switch(choice){
            case 1: System.out.println("Addition: "+number1+number2);
                    break;

            case 2: System.out.println("Multiply: "+number1*number2);
                    break;

            case 3: if(number1>number2){
                         System.out.println("Division: "+number1/number2);}
                    else System.out.println("Division: "+number2/number1);
                    break;

            case 4: if(number1>number2){
                        System.out.println("Subtraction: "+ (number1-number2));}
                    else {
                        System.out.println("Subtraction: "+ (number2-number1));
                        }
                    break;

            default: System.out.println("Invalid Choice");
                    break;
        }


    }
    public static void main(String[] args){

        SwitchOperation switchOperation=new SwitchOperation(10,20,3);
        switchOperation.useTheSwitchOperation();


    }
}
