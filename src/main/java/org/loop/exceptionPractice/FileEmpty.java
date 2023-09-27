package org.loop.exceptionPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEmpty {

    public String fileEmpty(String fileName) throws FileNotFoundException {
        File file = new File(fileName);

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
           String fileLine = scanner.nextLine();
           if(fileLine.isEmpty()){
               throw new FileNotFoundException("File is empty");
           }
        }
        return "File is not empty";
    }

    public static void main(String[] args) throws FileNotFoundException{
        FileEmpty fileEmpty = new FileEmpty();
        fileEmpty.fileEmpty("file1.txt");
    }

}
