package main.java.twoApps;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-05.
 */
public class SaveToFIle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileOutputManagement sharedFileManager = new FileOutputManagement("shared",false);
        PrintWriter sharedWriter = sharedFileManager.getOutputStream();
        String fileName = "";
        String inputLine = "SET_FILE";
        System.out.println("Zaczynamy");
        do{
            if(inputLine.equals("SET_FILE")){
                System.out.println("Podaj nazwę pliku:");
                fileName = sc.nextLine();
                sharedWriter.println(fileName);
                sharedWriter.flush();
            }
            FileOutputManagement fileOutputManagement = new FileOutputManagement(fileName,true);
            PrintWriter writer = fileOutputManagement.getOutputStream();
            System.out.println("Otworzono plik "+fileName +".txt.");
            System.out.println("Możesz pisać:");
            do{
                inputLine = sc.nextLine();
                if(inputLine.equals("SET_FILE")){
                    break;
                } else if(!inputLine.equals("q")){
                    writer.println(inputLine);
                    writer.flush();
                }

            }while(!inputLine.equals("q"));
        } while(!inputLine.equals("q"));
    }
}
