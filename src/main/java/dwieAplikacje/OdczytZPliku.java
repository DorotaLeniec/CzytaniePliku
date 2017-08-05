package main.java.dwieAplikacje;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-03.
 */
public class OdczytZPliku {
    public static void main(String[] args) {
        File sharedFile = new File("shared.txt");
        Scanner sc = new Scanner(System.in);

        if (sharedFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(sharedFile))) {
                String line = reader.readLine();
                String command = "";
                while (!command.equals("q")) {
                    if (line != null) {
                        System.out.println(line);
                        line = reader.readLine();
                    } else {
                        try {
                            Thread.sleep(2000);
                            line = reader.readLine();
                        } catch (InterruptedException ie) {

                        }
                    }

                }

            } catch (FileNotFoundException fnfe) {
                System.out.println("File Not Found");
            } catch (IOException ioe) {
                System.out.println("IOExeption");
            }
        }
    }
}
