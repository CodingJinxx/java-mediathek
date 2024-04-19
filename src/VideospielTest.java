import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VideospielTest {
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "Steamdeck";
    private Videospiel _videospiel1;
    private Videospiel _videospiel2;

    public VideospielTest()
    {
        _videospiel1 = getMedium();
        _videospiel2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videospiel1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _videospiel1.getTitel());
        assertEquals(KOMMENTAR, _videospiel1.getKommentar());
        assertEquals(SYSTEM, _videospiel1.getSystem());
        assertEquals(BEZEICHNUNG, _videospiel1.getMedienBezeichnung());
    }

    @Test
    /*
     * Von ein und der selben Videospiele kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertNotEquals("Mehrere Exemplare der gleichen Videospiele sollten ungleich sein", _videospiel1, _videospiel2);
        assertEquals("Dasselbe Exemplare der gleichen Videospiele sollte gleich sein", _videospiel1, _videospiel1);
    }

    private Videospiel getMedium()
    {
        return new Videospiel(TITEL, SYSTEM, BEZEICHNUNG, KOMMENTAR);
    }
}
