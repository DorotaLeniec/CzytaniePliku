package main.java.dwieAplikacje;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-03.
 */
public class ZapisDoPliku {
    public static void main(String[] args) {
        File sharedFile = new File("shared.txt");
        Scanner sc = new Scanner(System.in);

        try(PrintWriter writer = new PrintWriter(new FileOutputStream(sharedFile,true))){
            System.out.println("Otworzono plik sharedFile.txt.");
            System.out.println("Rozpocznij pisanie albo nacisnij 'q' aby wyjsc");
            String line = sc.nextLine();
            while(!line.equals("q")){
                writer.println(line);
                writer.flush();
                line = sc.nextLine();
            }
        }catch (FileNotFoundException fnfe){
            System.out.println("File Not Found.");
        }
    }
}
