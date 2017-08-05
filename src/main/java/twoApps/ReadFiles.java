package main.java.twoApps;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-05.
 */
public class ReadFiles {
    public static void main(String[] args) {
        File sharedFile = new File("shared.txt");
        Scanner sc = new Scanner(System.in);
        String fileName;
        String readLine = "";

        if (sharedFile.exists()) {
            try (BufferedReader sharedReader = new BufferedReader(new FileReader(sharedFile))) {
                while(true){
                    fileName = sharedReader.readLine();
                    if(fileName!=null && !fileName.equals("")){
                        File newFile = new File(fileName+".txt");
                        BufferedReader reader = new BufferedReader(new FileReader(newFile));
                        while(true){
                            readLine = reader.readLine();
                            if(readLine!=null){
                                System.out.println(readLine);
                            } else {
                                try{
                                    Thread.sleep(1000);
                                }catch (InterruptedException ie){

                                }
                            }

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
