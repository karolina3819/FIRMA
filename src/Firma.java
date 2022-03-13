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

                case "all":
                    System.out.println(lista_aut.toString());
                    break;
                case "z":
                    System.out.println("Podaj dane pracownika");
                    System.int kogo_usunac = input.nextInt();
                    lista_aut.remove(kogo_usunac);
                    break;
                //    case "p":

                //        break;
                //    case "$":

                //        break;
                //    default:
                //        break;

            }


        }
    }
}


//   for (int i =0;i<2;i++){
//       lista_aut.add(new Pracownik());

//   }
//   for (Pracownik i : lista_aut){
//       System.out.println(i.toString());
//   }