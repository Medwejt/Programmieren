
package Model;

/**
 * Dieses Interface wird den Reinigern die Methode zum Co2 reduzieren geben.
 * @author rukuma
 */
public interface Reiniger
{
     
    /**
     * Eigenschaft um als Ziel vom GrimReaper erkannt zu werden.
     */
    public static final boolean reiniger = true ;     

    /**
     *   
     *  Diese abstrakte Methode wird dafür zustaendig sein
     * Co2 zu reduzieren.
     *
    */
    public abstract void co2Reduzieren ();

}
