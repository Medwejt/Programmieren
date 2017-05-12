package Model;


/**
 * Der Elefant ist einer unserer Wildtiere, das in unsere Spielewelt umher zieht
 * und Co2 produziert.
 *
 * @author rukuma,Marvin
 */
public class Elefant extends SpieleObjekte implements Verschmutzer
{
   
    /**
     * Konstruktor der Klasse Elefant. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition
     * @param breite
     * @param hoehe
     * @param leben
     * @param wachstumAusstoss
     * @param startAusstoss
     * @param geschwindigkeit
     */
    public Elefant ( Koordinaten objektPosition , double breite , double hoehe, int leben, double wachstumAusstoss,double startAusstoss, double geschwindigkeit)
        {
        super ( objektPosition , breite , hoehe, leben, wachstumAusstoss,startAusstoss, geschwindigkeit, "Elefant" );
        }

    @Override
    protected void objektZeichnen ()
        {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
        }


    @Override
    public void co2Produzieren()
    {
           setGesamtEmission(getGesamtEmission()+this.getAusstoss());    
      
    }

    /**
     *Methode, die die Eigenschaften des erstellten Objektes auf der Konsole ausgibt.
    */
 
}
