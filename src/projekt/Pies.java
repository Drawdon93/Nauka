package projekt;

public class Pies implements Zwierzę {

    @Override
    public String dajGlos() {
        return "Pies robi: hau hau, a łap ma: ";
    }

    @Override
    public Integer iloscLap(int a) {
        return 4;
    }
}

//    @Override
//    public Integer iloscLap() {
//        return 4;
//    }
