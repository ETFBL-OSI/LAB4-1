import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OperacijeTest {

    private static final double DELTA = 1e-9;

    // --- saberi ---

    @Test
    void saberiKriterijumPrihvatanja() {
        assertEquals(5.0, Operacije.saberi(2, 3), DELTA);
    }

    @Test
    void saberiNegativneBrojeve() {
        assertEquals(-5.0, Operacije.saberi(-2, -3), DELTA);
        assertEquals(1.0, Operacije.saberi(-2, 3), DELTA);
    }

    @Test
    void saberiSaNulom() {
        assertEquals(7.0, Operacije.saberi(7, 0), DELTA);
        assertEquals(0.0, Operacije.saberi(0, 0), DELTA);
    }

    @Test
    void saberiRealneBrojeve() {
        assertEquals(0.3, Operacije.saberi(0.1, 0.2), DELTA);
        assertEquals(4.0, Operacije.saberi(1.5, 2.5), DELTA);
    }

    @Test
    void saberiJeKomutativno() {
        assertEquals(Operacije.saberi(3.7, -1.2), Operacije.saberi(-1.2, 3.7), DELTA);
    }

    @Test
    void saberiGranicneVrijednosti() {
        assertEquals(Double.POSITIVE_INFINITY, Operacije.saberi(Double.MAX_VALUE, Double.MAX_VALUE));
        assertEquals(Double.NaN, Operacije.saberi(Double.NaN, 1));
    }

    // --- oduzmi ---

    @Test
    void oduzmiKriterijumPrihvatanja() {
        assertEquals(-1.0, Operacije.oduzmi(2, 3), DELTA);
    }

    @Test
    void oduzmiNegativneBrojeve() {
        assertEquals(1.0, Operacije.oduzmi(-2, -3), DELTA);
        assertEquals(-5.0, Operacije.oduzmi(-2, 3), DELTA);
    }

    @Test
    void oduzmiSaNulom() {
        assertEquals(7.0, Operacije.oduzmi(7, 0), DELTA);
        assertEquals(-7.0, Operacije.oduzmi(0, 7), DELTA);
    }

    @Test
    void oduzmiIsteBrojeve() {
        assertEquals(0.0, Operacije.oduzmi(4.25, 4.25), DELTA);
    }

    @Test
    void oduzmiRealneBrojeve() {
        assertEquals(1.25, Operacije.oduzmi(3.75, 2.5), DELTA);
    }

    @Test
    void oduzmiGranicneVrijednosti() {
        assertEquals(Double.NEGATIVE_INFINITY, Operacije.oduzmi(-Double.MAX_VALUE, Double.MAX_VALUE));
        assertEquals(Double.NaN, Operacije.oduzmi(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
    }

    // --- pomnozi ---

    @Test
    void pomnoziKriterijumPrihvatanja() {
        assertEquals(10.0, Operacije.pomnozi(2.5, 4), DELTA);
    }

    @Test
    void pomnoziNegativneBrojeve() {
        assertEquals(6.0, Operacije.pomnozi(-2, -3), DELTA);
        assertEquals(-6.0, Operacije.pomnozi(-2, 3), DELTA);
    }

    @Test
    void pomnoziSaNulomIJedinicom() {
        assertEquals(0.0, Operacije.pomnozi(123.45, 0), DELTA);
        assertEquals(123.45, Operacije.pomnozi(123.45, 1), DELTA);
    }

    @Test
    void pomnoziRealneBrojeve() {
        assertEquals(0.25, Operacije.pomnozi(0.5, 0.5), DELTA);
    }

    @Test
    void pomnoziJeKomutativno() {
        assertEquals(Operacije.pomnozi(2.5, -4), Operacije.pomnozi(-4, 2.5), DELTA);
    }

    @Test
    void pomnoziGranicneVrijednosti() {
        assertEquals(Double.POSITIVE_INFINITY, Operacije.pomnozi(Double.MAX_VALUE, 2));
        assertEquals(Double.NaN, Operacije.pomnozi(Double.POSITIVE_INFINITY, 0));
    }
}
