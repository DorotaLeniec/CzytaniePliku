package main.java.urzad;

/**
 * Created by RENT on 2017-08-07.
 */
public class Office {
    private String name;

    @Override
    public String toString() {
        return "Office{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Office(String name) {

        this.name = name;
    }

    public void handleClient(Client client){
        System.out.println("Klient pesel: "+ client.getPesel());
        System.out.println("załatwia sprawę " + client.getCaseType());
    }
}
