package projekt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> AnimalList = new ArrayList<>();
        AnimalList.add(new Kot());
        AnimalList.add(new Pies());
        AnimalList.add(new Losos());
        for (Animal one:AnimalList){
        System.out.println(one.dajGlos());
        System.out.println(one.iloscLap());
        }


    }


}
//Praca w grupach. Udostępniacie sobie repozytorium
// nawzajem i dodajecie zwierzęta Lew, Łosoś, Słoń oraz
// utworzyć interfejs Łapy z metodą ilośćŁap.