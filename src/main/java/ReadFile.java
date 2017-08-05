package main.java;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-02.
 */
public class ReadFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        Map<String, Form> formMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String fileLine = "";
            String fullName = "";
            int age = 0;
            String sex = "";
            String odp1 = "";
            String odp2 = "";
            String odp3 = "";

            do {
                fileLine = reader.readLine();
                if(fileLine == null){
                    break;
                }
                if (!fileLine.isEmpty()) {
                    String[] nameValuePair = fileLine.split("=");
                    String name = nameValuePair[0];
                    String value = nameValuePair[1];

                    if (name.equals("imie")) {
                        fullName = value;
                    } else if (name.equals("wiek")) {
                        age = Integer.parseInt(value);

                    } else if (name.equals("plec")) {
                        sex = name;
                    } else if (name.equals("odp1")) {
                        odp1 = value;
                    } else if (name.equals("odp2")) {
                        odp2 = value;
                    } else if (name.equals("odp3")) {
                        odp3 = value;
                    }
                } else {
                    Form form = new Form();
                    form.setImie(fullName);
                    form.setPlec(sex);
                    form.setWiek(age);
                    form.setOdp1(odp1);
                    form.setOdp2(odp2);
                    form.setOdp3(odp3);
                    formMap.put(fullName, form);
                }
            } while (fileLine != null);

//            System.out.println(formMap);
            System.out.println("Podaj Imie i Nazwisko");
            String searchName = sc.nextLine();
            if(formMap.containsKey(searchName)) {
                System.out.println(formMap.get(searchName));
            }else {
                System.out.println("Brak danych :(");
            }

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }
    }
}
