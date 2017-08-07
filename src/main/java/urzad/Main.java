package main.java.urzad;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-07.
 */
public class Main {
    public static void main(String[] args) {
        Department department = new Department();
        department.addOfice(new Office("Biuro rachunkowe"));
        department.addOfice(new Office("Biuro ubezpieczeniowe"));

        System.out.println(department.getOffice(0));
        System.out.println(department.getOffice(1));

        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("      URZĄD 1    ");
        System.out.println("==================");

        System.out.println("Komendy");
        System.out.println("         - dodaj_biuro");
        System.out.println("         - quit");

        String command = sc.nextLine();
        if(command.equals("dodaj_biuro")){
            System.out.println("Podaj nazwę biura");
            department.addOfice(new Office(sc.nextLine()));
        } else if(command.equals("quit")){

        } else {

        }
    }
}
