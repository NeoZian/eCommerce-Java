/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.controlsfx.control.Rating;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class MusicsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
      @FXML
    private Rating ratingheadphone;

    @FXML
    private Rating ratingalpine;

    @FXML
    private Label lblheadphone;

    @FXML
    private Label lblalpine;
    
     @FXML
    private Button musicDone;

    @FXML
    void musicDoning(ActionEvent event) {
        
        

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
         ratingheadphone.ratingProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newT) {
               
                
                
                lblheadphone.setText("Rating: "+ newT);
               //  num = newT;
                
                //System.out.println(num);
                
            }
            
            
        });
         
           ratingalpine.ratingProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newT2) {
               
                
                
                lblalpine.setText("Rating: "+ newT2);
               //  num = newT;
                
                //System.out.println(num);
                
            }
            
            
        });
         
         
        
    }    
    
}
