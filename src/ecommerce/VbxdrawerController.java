/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import com.jfoenix.controls.JFXButton;
import java.awt.HeadlessException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class VbxdrawerController  implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private JFXButton elecbtn;



     public int num=10;
     public String ss="go";
     CustomerController cc=new CustomerController();
    
 
  // System.out.println("Done");
   
  
   
       @FXML
    void testprint(ActionEvent event){
   
       
        System.out.println("ho");
  
     
   
   };
   
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    
   
   
  
    }    
    
}
