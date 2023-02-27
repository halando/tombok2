import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] szamTomb = new int[] { 35, 27, 12 };
        System.out.println(szamTomb[0]);

        String[] szoTomb = {
                "alma",
                "körte",
                "barack" };
        System.out.println(szoTomb[0]);
        ArrayList<String> szoLista = new ArrayList<>(Arrays.asList(szoTomb));

        System.out.println(szoLista.get(0));



        
    }
}
