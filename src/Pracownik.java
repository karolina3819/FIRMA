import java.util.Scanner;

public class Pracownik {
    private String Imię;
    private String Nazwisko;
    private int Wiek;
    private int Płaca;
    private String Adres;

    public Pracownik() {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj Imię :");
        this.Imię = input.next();
        System.out.println("podaj Nazwisko:");
        this.Nazwisko = input.next();
        System.out.println("podaj Wiek:");
        this.Wiek = Integer.parseInt(input.next());
        System.out.println("podaj Płace:");
        this.Płaca = Integer.parseInt(input.next());
        System.out.println("podaj Adres:");
        this.Adres = input.next();
    }

    public String getImię() {
        return Imię;
    }

    public void setImię(String Imię) {
        this.Imię = Imię;
    }
    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }


    public int getWiek() {
        return Wiek;
    }

    public void setWiek(int Wiek) {
        this.Wiek = Wiek;
    }

    public int getPłaca() {
        return Płaca;
    }

    public void setPłaca(int Płaca) {
        this.Płaca = Płaca;
    }

    public String toString() {
        String tekst = "Imię:" + Imię +"\nNazwisko:"+Nazwisko+"\nPłaca:" + Płaca + "\nWike:" + Wiek +"\nAdres:"+Adres;
        return tekst;

    }}