package main.java.recordDB;

import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

/**
 * Created by RENT on 2017-08-07.
 */
public class DataBase {
    private Map<Long, Record> map = new HashMap<>();

    public void addRecodr(String name, long validation) {
        Record record = new Record(name, validation);
        map.put(record.getCaseId(), record);
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "map=" + map +
                '}';
    }

    public Optional<Record> findRecordById(Long id) {
        if (map.containsKey(id)) {
            return Optional.of(map.get(id));
        } else {
            return Optional.empty();
        }
    }

    public void refresh() {
        Date currentTime = new Date();
        Iterator<Record> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            Record rec = iterator.next();
            if (currentTime.getTime() - rec.getValidPeriod() > rec.getCreationDate().getTime()) {
                iterator.remove();
                System.out.println("Usunięto rekord o id : " + rec.getCaseId());
            }
        }

    }
}

