/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Die Kannonenkugel des Spielers um Verschmutzer in Baeume zu verwandeln.
 * @author Marvin
 */
public class KannonenKugel extends SpieleObjekte 
{    
    
    private int reichweite ;
    
    /**
     * Konstruktor der Klasse KannonenKugel. Es wird einer der Konstruktoren der Superklasse "SpieleObjekte"
     * benutzt.
     * @param position
     * @param groesse
     * @param bewegungsWinkel
     * @param geschwindigkeit
     * @param reichweite
     */
    public KannonenKugel (Koordinaten position, double groesse, double bewegungsWinkel, double geschwindigkeit, int reichweite) 
    {
        super(position, groesse, groesse/3, "Kugel");
        
        this.reichweite = reichweite;
        this.setBewegungsWinkel(bewegungsWinkel);
        this.setGeschwindigkeit(geschwindigkeit);
    }

//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    /**
     * Getter um die derzeitige Reichweite der Kugel zu holen.
     * @return
     */
    public int getReichweite() {
        return reichweite;
    }
    
    /**
     * Setter um die derzeitige Reichweite der Kugel zu holen.
     * @param range
     */
    public void setReichweite(int range) {
        this.reichweite = range;
    }
//</editor-fold>
    
    @Override
    public void bewegungAusfuehren() 
    {
        if (reichweite > 0) 
        {
            super.bewegungAusfuehren();
        }
        reichweite--;
    }
    public void verwandeln()
    {
        //hier soll der Verschmutzer zum Baum verwandelt werden;
    }

    @Override
    protected void objektZeichnen()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
