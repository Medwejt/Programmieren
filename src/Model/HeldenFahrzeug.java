package Model;

/**
 * Das Heldenfahrzeug wird vom Spieler gesteuert um die Umwelt zu retten.
 *
 * @author rukuma,Marvin
 */
public class HeldenFahrzeug extends SpieleObjekte
{

    /**
     * Konstrukter der Klasse HeldenFahrzeug. Es wird einer der Konstruktoren
     * der Superklasse "SpieleObjekte" benutzt.
     *
     * @param objektPosition
     * @param breite
     * @param hoehe
     * @param leben
     * @param wachstum
     * @param geschwindigkeit
     */
    public HeldenFahrzeug(Koordinaten objektPosition, double breite, double hoehe, double geschwindigkeit)
    {
        super(objektPosition, breite, hoehe, "Heldenfahrzeug");
        this.setGeschwindigkeit(geschwindigkeit);
        this.setBewegungsWinkel(Math.toRadians(90));
        this.setIstToetbar(false);
    }

    /**
     * Methode um dem Spieler das Schiessen zu ermoeglichen
     *
     * @return
     */
    public KannonenKugel schiessen()
    {
        double missileSize = getBreite() * 0.12;
        double missileAngle = getBewegungsWinkel();
        Koordinaten missileDirection = SpieleObjekte.karthesischesKooardinatensystem(missileAngle);
        // Die beiden -3.0 durch Kannonenrohrlaenge und derzeitge Richtung ersetzten.
        Koordinaten missileStartPosition = new Koordinaten(this.getKoordX() + 30.0, this.getKoordY() + 30.0);

        System.out.println("Kugel auf Position: X " + (this.getKoordX() + 30.0) + " und Y " + (this.getKoordY() + 30.0 + " abgeschossen!"));

        KannonenKugel kugel = new KannonenKugel(missileStartPosition, missileSize, missileAngle, 1.0, 10);
        return kugel;
    }

    @Override
    protected void objektZeichnen()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //methode Schießen hinzufuegen.
}
