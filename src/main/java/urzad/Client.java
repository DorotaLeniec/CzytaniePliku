package main.java.urzad;

/**
 * Created by RENT on 2017-08-07.
 */
public class Client {
    CaseType caseType;
    String pesel;

    public CaseType getCaseType() {
        return caseType;
    }

    public void setCaseType(CaseType caseType) {
        this.caseType = caseType;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Client(CaseType caseType, String pesel) {

        this.caseType = caseType;
        this.pesel = pesel;
    }
}
