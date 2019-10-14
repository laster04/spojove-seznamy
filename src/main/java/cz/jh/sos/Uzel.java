package cz.jh.sos;

public class Uzel {

    private String hodnota;
    private Uzel predchozi;
    private Uzel nasledujici;

    public Uzel(String hodnota) {
        this.hodnota = hodnota;
    }

    public String getHodnota() {
        return hodnota;
    }

    public void setHodnota(String hodnota) {
        this.hodnota = hodnota;
    }

    public Uzel getPredchozi() {
        return predchozi;
    }

    public void setPredchozi(Uzel predchozi) {
        this.predchozi = predchozi;
    }

    public Uzel getNasledujici() {
        return nasledujici;
    }

    public void setNasledujici(Uzel nasledujici) {
        this.nasledujici = nasledujici;
    }
}
