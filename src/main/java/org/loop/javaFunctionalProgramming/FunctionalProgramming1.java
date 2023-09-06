package org.loop.javaFunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgramming1 {

    public static void printElement(List<String> list){
        for(String lists:list){
            System.out.println(lists);}
        }

    public static void printFunctionalElement(List<String> list){
        list.stream().forEach(element-> System.out.println("element: "+element));
    }

    public static void printFunctionWithFilter(List<String> list){
        list.stream()
                .filter(element-> element.endsWith("ple"))
                .forEach(element->System.out.println(element));
    }


    public static void printFPwithOddNumber(List<Integer> list){
        list.stream().filter(element->element%2==1).forEach(element->System.out.println(element));
        list.stream().filter(new AcceptPredicate()).forEach(new AcceptConsumer());

    }

    public static void printFPWithEvenNumber(List<Integer> list){
        list.stream().filter(element->element%2==0).forEach(element->System.out.println(element));
    }

    public static void printFPwithAdditionOfNumbers(List<Integer> list){
        System.out.println(list.stream().reduce(0,(number1,number2)->number1+number2));
    }

    public static void printFPWithAdditionOfOddNumbers(List<Integer> list){
        System.out.println(list.stream().filter(element->element%2==1).reduce(0,(element1,element2)->element1+element2));
    }

    public static void printFPWithAdditionOfEvennumber(List<Integer> list){
        System.out.println(list.stream().filter(element->element%2==0).reduce(0,(element1,element2)->{System.out.println(element1+" "+element2);
        return element1+element2;}));
    }

    public static void printFPLengthOfTheElements(List<String> list){
      //  list.stream().forEach(e->System.out.println("element: "+e+", length: "+e.length()));
        //list.stream().map(e->e.length()).forEach(e->System.out.println(e));
        list.stream().map(new AcceptFunction()).forEach(System.out::println);
    }

    public static void printLowerCase(List<String> list){
        list.stream().map(e->e.toLowerCase()).forEach(e->System.out.println(e));
    }

    public static void printSquare(){
        IntStream.range(1,10).map(e->e*e).forEach(e->System.out.println(e));
    }

    public static void findMaxNumber(){
        System.out.println(List.of(23,87,9,45,3,33).stream().max((n1,n2)->Integer.compare(n1,n2)).get());
    }

    public static void finMinNumber(){
        System.out.println(List.of(10,78,45,37,100,76).stream().min((n1,n2)->Integer.compare(n1,n2)).get());
    }

    public static void findOddAsList(){
        System.out.println(List.of(10,78,45,37,100,76).stream().filter(e->e%2==1).collect(Collectors.toList()));
    }

    public static void findEvenAsList(){
        System.out.println(List.of(10,78,45,37,100,76).stream().filter(e->e%2==0).collect(Collectors.toList()));
    }

    public static void findFirst10IntergersSquareAsList(){
        System.out.println(IntStream.range(1,11).map(e->e*e).boxed().collect(Collectors.toList()));
    }
    public static void main(String[] args){
        List<String> list = List.of("Apple","Banana","Pineapple","Grape","Peer");
        List<Integer> numberList = List.of(2,3,4,5,6,7);
        /*printElement(list);
        printFunctionalElement(list);
        printFunctionWithFilter(list);*/

        //printFPwithOddNumber(numberList);
        /*printFPWithEvenNumber(numberList);
        printFPwithAdditionOfNumbers(numberList);*/
        /*printFPWithAdditionOfOddNumbers(numberList);
        printFPWithAdditionOfEvennumber(numberList);*/

        printFPLengthOfTheElements(list);
        //printLowerCase(list);
       // printSquare();

        //findMaxNumber();
        //finMinNumber();
        /*findOddAsList();
        findEvenAsList();*/
        //findFirst10IntergersSquareAsList();
    }

}
