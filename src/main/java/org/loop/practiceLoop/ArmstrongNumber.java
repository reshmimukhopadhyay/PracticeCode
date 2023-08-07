package org.loop.practiceLoop;

public class ArmstrongNumber {

    int givenNumber = 122, remainder,reverse=0;
    int temp=givenNumber;

    public void armstrongNumber(){
        while (givenNumber>0){
            remainder=givenNumber%10;
            givenNumber = givenNumber/10;
            reverse = reverse+remainder*remainder*remainder;
        }

        if(temp==reverse){
            System.out.println("It is Armstrong Number");
        }else
            System.out.println("It is not Armstrong Number");
    }
}
