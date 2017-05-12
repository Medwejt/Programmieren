/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.KannonenKugel;
import Model.Koordinaten;
import Model.Kuh;
import Controller.SpieleKonsole;
import Model.SpieleObjekte;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Marvin
 */
public class SpieleFenster extends Application
{
    Group root = new Group();
    @Override
    public void start(Stage primaryStage)
    {
        /*      KannonenKugel kugel = new KannonenKugel(new Koordinaten(300,30),100.0,200.0,5.0,5);
        Kuh kuh = new Kuh(new Koordinaten(400,200),10.0,5.0,5,5.0,8.0);*/
        
       
        
        Scene scene = new Scene(root, 800, 800);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    public void repainting(SpieleObjekte objekt)
    {
      root.getChildren().addAll(objekt);
      
      
    }
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

}
