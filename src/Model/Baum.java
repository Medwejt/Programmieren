package Model;

/**
 * Das Objekt Baum, was aus dieser Klasse erzeugt wird, wird in unserem Spiel 
 * dafuer zustaendig sein den gesamten Emissionwert
 * zu verringern, natuerlich nur solange er nicht brennt.
 * @author rukuma, Marvin
 */
public class Baum extends SpieleObjekte implements Reiniger , Verschmutzer 
{




    /**
     * Konstruktor der Klasse Baum. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param objektPosition
     * @param breite
     * @param hoehe
     * @param leben
     * @param wachstumAusstoss
     * @param startAusstoss
     * @param "0" ist die geschwindigkeit
     */
    public Baum ( Koordinaten objektPosition , double breite , double hoehe, int leben, double wachstumAusstoss, double startAusstoss)
        {
        super ( objektPosition , breite , hoehe, leben, wachstumAusstoss,startAusstoss , 0, "Baum");
        this.setBaum(true);
        }
    

    @Override
    public void co2Reduzieren()
    {
        //Austoss wird beim Wechsel von Brennen von "TRUE" auf "FALSE" wieder auf 0 gesetzt.
         setGesamtEmission(getGesamtEmission()-this.getAusstoss());             
    }
    @Override
    public void co2Produzieren()
    {
        //Austoss wird beim Wechsel von Brennen von "FALSE" auf "TRUE" wieder auf 0 gesetzt.
         setGesamtEmission(getGesamtEmission()+this.getAusstoss());    
    }
    
    /**
     * Diese Methode ueberprueft, ob der Baum brennt, und wird anschliessend die 
     * richtige Methode zum Produzieren oder Reduzieren ausfuehren.
     */
    public void produzieren()
    {
      if(this.isBrennt() == true)
      {
         this.co2Produzieren();
      }
      else if(this.isBrennt() == false)
      {
         this.co2Reduzieren(); 
      }   
    }
    
    @Override
    protected void objektZeichnen ()
        {
        throw new UnsupportedOperationException ( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
        }
    /**
     *Methode, die die Eigenschaften des erstellten Objektes auf der Konsole ausgibt.
     */



    

}
