package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private String kod = "";
    private int cijena;

    public Artikl(String n, int c, String k) {
        naziv = n; cijena = c; kod = k;
    }
    public  Artikl () {
        naziv = "";
        kod = "";
        cijena = 0;
    }

    public String getKod() {
        return kod;
    }

    public int getCijena() {
        return cijena;
    }
    public String getNaziv() {
        return naziv;
    }
}
