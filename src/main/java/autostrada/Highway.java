package main.java.autostrada;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-08-05.
 */
public class Highway {
    Map<String,VehicleInfo> vehicles = new HashMap<>();

    void vehicleEntry(String registrationNumber, CarType carType){
       vehicles.put(registrationNumber, new VehicleInfo(registrationNumber,carType));
        System.out.println("Pojazd o nr rej: " + registrationNumber + " wjechał na A1.");

    }

    void searchVehicle(String registrationNumber){
        System.out.println(vehicles.get(registrationNumber));
    }

    void vehicleLeave(String registrationNumber){
        VehicleInfo currentVehicle = vehicles.get(registrationNumber);
        currentVehicle.setLeaveDate(LocalDateTime.now());
        Timestamp entryTime = Timestamp.valueOf(currentVehicle.getEntrDate());
        Timestamp leaveTime = Timestamp.valueOf(currentVehicle.getLeaveDate());
        long timeOnHighway = leaveTime.getTime() - entryTime.getTime();
        System.out.println("=================================");
        System.out.println("POJAZD:");
        System.out.println(vehicles.get(registrationNumber));
        System.out.println("OPUSCIL AUTOSTRADE");
        System.out.println("CZAS POBYTU NA AUTOSTRADZIE: " + timeOnHighway + " ms");
        System.out.println("=================================");
    }
}
