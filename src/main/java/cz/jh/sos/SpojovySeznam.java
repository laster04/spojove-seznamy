package cz.jh.sos;

import java.util.Random;

public class SpojovySeznam {

    private Uzel prvni;
    private Uzel poslendi;
    private int size;


    public void initSeznam(int delkaSeznamu) {
        for (int i = 0; i < delkaSeznamu; i++) {
            this.add("aaaa" + String.valueOf(i));
        }
    }

    public void add(String value) {
    }

    public Uzel getByIndex(int index) {
        return null;
    }

    public void removeLast() {

    }

    public int getSize() {
        return 0;
    }
}
