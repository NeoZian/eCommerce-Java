/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class BeautyController implements Initializable {

    /**
     * Initializes the controller class.
     */

    
     Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
     
        String user = "root";
        String pass = "12345";
    
    
    
    @FXML
    private Rating ratingshirt;

    @FXML
    private Rating ratingrolex;

    @FXML
    private Label lblshirt;

    @FXML
    private Label lblrolex;

    @FXML
    private Button beautyDone;
    
    Number num=0;
  Number ss;

    @FXML
    void beautyDoning(ActionEvent event) throws SQLException {
        
      
      /*  
        try{
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);
    
   

      // the mysql insert statement
      String query = " insert into ratingproduct(rating) where id=5"
        + " values (?)";
             
      
      PreparedStatement preparedStmt = conn.prepareStatement(query);
           preparedStmt.setDouble(1, (double) ss);
      // preparedStmt.setString (2, Lname.getText());
        
        //   preparedStmt.setString (6, strDate);
          //  preparedStmt.setString (7, strDate);
   
             //  String toString = time.toString();

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
            
           
          */ 
        }
      
        
       

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
          
        ratingshirt.ratingProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newT) {
               
                
                
                lblshirt.setText("Rating: "+ newT);
                 ss=newT;
               //  num = newT;
               // num =  newT;
                //System.out.println(num);
                
            }
            
            
        });
         
           ratingrolex.ratingProperty().addListener(new ChangeListener<Number>(){

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newT2) {
               
                
                
                lblrolex.setText("Rating: "+ newT2);
               //  num = newT;
                
                //System.out.println(num);
                
            }
            
            
        });
         
         
        
        
        
    }    
    
}
