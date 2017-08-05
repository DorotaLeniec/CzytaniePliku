package main.java.dwieAplikacje;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-03.
 */
public class ZapisDoPliku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZapisDoPliku zapis = new ZapisDoPliku();
        String line = "";

        while (!line.equals("q")) {
            String fileName = "shared";
            PrintWriter writer = zapis.getFileOutputStream(fileName);
            System.out.println("Otworzono plik "+fileName+".");
            System.out.println("Rozpocznij pisanie albo nacisnij 'q' aby wyjsc");
            while (!line.equals("q")) {
                if (line.equals("SET_FILE")) {
                    System.out.println("Podaj nazwe pliku.");
                    fileName = sc.nextLine();
                    break;
                } else {
                    writer.println(line);
                    writer.flush();
                    line = sc.nextLine();
                }
            }

        }
    }

    public PrintWriter getFileOutputStream(String fileName) {
        File file = new File(fileName+".txt.");
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(file));
            return writer;
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found.");
        }
        return null;
    }
}
