public class Videospiel implements Medium {

    private final String _system;
    private final String _kommentar;
    private final String _bezeichnung;
    private final String _titel;

    public Videospiel(String titel, String system, String bezeichnung, String kommentar) {
        _system = system;
        _titel = titel;
        _kommentar = kommentar;
        _bezeichnung = bezeichnung;
    }

    public Videospiel(String titel, String kommentar, String system) {
        this(titel, system, "N/A", kommentar);
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

    public String getFormatiertenString() {
        return String.format("Titel: %1$s, System: %2$s, Kommentar: %3$s, Bezeichnung %4$s", _titel, _system, _kommentar, _bezeichnung);
    }
}
