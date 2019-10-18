package cz.jh.sos;

public class SpojovySeznam {

    private Uzel prvni;
    private Uzel posledni;
    private int size = 0;


    public void initSeznam(int delkaSeznamu) {
        for (int i = 1; i <= delkaSeznamu; i++) {
            this.add("aaaa" + String.valueOf(i));
        }
    }

    public void add(String value) {
        Uzel newUzel = new Uzel(value);
        if (size == 0) {
            prvni = newUzel;
            posledni = newUzel;
        } else if (size == 1) {
            prvni.setNasledujici(newUzel);
            posledni = newUzel;
            posledni.setPredchozi(prvni);
        } else {
            posledni.setNasledujici(newUzel);
            posledni = newUzel;
        }
        size++;
    }

    public Uzel getByIndex(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index je mimo pole");
        }
        int i = 1;
        Uzel ret = prvni;
        while (i < index) {
            ret = ret.getNasledujici();
            i++;
        }
        return ret;
    }

    public void removeLast() {
        posledni = posledni.getPredchozi();
        posledni.setNasledujici(null);
        size--;
    }

    public int getSize() {
        return size;
    }

    public void addOnIndex(String hodnota, int index) {
    }

    public void removeByIndex(int index) {

    }
}
