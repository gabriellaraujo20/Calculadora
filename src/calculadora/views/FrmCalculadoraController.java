/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lucio
 */
public class FrmCalculadoraController extends Application {

    public FrmCalculadoraController() {
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("frmCalculadora.fxml"));
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
    
    public static void show(String [] args){
        launch(args);
    }
    
 
}
