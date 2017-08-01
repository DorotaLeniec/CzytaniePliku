package main.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-01.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File myFile = new File("myFile.txt");

        try{
            FileOutputStream fos = new FileOutputStream(myFile);
            PrintWriter writer = new PrintWriter(fos);

            String text = sc.nextLine();
            while(!text.equals("q")) {
                writer.println(text);
                text = sc.nextLine();
            }
            writer.close();
        } catch (IOException fnfe){
            System.out.println("Exception : " + fnfe.getMessage());
        }




    }
}
