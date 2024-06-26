/**
 * Interface für Beobachter, die sich für Änderungen eines ObservableService
 * interessieren.
 * 
 * @author SE2-Team
 * @version SoSe 2021
 */
interface ServiceObserver
{

    /**
     * Diese Operation wird aufgerufen, sobald sich an an dem beobachteten
     * Service etwas relevantes geändert hat.
     * 
     * Implementierende Klassen müssen in dieser Operation auf die Aenderung
     * reagieren.
     */
    void informiereUeberAenderung();
}
