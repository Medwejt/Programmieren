/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Diese Klasse wird die Koordinaten der erstellten Objekte enthalten.
 * @author Marvin
 */
public class Koordinaten
{
    private double x;
    private double y;
    
    /**
     * Speicherung der derzeitigen Koordinaten.
     * @param x
     * @param y
     */
    public Koordinaten(double x, double y) {
        this.x = x;
        this.y = y;
    }             

//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
//</editor-fold>

    
}
