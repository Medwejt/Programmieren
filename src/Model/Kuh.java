package Model;

/**
 *
 * @author rukuma,Marvin
 */
public class Kuh extends SpieleObjekte implements Verschmutzer
{

    /**
     * Konstruktor der Klasse Kuh.
     * @param objektPosition
     * @param breite
     * @param hoehe
     * @param leben
     * @param wachstumAusstoss
     * @param startAusstoss
     * @param geschwindigkeit
     */
    public Kuh ( Koordinaten objektPosition , double breite , double hoehe, int leben, double wachstumAusstoss,double startAusstoss, double geschwindigkeit)
        {
        super ( objektPosition , breite , hoehe, leben, wachstumAusstoss,startAusstoss, geschwindigkeit, "Kuh" );
        }

    @Override
    protected void objektZeichnen (  )
        {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
        }

    @Override
    public void co2Produzieren ()
        {
          setGesamtEmission(getGesamtEmission()+this.getAusstoss());    
        }

}
