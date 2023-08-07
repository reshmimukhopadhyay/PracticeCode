package org.loop.loop1;

/*Reverse a number*/
public class ReverseNumber {

    int givenNumber=12096145,reverse=0,remainder,quotient;
    public void reverseNumber(){
        while(givenNumber>0){
            remainder=givenNumber%10;
            givenNumber=givenNumber/10;
            reverse=reverse*10+remainder;
           }
        System.out.println("reverse: "+reverse);
        }
    }

