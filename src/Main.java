import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pracownik> lista_aut=new ArrayList<>();
        for (int i =0;i<2;i++){
            lista_aut.add(new Pracownik());

        }
        for (Pracownik i : lista_aut){
            System.out.println(i.toString());
        }


    }
}
