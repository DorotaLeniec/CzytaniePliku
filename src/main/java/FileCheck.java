package main.java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-01.
 */
public class FileCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileCheck fc = new FileCheck();
        System.out.println("Podaj nazwe pliku");
        String fileName = sc.nextLine();
        File file = new File(fileName);



        if(file.isFile()) {
            fc.printFileInfo(file);
        } else if(file.isDirectory()){
            System.out.println(file.getName() + " jest katalogiem, zawiera " + file.listFiles().length+" plików.");
            for (File singleFile : file.listFiles()) {
                fc.printFileInfo(singleFile);
            }



        }



        fc.printCommands();
        String commandLine = sc.nextLine();
        String[] comandWords = commandLine.split(" ");
        String command = comandWords[0];
        String name = comandWords[1];
            if(command.equals("delete")){
                File fileToDelete = new File(name);
                fileToDelete.delete();
            } else if(command.equals("create_file")){
                File newFile = new File(name);
                try{
                    newFile.createNewFile();
                } catch ( IOException ioe){
                    System.out.println("Nie udało sie stworzyc pliku");
                }
            } else if(command.equals("create_folder")){
                File newDirectory = new File(name);
                newDirectory.mkdir();

            } else {
                fc.printCommands();
                commandLine = sc.nextLine();
            }




    }
    public void printFileInfo(File file){
        SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");
        System.out.println(file.length() + " " + file.lastModified() + " " + file.getName());
    }

    public void printCommands(){
        System.out.println("Komendy: ");
        System.out.println("        - delete <ścieżka>");
        System.out.println("        - create_folder <ścieżka>");
        System.out.println("        - create_file <ścieżka>");
        System.out.println("        - quit");
    }
}
