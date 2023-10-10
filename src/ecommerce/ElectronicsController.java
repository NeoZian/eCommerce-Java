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
public class ElectronicsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private Rating ratinglaptop;

    @FXML
    private Rating ratingnikon;

    @FXML
    private Label lbllaptop;

    @FXML
    private Label lblnikon;

    @FXML
    private Button electronicsDone;

    @FXML
    void electronicsDoning(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
             
        ratinglaptop.ratingProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newT) {
               
                
                
                lbllaptop.setText("Rating: "+ newT);
               //  num = newT;
                
                //System.out.println(num);
                
            }
            
            
        });
         
           ratingnikon.ratingProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newT2) {
               
                
                
                lblnikon.setText("Rating: "+ newT2);
               //  num = newT;
                
                //System.out.println(num);
                
            }
            
            
        });
         
         
        
        
        
    }    
    
        
        
        
       
    
}
