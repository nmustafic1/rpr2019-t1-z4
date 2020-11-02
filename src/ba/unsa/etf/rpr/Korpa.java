package ba.unsa.etf.rpr;

public class Korpa {
    private  Artikl[] a = new Artikl[50];
    private int broj = 0;

    public boolean dodajArtikl(Artikl a1){
        if (broj<50) {
            a[broj] = a1;
            broj++;
            return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return a;
    }

    public Artikl izbaciArtiklSaKodom (String kod) {
        Artikl a1= new Artikl();
        int izbacen = 0;
        for (int i=0; i<broj; i++){
            if (kod.equals (a[i].getKod())) {
                a1=a[i];
                for (int j=i; j<broj; j++){
                    a[j] = a[j+1];
                }
                broj--;
                izbacen = 1;
            }
        }
        if (izbacen==1) return a1;
        return  null;
    }


    public int dajUkupnuCijenuArtikala() {
        int ukupno = 0;
        for (int i = 0; i<broj; i++){
            ukupno += a[i].getCijena();
        }
        return  ukupno;
    }
}
