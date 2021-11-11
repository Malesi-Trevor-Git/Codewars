package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void createFile(String filePath){
        try{
            File f=new File("/home/trevor/Desktop/"+filePath);
            if (f.createNewFile()){
                System.out.println("File created: "+f.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void writeToFile(String input){
        try{
            FileWriter writer =new FileWriter("/home/trevor/Desktop/malesi.txt");
            writer.write(input);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String readFromFile(String filePath) throws FileNotFoundException {
        File f =new File(filePath);
        String data=null;
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()){
            data=scanner.nextLine();
        }
        scanner.close();
        return data;
    }
}
