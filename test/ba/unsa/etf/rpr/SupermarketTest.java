package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Cokolada", 25, "abcd");
        for (int i=0; i<50; i++) {
            s.dodajArtikl(a);
        }
        assertEquals(50, s.getBroj_artikala());
      assertNull(s.izbaciArtiklSaKodom("a"));

      Artikl izbaceni = s.izbaciArtiklSaKodom("abcd");
     assertEquals( a.getCijena(),  izbaceni.getCijena());
     assertEquals(a.getKod(), izbaceni.getKod());
     assertEquals(a.getNaziv(), izbaceni.getNaziv());


     assertNull(s.izbaciArtiklSaKodom("abc"));

    }

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Cokolada", 15, "abc");
        for (int i=0; i<1000; i++) {
            s.dodajArtikl(a);
            assertEquals(i+1, s.getBroj_artikala());
        }
        s.dodajArtikl(a);
        assertEquals(1000, s.getBroj_artikala());
    }
}