package org.loop.codingWithJava1;

public class Reviews {

    private String rating;
    private String comment;

    public Reviews(String rating,String comment){
        this.rating=rating;
        this.comment=comment;
    }

    public String toString(){
      return   rating+" "+comment;
    }
}
