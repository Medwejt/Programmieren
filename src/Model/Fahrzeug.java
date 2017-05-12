package Model;

/**
 * Fahrzeug wird computergesteuerte Autos, die Co2 produzieren, erstellen.
 * @author rukuma,Marvin
 */
public class Fahrzeug extends SpieleObjekte implements Verschmutzer
{

    /**
     * Konstruktor der Klasse Fahrzeug. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition
     * @param breite
     * @param hoehe
     * @param leben
     * @param wachstumAusstoss
     * @param startAusstoss
     * @param geschwindigkeit
     */
    public Fahrzeug ( Koordinaten objektPosition , double breite , double hoehe, int leben, double wachstumAusstoss,double startAusstoss, double geschwindigkeit)
        {
        super ( objektPosition , breite , hoehe, leben, wachstumAusstoss,startAusstoss, geschwindigkeit, "Grim Reaper" );

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
