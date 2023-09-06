package org.loop.codingWithJava1;

import java.util.ArrayList;

public class Book {

    private int id;
    private String bookName;
    private String author;
    private ArrayList<Reviews> reviews = new ArrayList<Reviews>();

    public Book(int id,String bookName,String author){
        this.id = id;
        this.bookName=bookName;
        this.author=author;

    }


    public void addReview(Reviews review){
        this.reviews.add(review);
    }
    public String toString(){
        return String.format("bookName-%s author-%s review-%s",bookName,author,reviews);
    }
    public static void main(String[] args){
        Book book=new Book(1,"OOPS","Balaguruswami");
        book.addReview(new Reviews("* * * *,", "Good Book to read"));
        System.out.println(book);
    }
}
