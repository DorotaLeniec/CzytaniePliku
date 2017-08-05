package main.java.autostrada;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by RENT on 2017-08-05.
 */
public class VehicleInfo {

    private String registrationNumber;
    private CarType carType;
    private LocalDateTime entryDate = LocalDateTime.now();
    private LocalDateTime leaveDate = null;

    public LocalDateTime getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDateTime leavDate) {
        this.leaveDate = leavDate;
    }
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss , yyyy/MM/dd");

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }



    public VehicleInfo(String registrationNumber, CarType carType) {
        this.registrationNumber = registrationNumber;
        this.carType = carType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDateTime getEntrDate() {
        return entryDate;
    }



    @Override
    public String toString() {
        if(leaveDate!=null) {
            return "VehicleInfo{" + '\n' +
                    "   Numer rejestracyjny : " + registrationNumber + '\n' +
                    "   Typ pojazdu : " + carType + '\n' +
                    "   Data wjazdu : " + entryDate.format(formatter) + '\n' +
                    "   Data wyjazdu : " + leaveDate.format(formatter) + '\n' +
                    '}';
        } else {
            return "VehicleInfo{" + '\n' +
                    "   Numer rejestracyjny : " + registrationNumber + '\n' +
                    "   Typ pojazdu : " + carType + '\n' +
                    "   Data wjazdu : " + entryDate.format(formatter) + '\n' +
                    '}';
        }
    }
}
