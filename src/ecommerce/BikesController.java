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
public class BikesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private Rating ratingiron;

    @FXML
    private Rating ratingpulsar;

    @FXML
    private Label lbliron;

    @FXML
    private Label lblpulsar;

    
    
     @FXML
    private Button bikesDone;

    @FXML
    void bikesDoning(ActionEvent event) {
        
          
         

    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        ratingiron.ratingProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newT) {
               
                
                
                lbliron.setText("Rating: "+ newT);
               //  num = newT;
                
                //System.out.println(num);
                
            }
            
            
        });
         
           ratingpulsar.ratingProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newT2) {
               
                
                
                lblpulsar.setText("Rating: "+ newT2);
               //  num = newT;
                
                //System.out.println(num);
                
            }
            
            
        });
         
         
        
        
    }    
    
}
