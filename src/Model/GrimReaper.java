package Model;

/**
 * Der Hauptgegner des Spielers. Er wird die harte Arbeit des Spielers, Dinge in Baeume
 * zu verwandeln, erschweren, indem er diese abbrennt oder faellt.
 * @author rukuma,Marvin
 */
public class GrimReaper extends SpieleObjekte implements Verschmutzer
{
    Koordinaten ziel;
    private boolean zielAmLeben =false;
    private KannonenKugel verbrenner;
    /**
     *  Konstruktor der Klasse GrimReaper. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition
     * @param breite
     * @param hoehe
     * @param leben
     * @param wachstumAusstoss
     * @param startAusstoss
     * @param geschwindigkeit
        */
    public GrimReaper ( Koordinaten objektPosition , double breite , double hoehe, int leben, double wachstumAusstoss,double startAusstoss, double geschwindigkeit)
        {
        super ( objektPosition , breite , hoehe, leben, wachstumAusstoss,startAusstoss, geschwindigkeit, "Reaper" );

        }
    
    /**
     *Diese Methode wird ueberpruefen, ob sich Baeume in der Umgebung
      befinden und anschliessend dort hinfahren.
     * @param that
     */
    public void umgebungsCheck(Baum that)
    {
        /* wird implementiert sobald die Spieleflaeche da ist.

        */
        while(that.isIstToetbar())
        {
            if(that.isBaum() == true)
            {
               ziel = that.getObjektPosition();
               zielAmLeben = true;
               zielBewegen();
            }
        }
    }
    
    /**
     *Diese Methode macht, dass sich der GrimReaper sich zum Ziel hinbewegt.
     */
    public void zielBewegen()
    {
        if (zielAmLeben == false)
        {
            //"Random" bewegungen ausfuehren.
            super.bewegungAusfuehren();
        }else if(zielAmLeben == true)
        {
            //zum Ziel hinbewegen: wird implementiert wenn die Spieleflaeche da ist.
            verbrennen();
        }

    }
    
    /**
     *Die Waffe des GrimReapers um die Baeume zu vernichten. TMP
     * @return 
     */
    public KannonenKugel verbrennen()
    {
     double missileSize = getBreite()*0.12;
        double missileAngle = getBewegungsWinkel();
        Koordinaten missileDirection = SpieleObjekte.karthesischesKooardinatensystem(missileAngle);

    Koordinaten missileStartPosition = new Koordinaten(this.getKoordX()+2.0,this.getKoordY()+2.0);           

    KannonenKugel kugel = new KannonenKugel(missileStartPosition, missileSize, missileAngle, 1,1); 
    zielAmLeben=false;
    return kugel;

    }

    
    @Override
    public void co2Produzieren ()
        {
            setGesamtEmission(getGesamtEmission()+this.getAusstoss());    
        }
    
    @Override
    protected void objektZeichnen (  )
        {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
        }




}
        