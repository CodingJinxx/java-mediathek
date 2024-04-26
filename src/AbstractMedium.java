public abstract class AbstractMedium implements Medium {


    /**
     * Der Titel des Mediums
     *
     */
    protected String _titel;

    /**
     * Ein Kommentar zum Medium
     */
    protected String _kommentar;

    public AbstractMedium(String titel, String kommentar) {
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
}
