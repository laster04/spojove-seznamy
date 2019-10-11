package cz.jh.sos;

public class SpojovySeznam {

    private Uzel prvni;
    private Uzel poslendi;
    private int size;


    public Uzel initSeznam(int delkaSeznamu) {
        Uzel prvniUzel = new Uzel(1);
        Uzel predchoziUzel = prvniUzel;
        for (int i = 2; i <= delkaSeznamu; i++) {
            Uzel nasledujiciUzel = new Uzel(i);
            predchoziUzel.setNasledujici(nasledujiciUzel);
            nasledujiciUzel.setPredchozi(predchoziUzel);
            predchoziUzel = nasledujiciUzel;
        }

        return prvniUzel;
    }
}
