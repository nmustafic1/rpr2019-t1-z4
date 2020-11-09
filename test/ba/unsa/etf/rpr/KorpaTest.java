package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Artikl a = new Artikl("Cokolada", 5, "ABC123");
        Korpa k = new Korpa();
        assertEquals(true, k.dodajArtikl(a));
        for (int i=1; i<50; i++) {
            k.dodajArtikl(a);
        }
        assertEquals(false, k.dodajArtikl(a));
    }

    @Test
    void getArtikli() {

    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a= new Artikl("cokolada", 56, "abc");
        k.dodajArtikl(a);
        Artikl izbaceni = k.izbaciArtiklSaKodom("abc");
        assertEquals(a.getCijena(), izbaceni.getCijena() );
        assertEquals(a.getNaziv(), izbaceni.getNaziv());
        assertEquals(a.getKod(), izbaceni.getKod());

       assertNull(k.izbaciArtiklSaKodom("abc"));

       assertEquals(null, k.izbaciArtiklSaKodom("abc123"));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Cokolada", 100, "ABC");
        for (int i=0; i<50; i++) {
            k.dodajArtikl(a);
            assertEquals((i+1)*100,k.dajUkupnuCijenuArtikala() );
        }
    }

}