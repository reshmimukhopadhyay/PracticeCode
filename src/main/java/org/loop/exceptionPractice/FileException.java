package org.loop.exceptionPractice;

import java.io.File;
import java.util.Scanner;

public class FileException {

    public void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (Exception exception){
            System.out.println("File Not Found "+exception.getMessage());
        }
    }

    public static void main(String[] args) throws Exception{
        FileException fileException = new FileException();
        fileException.readFile("file1.txt");
    }
}
