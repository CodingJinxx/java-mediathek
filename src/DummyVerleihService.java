import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Diese Klasse implementiert das Interface VerleihService. Es handelt sich
 * lediglich um eine Dummy-Implementation, um die GUI zu testen.
 * 
 * @author GUI-Team
 * @version SoSe 2021
 */
class DummyVerleihService extends AbstractObservableService
        implements VerleihService
{
    // Generator für Zufallszahlen und zufällige boolsche Werte
    private static final Random RANDOM = new Random();

    private static final CD MEDIUM = new CD("Titel", "Kommentar", "Interpret",
            70);
    private static final Kundennummer KUNDENNUMMER = new Kundennummer(123456);
    private static final Kunde ENTLEIHER = new Kunde(KUNDENNUMMER, "Vorname",
            "Nachname");
    private static final Verleihkarte VERLEIHKARTE = new Verleihkarte(ENTLEIHER,
            MEDIUM, Datum.heute());

    /**
     * Konstruktor mach absolut nix, chillt seine basis
     * @param kundenstamm
     * @param medienbestand
     * @param initialBestand
     */
    public DummyVerleihService(KundenstammService kundenstamm,
            MedienbestandService medienbestand,
            List<Verleihkarte> initialBestand)
    {
    }

    /**
     * Sollte die ausgeliehenen Medien eines Kunden ausliefern
     * Liefert nur die variable MEDIUM in einer neuer ArrayList
     */
    @Override
    public List<Medium> getAusgelieheneMedienFuer(Kunde kunde)
    {
        List<Medium> ergebnisListe = new ArrayList<Medium>();
        ergebnisListe.add(MEDIUM);
        return ergebnisListe;
    }

    /**
     * Sollte den entleiher des angegebenen mediums liefern
     * liefert nur die variable Entleiher
     */
    @Override
    public Kunde getEntleiherFuer(Medium medium)
    {
        return ENTLEIHER;
    }

    /**
     * Sollte die verleihkarte für das medium liefern
     * liefert nur die variable VERLEIHKARTE
     */
    @Override
    public Verleihkarte getVerleihkarteFuer(Medium medium)
    {
        return VERLEIHKARTE;
    }

    /**
     * Sollte die verleihkarten liefern
     * Liefert immer eine Verleihkarte mit dem ENTLEIHER, MEDIUM und heutigem Datum
     */
    @Override
    public List<Verleihkarte> getVerleihkarten()
    {
        List<Verleihkarte> ergebnisListe = new ArrayList<Verleihkarte>();
        ergebnisListe.add(VERLEIHKARTE);
        return ergebnisListe;
    }

    /**
     * Sollte pruefen ob das Medium verliehen ist
     * Liefert immer einen zufaelligen Wert zurueck
     */
    @Override
    public boolean istVerliehen(Medium medium)
    {
        return RANDOM.nextBoolean();
    }

    /**
     * Sollte zuvor ausgeliehene Medien zuruecknehmen und die Verleihkarte loeschen
     * Macht ueberhaupt nichts
     */
    @Override
    public void nimmZurueck(List<Medium> medien, Datum rueckgabeDatum)
    {
    }

    /**
     * Sollte pruefen ob alle angegebenen Medien nicht verliehen sind
     * Liefert immer einen zufaelligen Wert zurueck
     */
    @Override
    public boolean sindAlleNichtVerliehen(List<Medium> medien)
    {
        return RANDOM.nextBoolean();
    }

    /**
     * Sollte pruefen ob alle angegeben medien verliehen sind
     * ist random
     */
    @Override
    public boolean sindAlleVerliehen(List<Medium> medien)
    {
        return RANDOM.nextBoolean();
    }

    /**
     * Macht nix
     * Sollte medien an kunden verleihen und eine verleihkarte anlegen
     */
    @Override
    public void verleiheAn(Kunde kunde, List<Medium> medien, Datum ausleihDatum)
    {
    }

    /**
     * Sollte uebepruefen ob der kunde existiert
     * ueberprueft aber nur zu der mock variable
     */
    @Override
    public boolean kundeImBestand(Kunde kunde)
    {
        return ENTLEIHER.equals(kunde);
    }

    /**
    * Sollte uebepruefen ob der medium existiert
    * ueberprueft aber nur zu der mock variable
    */
    @Override
    public boolean mediumImBestand(Medium medium)
    {
        return MEDIUM.equals(medium);
    }

    /**
     * Sollte uebepruefen ob die medien existieren
     * Ist richtig implementiert, aber die medium im bestand methode muss noch 
     * richtig implementiert werden
     */
    @Override
    public boolean medienImBestand(List<Medium> medien)
    {
        boolean result = true;
        for (Medium medium : medien)
        {
            if (!mediumImBestand(medium))
            {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Sollte die verleihkarten fuer kunden abrufen
     * Liefert aber nur eine neue liste mit variable VERLEIHKARTE
     */
    @Override
    public List<Verleihkarte> getVerleihkartenFuer(Kunde kunde)
    {
        List<Verleihkarte> result = new ArrayList<Verleihkarte>();
        result.add(VERLEIHKARTE);
        return result;
    }

    /** 
     * Sollte ueberpruefen ob verleihen moeglich ist
     * Returned immer false
     */
    @Override
    public boolean istVerleihenMoeglich(Kunde kunde, List<Medium> medien)
    {
        return false;
    }
}
