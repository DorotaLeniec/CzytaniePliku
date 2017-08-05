package main.java.autostrada;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-05.
 */
public class Autostrada {
    public static void main(String[] args) {

//
//        Highway highWay = new Highway();
//        highWay.vehicleEntry("WOW A332", CarType.MOTOCYCLE);
//        highWay.searchVehicle("WOW A332");
//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException ie){
//
//        }
//        highWay.vehicleLeave("WOW A332");

        Highway highway = new Highway();
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("         WITAJ na A1        ");
        System.out.println("============================");
        System.out.println("Komendy: ");
        System.out.println("         - wjazd <nr rej, typ>");
        System.out.println("         - wyjazd <nr rej>");
        System.out.println("         - znajdz <nr rej>");
        System.out.println("         - exit ");
        String command;
        boolean exit = false;
        String registrationNumber ="";
        CarType vehicleType = CarType.CAR;
        String commandLine = sc.nextLine();

        while (!exit) {
            String[] commands = commandLine.split(" ");
            if (commands.length  > 1 ) {
                command = commands[0];
                registrationNumber = commands[1];
                if (commands.length > 2) {
                    String type = commands[2];
                    if(type == "MOTOCYCLE"){
                        vehicleType = CarType.MOTOCYCLE;
                    } else if(type == "CAR"){
                        vehicleType = CarType.CAR;
                    }else if(type == "TRUCK"){
                        vehicleType = CarType.TRUCK;
                    }
                }
            } else {
                command = commandLine;
            }
            if (command.equals("exit")) {
                exit = true;
            } else if (command.equals("wjazd")) {
                System.out.println("_______wjazd________");
                highway.vehicleEntry(registrationNumber,vehicleType);
            } else if (command.equals("wyjazd")) {
                System.out.println("-______wyjazd_______");
                highway.vehicleLeave(registrationNumber);
            } else if (command.equals("znajdz")) {
                System.out.println("_______znajdz_______");
                highway.searchVehicle(registrationNumber);
            } else {
                System.out.println("Komenda nieznana.");
            }
            if(!exit) {
                System.out.println("Co teraz?");
                commandLine = sc.nextLine();
            }


        }


    }
}
