package projekt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Zwierzę> zwierzęList = new ArrayList<>();

        zwierzęList.add(new Kot());
        zwierzęList.add(new Pies());
        zwierzęList.add(new Lew());
        zwierzęList.add(new Losos());
        zwierzęList.add(new Słoń());


        for (Zwierzę zwierzę : zwierzęList) {
            System.out.println(zwierzę.dajGlos());
            System.out.println(zwierzę.iloscLap(0));
        }

    }
}
//Praca w grupach. Udostępniacie sobie repozytorium
// nawzajem i dodajecie zwierzęta Lew, Łosoś, Słoń oraz
// utworzyć interfejs Łapy z metodą ilośćŁap.