/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceeohh2.hellmain;
import Controller.SpieleKonsole;

/**
 * Main zum testen des Programmes.
 * @author Marvin
 */
public class CeeOhh2HellMain
{

    /**
     * @param args the command line arguments
     */
    public static void main ( String[] args )
    {
        consoleTest(); // test ob pull geht.
    }
    
    private static void consoleTest()
    {
        new SpieleKonsole();
        //new SpieleFenster();
        /* int eingabe=0;
        Koordinaten testInstanz = new Koordinaten(Math.random(),Math.random());
        Scanner scan = new Scanner(System.in);
        System.out.print("Was fuer ein Test Objekt wollen Sie erstellen: ");
        System.out.print("\n(1)Baum, (2)Elefant, (3)Fahrzeug, (4)GrimReaper,\n(5)Haus,  (6)HeldenFahrzeug, (7)Kuh\n");
        try
        {
        
        eingabe = scan.nextInt();
        
        } catch (java.util.InputMismatchException e)
        {
        System.out.print("Falsche Eingabe");
        scan.nextLine();
        }
        switch(eingabe)
        {
        case 1: Baum baum1 = new Baum(testInstanz,2,2,1,Math.random(),2);
        baum1.beschreibeDich();
        break;
        }*/
    }
}
