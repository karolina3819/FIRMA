import javafx.scene.chart.ScatterChart;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {
        ArrayList<Pracownik> lista_aut = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String czynnosc;
        while (true) {
            System.out.println("Wyjscie(x),Dodawanie Pracownika(d),Zwolnij Pracownika(z),Podwyżka(p),Płace Pracownika($),Wyświetl wszystkich(all)");
            czynnosc = input.next();
            if (czynnosc.equals("x")) {
                break;
            }
            switch (czynnosc) {
                case "d":
                    lista_aut.add(new Pracownik());
                    break;

                case "all"://dodac kolejnosc zeby potem usuwac
                    for (Pracownik temp : lista_aut) {
                        System.out.println(temp.toString());
                    }

                    break;
                case "z":
                    System.out.println("Podaj indeks pracownika");
                    int kogo_usunac = input.nextInt();
                    lista_aut.remove(kogo_usunac);
                    break;
                case "p":
                    System.out.println("Podaj indeks pracownika");
                    int kommu = input.nextInt();
                    System.out.println("Podaj o ile ");
                    int wartosc = input.nextInt();
                    lista_aut.get(kommu).podwyzka(wartosc);


                    break;
                case "$":
                    int wszystkiePlace = 0;
                    for (Pracownik temp : lista_aut) {
                        wszystkiePlace += temp.getPlaca();
                    }
                    System.out.println(wszystkiePlace);
                    break;

                case "plik":
                    try {
                        File plik = new File("plik_tekstowy.txt");
                        plik.createNewFile();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        FileWriter plik = new FileWriter("plik_tekstowy.txt");

                        for (Pracownik temp : lista_aut) {
                            plik.write(temp.toString()+"\n");
                        }
                        plik.close();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                default:
                    break;

            }


        }
    }
}


//