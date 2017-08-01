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
        File file2 = new File("katalog");
        boolean mkdir = file2.mkdir();
        FileCheck fc = new FileCheck();
        System.out.println("Podaj nazwe pliku");
        String fileName = sc.nextLine();
        File file = new File(fileName);



        if(file.isFile()) {
            fc.printFileInfo(file);
            System.out.println("Czy plik istnieje? : " + file.exists());
            System.out.println("Rozmiar pliku : " + file.length());
            System.out.println("Scieżka absolutna : " + file.getAbsolutePath());
            System.out.println("Sciezka relatywna : " + file.getPath());
            System.out.println("Data ostatniej modyfikacji : " + file.lastModified());
            System.out.println("Czy plik jest ukryty? : " + file.isHidden());
            System.out.println("Prawo dosepu do pisania : " + file.canWrite());
            System.out.println("Prawo dosepu do wykonywania : " + file.canExecute());
            System.out.println("Prawo dosepu do czytania : " + file.canRead());
        } else if(file.isDirectory()){
            System.out.println("jest katalogiem");
        }


    }
    public void printFileInfo(File file){
        SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");
        System.out.println(file.length() + " " + file.lastModified() + " " + file.getName());
    }
}
