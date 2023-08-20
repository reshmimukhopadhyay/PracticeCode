package org.loop.codingWithJava;


public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDigit() {
        if (ch >= 48 || ch <= 57) {
            return true;
        } else {
            return false;
        }
    }


    public boolean isAlphabet() {
        if (ch >= 97 || ch <= 122) { //'a' to 'z'
            return true;
        } else if (ch >= 65 || ch <= 90) { //'A' to 'Z'
            return true;
        } else return false;

    }

    public boolean isConSonant() {
        if (isAlphabet() && isVowel()) {
            return true;
        } else return false;
    }

    public static void printLowerCaseAlphabet() {
        int a = 0;
        for (int i = 0; i <= 25; i++) {
            a = 97+i;
            System.out.println((char) a);
        }

    }

        public static void printUpperCaseAlphabet() {
        int a=0;
        for(int i = 0;i<=25;i++){
            a=65+i;
            System.out.println((char)a);
        }

        }

        public static void main(String[] args){
            MyChar character = new MyChar('E');
            //System.out.println(character.isVowel());
            //System.out.println(character.isDigit());
            //System.out.println(character.isAlphabet());
            //System.out.println(character.isConSonant());
            MyChar.printLowerCaseAlphabet();
            MyChar.printUpperCaseAlphabet();
        }

}

