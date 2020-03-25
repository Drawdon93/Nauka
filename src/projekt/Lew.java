package projekt;

public class Lew implements Zwierzę {

    @Override
    public String dajGlos() {
        return "Lew robi raaaaurr, a łap ma: ";
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