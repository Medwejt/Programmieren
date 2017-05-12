/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * "SpieleObjekte" ist die Oberklasse für alle Objekte, die fuer das Spiel
 * benoetigt werden.
 * @author Marvin
 */
public abstract class SpieleObjekte extends Rectangle
{

//<editor-fold defaultstate="collapsed" desc="Eigenschaften">
    
    private static double gesamtEmission =0;
    
    private double koordX;
    
    private double koordY;
    
    private final String name;
    
    private boolean baum = false; // versuchen zu Baum zu verschieben.
    
    private boolean brennt = false;// versuchen zu Baum zu verschieben.
    
    private Koordinaten objektPosition;
    
    private double breite;
    
    private double hoehe;
    
    private double bewegungsWinkel;
    
    private double geschwindigkeit;
    
    private double ausstoss =0; //Emissionsausstoss, der von Objekten produziert wird.
    
    private int maxLeben=1;
    
    private int derzeitigesLeben;
    
    private boolean istToetbar=true;
    
    private double wachstumAusstoss = 0;

//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Konstruktor">
    /**
     * Konstruktor fuer die Kannonenkugel
     * @param objektPosition ist die derzeitige Position der Objektes
     * @param hoehe ist die Hoehe des Objektes
     * @param breite ist die Breite des Objektes
     * @param name ist der Name des erstellten Objektes
     */
    public SpieleObjekte(Koordinaten objektPosition, double breite, double hoehe,String name)
    {
        super(objektPosition.getX(),objektPosition.getY(),breite,hoehe);
        this.objektPosition = objektPosition;
        this.breite = breite;
        this.hoehe = hoehe;
        bewegungsWinkel = 90;
        geschwindigkeit = 1;
        this.name = name;
        this.koordX = objektPosition.getX();
        this.koordY = objektPosition.getY();
        this.derzeitigesLeben = this.maxLeben;
    }
    
    /**
     * Konstruktor fuer die meisten Objekte die durch die Unterklassen erzeugt werden
     * @param objektPosition ist die derzeitige Position der Objektes
     * @param breite    ist die Breite des Objektes
     * @param hoehe     ist die Hoehe des Objektes
     * @param leben     ist das Leben der Objekte
     * @param wachstumAusstoss  ist das Wachstum der Emission die ueber die Zeit Steigt
     * @param startAusstoss ist der Start wert des Ausstosses     * 
     * @param geschwindigkeit   ist die Geschwindigkeit der Objekte
     * @param name  ist der Name des erstellten Objektes
     */
    public SpieleObjekte ( Koordinaten objektPosition , double breite , double hoehe, int leben, double wachstumAusstoss, double startAusstoss, double geschwindigkeit, String name )
    {
        super(objektPosition.getX(),objektPosition.getY(),breite,hoehe);
        this.objektPosition = objektPosition;
        this.breite = breite;
        this.hoehe = hoehe;
        this.maxLeben = leben;
        this.derzeitigesLeben = this.maxLeben;
        bewegungsWinkel = 90; 
        this.geschwindigkeit =  geschwindigkeit;
        this.wachstumAusstoss = wachstumAusstoss;
        this.ausstoss = startAusstoss;
        this.name = name;
        this.koordX = objektPosition.getX();
        this.koordY = objektPosition.getY();
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    
    public boolean isBrennt()
    {
        return brennt;
    }
    
    public void setBrennt(boolean brennt)
    {
        this.brennt = brennt;
    }
    
    public String getName()
    {
        return name;
    }
    public boolean isIstToetbar()
    {
        return istToetbar;
    }

    public void setIstToetbar(boolean istToetbar)
    {
        this.istToetbar = istToetbar;
    }


    public boolean isBaum()
    {
        return baum;
    }

    public void setBaum(boolean baum)
    {
        this.baum = baum;
    }
    public double getWachstumAusstoss()
    {
        return wachstumAusstoss;
    }
    
    
    public int getMaxLeben()
    {
        return maxLeben;
    }
    
    
    public void setMaxLeben(int maxLeben)
    {
        this.maxLeben = maxLeben;
    }
    
    public int getDerzeitigesLeben()
    {
        return derzeitigesLeben;
    }
    
    
    public void setDerzeitigesLeben(int derzeitigesLeben)
    {
        this.derzeitigesLeben = derzeitigesLeben;
    }
    
    
    public void setAusstoss ( double ausstoss )
    {
        this.ausstoss = ausstoss;
    }
     
    
    public double getAusstoss ()
    {
        return ausstoss;
    }
    
    
    public Koordinaten getObjektPosition ()
    {
        return objektPosition;
    }
    
    
    public void setObjektPosition ( Koordinaten objektPosition )
    {
        this.objektPosition = objektPosition;
    }
    
    
    public double getBreite ()
    {
        return breite;
    }
    
    
    public void setBreite ( double breite )
    {
        this.breite = breite;
    }
    
    
    public double getHoehe ()
    {
        return hoehe;
    }
    
    
    public void setHoehe ( double hoehe )
    {
        this.hoehe = hoehe;
    }
    
    
    public double getBewegungsWinkel ()
    {
        return bewegungsWinkel;
    }
    
    
    public void setBewegungsWinkel ( double bewegungsWinkel )
    {
        this.bewegungsWinkel = bewegungsWinkel;
    }
    
    
    public double getGeschwindigkeit ()
    {
        return geschwindigkeit;
    }
    
    
    public void setGeschwindigkeit ( double geschwindigkeit )
    {
        this.geschwindigkeit = geschwindigkeit;
    }

    public double getKoordX()
    {
        return koordX;
    }

    public void setKoordX(double koordX)
    {
        this.koordX = koordX;
    }

    public double getKoordY()
    {
        return koordY;
    }

    public void setKoordY(double koordY)
    {
        this.koordY = koordY;
    }

    public static double getGesamtEmission()
    {
        return gesamtEmission;
    }

    public static void setGesamtEmission(double gesamtEmission)
    {
        SpieleObjekte.gesamtEmission = gesamtEmission;
    }


    
//</editor-fold>   

//<editor-fold defaultstate="collapsed" desc="Methoden">
    /**
     *Teil der Kollisionsabfrage, die kontrolliert, ob sich etwas links vom Objekt befindet.
     * @param that
     * @return
     */
    public boolean istLinksDavon ( SpieleObjekte that )
    {
        return this.getObjektPosition ().getX () + this.getBreite () < that.getObjektPosition ().getX ();
    }
    
    /**
     *Teil der Kollisionsabfrage die Kontrolliert ob etwas ueber dem Objekt ist.
     * @param that
     * @return
     */
    public boolean istDrueber ( SpieleObjekte that )
    {
        return this.getObjektPosition ().getY () + this.getHoehe () < that.getObjektPosition ().getY ();
    }
    
    /**
     *Komplette Kollisionsabfrage, die kontrolliert, ob das Objekt links von etwas ist
     *oder etwas links vom Objekt ist. Dasselbe wird noch einmal fuer Drueber und Drunter
     *ueberprueft.
     * @param that
     * @return
     */
    public boolean beruehrt ( SpieleObjekte that )
    {
        if ( this.istLinksDavon ( that ) )
        {
            return false;
        }
        if ( that.istLinksDavon ( this ) )
        {
            return false;
        }
        if ( this.istDrueber ( that ) )
        {
            return false;
        }
        if ( that.istDrueber ( this ) )
        {
            return false;
        }
        
        return true;
    }
    
    /**
     *Umwandlung des Winkels ins karthesische System
     * @param winkel
     * @return
     */
    public static Koordinaten karthesischesKooardinatensystem ( double winkel )
    {
        
        // X-Achse zeigt nach Osten, Y-Achse zeigt nach Sueden beim Zeichnen
        double x = Math.cos ( winkel );
        double y = Math.sin ( winkel );
        
        return new Koordinaten ( x , y );
    }
    
    /**
     *Die Allgemeine Bewegungsmethode fuer alle Objekte
     */
    public void spieleObjekteBewegen ()
    {
        Koordinaten richtung = karthesischesKooardinatensystem ( bewegungsWinkel );
        
        objektPosition.setX ( objektPosition.getX () + richtung.getX ()*  geschwindigkeit );
        objektPosition.setY ( objektPosition.getY () + richtung.getY () *  geschwindigkeit );
        this.koordX=objektPosition.getX();
        this.koordY=objektPosition.getY();
    }
    
    /**
     *Diese Methode ruft die Bewegungsmethode auf und fuehrt sie anschließend durch
     */
    public void bewegungAusfuehren()
    {
        spieleObjekteBewegen ();
    }
    /**
     * Konsolenausgabe fuer die erstellten Instanzen.
     */
    public void beschreibeDich()
    {
        System.out.println("Hallo, mein Name ist: "+this.name+"." );
        System.out.println("Und das sind meine Daten:X "+this.koordX+" Y "+this.koordY);
        System.out.println("Meine Lebenspunkte: "+ this.derzeitigesLeben);
        System.out.println("Meine Breite: "+ this.breite);
        System.out.println("Meine Hoehe: "+ this.hoehe);
        System.out.println("Meine Geschwindigkeit: "+ this.geschwindigkeit);
        System.out.println("Meine Austossrate: "+ this.wachstumAusstoss);
    }
    
    /**
     *Temporaere Methode zum Zeichnen das Objekts auf die Spielflaeche.
     */
    protected abstract void objektZeichnen ();
//</editor-fold>

}
