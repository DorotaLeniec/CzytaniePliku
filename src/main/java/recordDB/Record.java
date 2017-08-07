package main.java.recordDB;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by RENT on 2017-08-07.
 */
public class Record {

    private Date creationDate = new Date();
    private long validPeriod;
    private long caseId ;
    private String caseName;
    private static int counter = 0;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");
    public Date getCreationDate() {
        return creationDate;
    }

    public double getValidPeriod() {
        return validPeriod;
    }

    public long getCaseId() {
        return caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public Record(String caseName, long validationPeriod) {

        counter++;
        this.caseName = caseName;
        this.caseId = counter;
        this.validPeriod = validationPeriod;
    }

    @Override
    public String toString() {
            return "Record{" + "\n" +
                    "      creationDate: " + formatter.format(creationDate) + "\n" +
                    "      validPeriod: " + validPeriod + "\n" +
                    "      caseId: " + caseId + "\n" +
                    "      caseName: " + caseName + "\n" +
                    '}';

    }
}
