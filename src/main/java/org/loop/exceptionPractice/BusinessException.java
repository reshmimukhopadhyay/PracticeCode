package org.loop.exceptionPractice;

public class BusinessException {

    public void businessNullPointer(){
        try{
        String name = null;
        name.length();
        }catch (NullPointerException e){
            System.out.println("NullPointerException occured"+ e.getMessage());
        }
    }


    public static void main(String[] args){
        BusinessException businessException = new BusinessException();
        businessException.businessNullPointer();
    }
}
