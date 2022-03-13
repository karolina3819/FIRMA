import java.util.Scanner;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int placa;
    private String adres;

    public Pracownik() {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj Imię :");
        this.imie = input.next();
        System.out.println("podaj Nazwisko:");
        this.nazwisko = input.next();
        System.out.println("podaj Płace:");
        this.placa = Integer.parseInt(input.next());
        System.out.println("podaj Adres:");
        this.adres = input.next();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String Imię) {
        this.imie = Imię;
    }
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String Nazwisko) {
        this.nazwisko = Nazwisko;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int Płaca) {
        this.placa = Płaca;
    }

    public void podwyzka(int podwyzka){
        placa+=podwyzka;
    }

    public String toString() {
        String tekst = "Imię:" + imie +"\tNazwisko:"+ nazwisko +"\tPłaca:" + placa + "\tAdres:"+ adres;
        return tekst;

    }}