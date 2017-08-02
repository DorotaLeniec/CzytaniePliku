package main.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-01.
 */
public class Ankieta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Podaj imie i nazwisko");
        String name = sc.nextLine();

        System.out.println("Podaj wiek");
        String line;
        int age = 0;
        do {
             line = sc.nextLine();
             try {
                 age = Integer.parseInt(line);
             } catch (NumberFormatException nfe){
                 System.out.println("niepoprawne dane!");
             }
        } while(age == 0);
        System.out.println("Podaj płeć");
        String sex = sc.nextLine();

        File file = new File("ankieta.txt");
        try(FileOutputStream fos = new FileOutputStream(file,true);
            PrintWriter writer = new PrintWriter(fos)) {
            String quit = "";
            while(!quit.equals("q")) {
                if ((sex.equals("k") && age > 18 && age < 25)
                        || (sex.equals("m") && age > 25 && age < 30)) {
                    writer.println("Imie i nazwisko :" + name);
                    writer.println("Wiek :" + age);
                    writer.println("Płeć :" + sex);
                    System.out.println("Jakie masz hobby?");
                    writer.println("Hobby : " + sc.nextLine());
                    System.out.println("Kot czy pies?");
                    writer.println("Zwierze : " + sc.nextLine());
                    System.out.println("Twój komentarz");
                    writer.println("Komentarz : " + sc.nextLine());
                    writer.println();
                    writer.println();
                    System.out.println("Czy chcesz wypełnić kolejna ankiete? ");
                    if(sc.nextLine().equals("nie")){
                        quit = "q";
                    }
                } else {
                    break;
                }
            }

        } catch (IOException fnfe){
            System.out.println("Exception : "+ fnfe.getMessage());
        }
    }
}
