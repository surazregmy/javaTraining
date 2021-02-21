package com.javaclass.filehandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingMain {

    private static String FILE_NAME ="test.txt";

    public static void main(String[] args) throws IOException {
        // FIle Writing
        try (FileWriter fw = new FileWriter(FILE_NAME)) {
            fw.write("My name is Suraj");
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }

        // FIle Reading
        FileReader fileReader;
        int ch;
        try {
            fileReader = new FileReader(FILE_NAME);
            BufferedReader br = new BufferedReader(fileReader);
            if(br.readLine() == null){
                System.out.println("File empty");
            }

            while ((ch = fileReader.read()) != -1){
                System.out.print((char) ch);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
