/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Marvin
 */
import Model.Baum;
import Model.Elefant;
import Model.GrimReaper;
import Model.Haus;
import Model.HeldenFahrzeug;
import Model.KannonenKugel;
import Model.Koordinaten;
import Model.Kuh;
import Model.SpieleObjekte;
import View.SpieleFenster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SpieleKonsole
{

    private List<KannonenKugel> kannonenKugel = new ArrayList<>();
    private List<SpieleObjekte> spieleObjekte = new LinkedList<>();
    private Baum baum;
    private HeldenFahrzeug test;
    private Kuh kuh;
    private Elefant elefant;
    private GrimReaper reaper;
    private Haus haus1;
    private Haus haus2;
    SpieleFenster fenster = new SpieleFenster();
    private boolean spielVorbei = false;

    public SpieleKonsole()
    {

        initSpiel();
        spielStarten();

    }

    public boolean isSpielVorbei()
    {
        return spielVorbei;
    }

    public void setSpielVorbei(boolean gameOver)
    {
        this.spielVorbei = gameOver;
    }

    private void initSpiel()
    {
        initSpielerAuto();
        spieleobjekteErstellen();
        test();
        //fenster.start();
    }

    private void spieleobjekteErstellen()
    {
        kuh = new Kuh(new Koordinaten(40, 40), 10.0, 5.0, 1, 5.0, 5.0, 8.0);
        elefant = new Elefant(new Koordinaten(7, 4), 10.0, 5.0, 5, 5.0, 5.0, 8.0);
        reaper = new GrimReaper(new Koordinaten(8, 10), 10.0, 5.0, 5, 5.0, 5.0, 8.0);
        haus1 = new Haus(new Koordinaten(2, 4), 1.0, 1.0, 1, 5.0, 5.0);

        spieleObjekte.add(test);
        spieleObjekte.add(kuh);
        spieleObjekte.add(elefant);
        spieleObjekte.add(reaper);
        spieleObjekte.add(haus1);

        kannonenKugel.add(test.schiessen());

        //spieleObjekte.get(0).beschreibeDich();
        //kannonenKugel.get(0).beschreibeDich();
        // hier werden wir später die Spielobjekte erzeugen
    }

    private void initSpielerAuto()
    {

        test = new HeldenFahrzeug(new Koordinaten(10, 10), 10.0, 5.0, 5.0);

    }

    private void spielStarten()
    {
    }

    public void spielPausieren()
    {
    }

    public void weiterspielen()
    {

    }

    public void neustartSpiel()
    {

        setSpielVorbei(false);
        spieleobjekteErstellen();
        spielStarten();
    }

    private void spielBeenden()
    {
        setSpielVorbei(true);
        spielPausieren();
    }

    private void doOnTick()
    {

        for (Iterator<KannonenKugel> itKugel = kannonenKugel.iterator(); itKugel.hasNext();)
        {
            KannonenKugel kugel = itKugel.next();
            boolean wurdeRemoved = false;
            kugel.bewegungAusfuehren();
            System.out.println(kugel.getName() + " X: " + kugel.getKoordX() + " " + "Y: " + kugel.getKoordY());
            if (kugel.getReichweite() <= 0)
            {
                itKugel.remove();
            }
            for (Iterator<SpieleObjekte> itObjekte = spieleObjekte.iterator(); itObjekte.hasNext();)
            {
                SpieleObjekte objekt = itObjekte.next();
                if (objekt.beruehrt(kugel) && kugel.getReichweite() > 1)
                {
                    if (objekt.isIstToetbar())
                    {
                        if (objekt.getDerzeitigesLeben() > 1)
                        {
                            System.out.println(objekt.getName() + " wurde Getroffen!!!!");
                            objekt.setDerzeitigesLeben(objekt.getDerzeitigesLeben() - 1);
                            kugel.setReichweite(0);
                        } else
                        {
                            System.out.println(objekt.getName() + " wurde Getoetet!!!!");
                            baum = new Baum(objekt.getObjektPosition(), 1.0, 1.0, 1, 5.0, 5.0);
                            itObjekte.remove();
                            wurdeRemoved = true;
                            objekt.setDerzeitigesLeben(0);
                            kugel.setReichweite(0);
                        }
                    } else
                    {
                        System.out.println(objekt.getName() + " never dies!");
                    }
                    itKugel.remove();
                }
            }
            if (wurdeRemoved)
            {
                spieleObjekte.add(baum);
                System.out.println("Ein Baum ist entstanden an X:" + spieleObjekte.get(spieleObjekte.lastIndexOf(baum)).getKoordX() + " Y:" + spieleObjekte.get(spieleObjekte.lastIndexOf(baum)).getKoordY());
            }
            for (Iterator<SpieleObjekte> itObjekte = spieleObjekte.iterator(); itObjekte.hasNext();)
            {
                SpieleObjekte objekt = itObjekte.next();

                for (Iterator<SpieleObjekte> itsObjekte = spieleObjekte.iterator(); itsObjekte.hasNext();)
                {
                    SpieleObjekte objekt1 = itsObjekte.next();
                    if (objekt1.equals(objekt))
                    {
                        if (itsObjekte.hasNext())
                        {
                            objekt1 = itsObjekte.next();
                        }
                    } else if (!objekt1.beruehrt(objekt))
                    {
                        if (!(objekt1.getGeschwindigkeit() == 0))
                        {
                            objekt1.bewegungAusfuehren();
                            System.out.println(objekt1.getName() + " bewegt nach " + "X: " + objekt1.getKoordX() + " " + "Y: " + objekt1.getKoordY());
                        } else
                        {
                            System.out.println(objekt1.getName() + " kann sich nicht bewegen.");
                        }
                    } else if (objekt1.beruehrt(objekt))
                    {
                        System.out.println(objekt1.getName() + " und " + objekt.getName() + " wuerden Kollidieren");
                    }
                }
            }
        }
    }

    private void test()
    {
        doOnTick();
        doOnTick();
    }

}
