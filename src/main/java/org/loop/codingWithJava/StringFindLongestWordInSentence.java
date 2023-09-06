package org.loop.codingWithJava;

public class StringFindLongestWordInSentence {

    public String findLongestWord(String sentence) {

        if(sentence.equals("")||sentence==null){
            return "";
        }


        String [] words = sentence.split(" ");
        int maxLength=0;
        String longestWord="";

        for(String word:words){
            if(word.length()>maxLength){
                maxLength=word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args){
        StringFindLongestWordInSentence stringFindLongestWordInSentence = new StringFindLongestWordInSentence();

        System.out.println(stringFindLongestWordInSentence.findLongestWord("A quick brown fox jumps over the lazy dog"));
        System.out.println(stringFindLongestWordInSentence.findLongestWord("Java is an object oriented programming language"));
    }
}
