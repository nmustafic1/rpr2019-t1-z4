package ba.unsa.etf.rpr;

import java.sql.SQLOutput;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int broj_artikala = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }
    int getBroj_artikala() { return  broj_artikala;}

    public Artikl izbaciArtiklSaKodom (String kod){
        Artikl  a1 = null;

        for (int i=0; i<broj_artikala; i++){
            if (kod.equals(artikli[i].getKod())) {
                a1 = artikli[i];
                for (int j=i; j<broj_artikala-1; j++){
                    artikli[j] = artikli[j+1];
                }
                i--;
                broj_artikala--;
            }
        }
        return a1;
    }
    public void dodajArtikl (Artikl a){
        if (broj_artikala<1000) {
            artikli[broj_artikala] = a;
            broj_artikala++;
        }
    }



}
