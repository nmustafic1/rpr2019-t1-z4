package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int broj_artikala = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom (String kod){
        Artikl  a1 = null;
        for (int i=0; i<broj_artikala; i++){
            if (kod.equals(artikli[i].getKod())) {
                a1 = artikli[i];
                for (int j=i; i<broj_artikala; j++){
                    artikli[j] = artikli[j+1];
                }
                broj_artikala--;
            }
        }
        return a1;
    }
    public void dodajArtikl (Artikl a){
        artikli[broj_artikala] = a;
        broj_artikala ++;
    }



}
