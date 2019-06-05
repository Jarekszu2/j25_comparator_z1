package pacComparator;

import java.util.Comparator;

public class OsobaComparator implements Comparator<Osoba> {
    public int compare(Osoba o1, Osoba o2) {
        return Integer.compare(o1.getWiek(), o2.getWiek());
    }
}
