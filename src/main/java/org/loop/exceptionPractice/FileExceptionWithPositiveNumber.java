package org.loop.exceptionPractice;

import java.io.File;
import java.util.Scanner;

public class FileExceptionWithPositiveNumber {

    public void positiveNumber(String fileName){
        try{
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);

            }

        }catch (Exception exception){
            System.out.println("Number Is Positive "+exception.getMessage());
        }
    }

    public static void main(String[] args) throws Exception{
        FileExceptionWithPositiveNumber fileException = new FileExceptionWithPositiveNumber();
        fileException.positiveNumber("/Users/rmukhop2/Documents/PracticeProject/Practice/src/main/java/org/loop/exceptionPractice/file1.txt");
    }
}
