/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class DeliveryInfoController implements Initializable {

    /**
     * Initializes the controller class.
     * 
     * 
     */
    
    Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
     
        String user = "root";
        String pass = "12345";
    
      @FXML
    private JFXTextField receiver;

    @FXML
    private JFXTimePicker time;

    @FXML
    private JFXDatePicker date;

    @FXML
    private JFXTextField contactnumber;

    @FXML
    private JFXTextField street;

    @FXML
    private JFXTextField city;

    @FXML
    private JFXTextField country;
    
    
     @FXML
    private JFXButton confirmBuy;
     
    @FXML
    private Label conlabel;

    
        @FXML
    private JFXButton goHome;
        
        
        
    @FXML
    void goHoming(ActionEvent event) throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("customer.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setMaximized(true);

stage.setScene(new Scene(root1));  
stage.show();

    }
    
    @FXML
    void confirming(ActionEvent event) {
        
        conlabel.setVisible(true);
        
            
           try
    {
     
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);
    
   

      // the mysql insert statement
      String query = " insert into orderdetails (Name,contactNumber,street,city,country)"
        + " values (?, ?,?,?,?)";
             
      // DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
      // TimeFormat time=new SimpleTimeFormat("hh-mm-ss");
      // String strDate = dateFormat.format(date);
    //  String strDate1 = dateFormat.format(time);
      
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, receiver.getText());
       preparedStmt.setString (2, contactnumber.getText());
        preparedStmt.setString (3, street.getText());
         preparedStmt.setString (4, city.getText());
          preparedStmt.setString (5, country.getText());
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

    }

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        conlabel.setVisible(false);
        
    }    
    
}
