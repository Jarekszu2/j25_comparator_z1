package pacComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOsoba {
    public static void main(String[] args) {
        System.out.println();

        Osoba os1 = new Osoba("im1", "naz1", 23);
        Osoba os2 = new Osoba("im2", "naz2", 25);
        Osoba os3 = new Osoba("im3", "naz3", 28);
        List<Osoba> listaOsob = new ArrayList<Osoba>();
        listaOsob.add(os1);
        listaOsob.add(os2);
        listaOsob.add(os3);

        Collections.sort(listaOsob, new OsobaComparator());
        System.out.println(listaOsob);
    }
}
