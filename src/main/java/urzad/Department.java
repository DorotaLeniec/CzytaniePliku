package main.java.urzad;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * Created by RENT on 2017-08-07.
 */
public class Department {
    private List<Office> offices = new LinkedList<>();

    void addOfice(Office office){
        offices.add(office);
    }

    Office getOffice(int index){
            return offices.get(index);

    }


}
