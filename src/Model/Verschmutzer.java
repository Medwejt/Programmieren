
package Model;

/**
 * Ermoeglicht den Verschmutzern Co2 zu produzieren und dem Spieler sie zu Baeume
 * zu verwandeln.
 * @author rukuma
 */
public interface Verschmutzer
{
    
    /**
     * Eigenschaft, die das Verwandeln zu Baeumen ermoeglicht.
     */
    public static final boolean verschmutzer = true;    

    /**
     *   
     * Diese abstrakte Methode ist
     * fuer das Produzieren von Co2 zustaendig.
     
     */
    public abstract void co2Produzieren();
}
