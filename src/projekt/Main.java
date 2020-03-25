package projekt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Glos> GlosList = new ArrayList<>();
        GlosList.add(new Kot());
        GlosList.add(new Pies());
        for (Glos one:GlosList){
        System.out.println(one.dajGlos());}
    }

}
