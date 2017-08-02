package main.java;

/**
 * Created by RENT on 2017-08-02.
 */
import java.io.*;
import java.util.Scanner;

/**
 * Created by amen on 8/1/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Zaczynamy.");

        File naszPlik = new File("test.txt");
        if (naszPlik.exists()) {
            System.out.println("Plik istnieje.");//
        } else {
            System.out.println("Plik nie istnieje.");
        }

        // otwieramy skaner - przekazujemy wejscie (konsole) jako parametr
        Scanner sc = new Scanner(System.in);

        // otwieramy strumień wyjścia - czyli kanał wypisywania danych do pliku
        // w pierwszej linii parametrem OutputStream'u jest plik. Wynikiem jest obiekt (File)OutputStream (dziedziczy po OutputStream)
        // na podstawie którego tworzymy PrintWritera(druga linia) - fos jest przekazywany jako parametr konstruktora
        try (FileOutputStream fos = new FileOutputStream(naszPlik);
             PrintWriter writer = new PrintWriter(fos)) {


            do {
                Form formularz = new Form();
                System.out.println("Podaj imie i nazwisko:");
                formularz.setImie(sc.nextLine());
//                String imie_nazwisko = sc.nextLine();
//                writer.println(imie_nazwisko);

                Integer wiek = null; // tworzę zmienną wiek i przypisuję do niej null
                do {
                    System.out.println("Podaj wiek:");
                    String wiek_string = sc.nextLine(); // pobieram wiek (jako string)

                    try {
                        wiek = Integer.parseInt(wiek_string); // próbuje parsować (rzuci się exception jeśli string nie będzie liczbą)
                    } catch (NumberFormatException nfe) {
                        System.out.println("Nieporawne dane wejsciowe.");
                    }
                } while (wiek == null);
                formularz.setWiek(wiek);
                // writer.println(wiek);

                // czytamy płeć
                System.out.println("Podaj plec:");
//                String plec = sc.nextLine();
//                writer.println(plec);
                formularz.setPlec(sc.nextLine());

                // warunek mezczyzny
//                if((plec.toLowerCase().equals("mezczyzna") && wiek >25 && wiek <30)  ||
//                        plec.toLowerCase().equals("kobieta") && wiek >18 && wiek <25){
                if((formularz.getPlec().toLowerCase().equals("mezczyzna") && wiek >25 && wiek <30)  ||
                        formularz.getPlec().toLowerCase().equals("kobieta") && wiek >18 && wiek <25){
                    // warunek spelniony

                    // czytamy pytanie 1
                    System.out.println("Pytanie1:");
//                    String p1 = sc.nextLine();
//                    writer.println(p1);
                    formularz.setOdp1(sc.nextLine());

                    // czytamy pytanie 2
                    System.out.println("Pytanie2:");
//                    String p2 = sc.nextLine();
//                    writer.println(p2);
                    formularz.setOdp2(sc.nextLine());

                    // czytamy pytanie 3
                    System.out.println("Pytanie3:");
//                    String p3 = sc.nextLine();
//                    writer.println(p3);
                    formularz.setOdp3(sc.nextLine());
                }else {
                    System.out.println("Nie spełniasz kryteriów wiekowych ankiety, dziękujemy!");
                }

                writer.println(formularz);
                // zadaje pytanie, a następnie sprawdzam czy odpowiedź to tak [nextLine]
                System.out.println("Czy chcesz wypełnić kolejną ankietę? (tak/nie)");
            } while (sc.nextLine().equals("tak"));


        } catch (IOException fnfe) {
            System.out.println("Exception : " + fnfe.getMessage());
        }
    }
}