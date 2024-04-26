
/**
 * Ein Medium definiert Eigenschaften, die alle Medien unserer Mediathek
 * gemeinsam haben. Der Titel eines Mediums dient als eindeutige Identifikation.
 * Ein Medium kann ausgeliehen und zurückgegeben werden.
 *
 * @author Jay, Sinan
 */
public abstract class AbstractMedium implements Medium {


    /**
     * Der Titel des Mediums
     *
     */
    private String _titel;

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    protected AbstractMedium(String titel, String kommentar) {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        this._titel = titel;
        this._kommentar = kommentar;
    }

    public String getFormatiertenString() {
        return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
                + "\n" + "    " + "Kommentar: " + _kommentar + "\n";
    }

    public String getKommentar() {
        return this._kommentar;
    }

    /**
     * Ändert den Kommentar
     *
     * @param kommentar Ein Kommentar zum Medium
     *
     * @require kommentar != null
     * @ensure getKommentar() == kommentar
     */
    public void setKommentar(String kommentar) {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        this._kommentar = kommentar;
    }

    public abstract String getMedienBezeichnung();

    public String getTitel() {
        return this._titel;
    }

    /**
     * Ändert den Titel
     *
     * @param titel Der Titel des Mediums
     *
     * @require titel != null
     * @ensure getTitel() == titel
     */
    public void setTitel(String titel) {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        this._titel = titel;
    }

    @Override
    public String toString()
    {
        return getFormatiertenString();
    }

    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage) {
        assert mietTage > 0 : "Vorbedingung verletzt: mietTage > 0";
        return new Geldbetrag(mietTage * 300);
    }
}
