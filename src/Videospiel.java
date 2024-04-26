public class Videospiel implements Medium {

    /**
     * Das System
     */
    private final String _system;
    /**
     * Das Kommentar
     */
    private final String _kommentar;
    /**
     * Der Bezeichner
     */
    private final String _bezeichnung;
    /**
     * Titel
     */
    private final String _titel;

    /**
     * Initialisiert ein neues Exemplar.
     *
     * @param titel Der Titel der Videospiel
     * @param system Das System des Videospiel
     * @param bezeichnung Die Bezeichnung des Videospiel
     * @param kommentar Ein Kommentar zu der Videospiel
     *
     * @require titel != null
     * @require kommentar != null
     * @require interpret != null
     * @require system != null
     *
     * @ensure {@link #getTitel()} == titel
     * @ensure {@link #getKommentar()} == kommentar
     * @ensure {@link #getSystem()} == system
     * @ensure {@link #getMedienBezeichnung()} == bezeichnung
     */
    public Videospiel(String titel, String system, String bezeichnung, String kommentar) {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert bezeichnung != null : "Vorbedingung verletzt: bezeichnung != null";
        assert system != null : "Vorbedingung verletzt: system != null";
        _system = system;
        _titel = titel;
        _kommentar = kommentar;
        _bezeichnung = bezeichnung;
    }

    /**
     * Initialisiert ein neues Exemplar.
     *
     * @param titel Der Titel der Videospiel
     * @param system Das System des Videospiel
     * @param kommentar Ein Kommentar zu der Videospiel
     *
     * @require titel != null
     * @require kommentar != null
     * @require bezeichnung != null
     * @require system != null
     *
     * @ensure {@link #getTitel()} == titel
     * @ensure {@link #getKommentar()} == kommentar
     * @ensure {@link #getSystem()} == system
     * @ensure {@link #getMedienBezeichnung()} == bezeichnung
     */
    public Videospiel(String titel, String kommentar, String system) {
        this(titel, system, "Videospiel", kommentar);
    }

    @Override
    public String getKommentar() {
        return _kommentar;
    }

    @Override
    public String getMedienBezeichnung() {
        return _bezeichnung;
    }

    @Override
    public String getTitel() {
        return _titel;
    }

    /**
     * Get System
     *
     * @return String System
     *
     * @ensure _system != null
     */
    public String getSystem() {
        return _system;
    }

    @Override
    public String getFormatiertenString() {
        return String.format("Videospiel:\n    Titel: %1$s\n    System: %2$s\n    Kommentar: %3$s\n    Bezeichnung %4$s"
                , _titel, _system, _kommentar, _bezeichnung);
    }
}
