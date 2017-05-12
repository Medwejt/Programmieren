package Model;

/**
 * Die Klasse Haus wird Objekte erzeugen, die ein Co2 Produzent sind,
 * sich aber nicht bewegen koennen.
 * @author rukuma,Marvin
 */
public class Haus extends SpieleObjekte implements Verschmutzer
{

    /**
     * Konstruktor der Klasse Haus. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition
     * @param breite
     * @param hoehe
     * @param leben
     * @param wachstumAusstoss
     * @param startAusstoss
     */
    public Haus( Koordinaten objektPosition , double breite , double hoehe, int leben, double wachstumAusstoss, double startAusstoss)
        {
        super ( objektPosition , breite , hoehe, leben, wachstumAusstoss,startAusstoss, 0, "Haus" );
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
