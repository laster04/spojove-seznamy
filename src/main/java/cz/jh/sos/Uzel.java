package cz.jh.sos;

public class Uzel {

    private Integer hodnota;
    private Uzel predchozi;
    private Uzel nasledujici;

    public Uzel(Integer hodnota) {
        this.hodnota = hodnota;
    }

    public Integer getHodnota() {
        return hodnota;
    }

    public void setHodnota(Integer hodnota) {
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
