/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class AdminCustomerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
   
    @FXML
    void adding(ActionEvent event) {
        
        /*   try
                {
     
        conn1= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);
    
   

      // the mysql insert statement
      String query= " insert into (firstName,lastName,email,password,city)"
        + " values (?, ?,?,?,?)";
             
      // DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
      // TimeFormat time=new SimpleTimeFormat("hh-mm-ss");
      // String strDate = dateFormat.format(date);
    //  String strDate1 = dateFormat.format(time);
      
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn1.prepareStatement(query);
      preparedStmt.setString (1, cfn.getText());
       preparedStmt.setString (2, cln.getText());
        preparedStmt.setString (3, cemail.getText());
         preparedStmt.setString (4, cpass.getText());
          preparedStmt.setString (5, ccity.getText());
        //   preparedStmt.setString (6, strDate);
          //  preparedStmt.setString (7, strDate);
   
             //  String toString = time.toString();

      // execute the preparedstatement
      preparedStmt.execute();
      
      conn1.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }

        
        
        */

    }

    
    
    @FXML
    private TableView<custclas> tableCustomer;

    @FXML
    private TableColumn<custclas, Integer> id;

    @FXML
    private TableColumn<custclas,String> fname;

    @FXML
    private TableColumn<custclas,String> lname;

    @FXML
    private TableColumn<custclas,String> mail;

    @FXML
    private TableColumn<custclas, String> pass;

    @FXML
    private TableColumn<custclas,String> city;

    
     Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
     
         
    Connection conn1 = null;
      Statement stmt1 = null;
       ResultSet rs1 = null;
        
      String user = "root";
        String passm = "12345";
         @FXML
    private JFXTextField cid;

    @FXML
    private JFXTextField cfn;

    @FXML
    private JFXTextField cln;

    @FXML
    private JFXTextField cemail;

    @FXML
    private JFXTextField cpass;

    @FXML
    private JFXTextField ccity;
        
        
     ObservableList<custclas> observableList=FXCollections.observableArrayList();
    
       @FXML
    private JFXButton delete;

    
    @FXML
    void orderDeleting(ActionEvent event) {

    }

    @FXML
    void refreshing(ActionEvent event) {
        
        
       // initialize(null, null);

    }

     
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
         
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, passm);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from customer");
             while (rs.next()) {
          
                 
              observableList.add(new custclas(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("email"),rs.getString("password"),rs.getString("city")));
            
                 
          
            }  } catch (Exception exc) {
            exc.printStackTrace();
            System.out.println("regexxxxp");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in selectedd table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AdminCustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AdminCustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
          
        
        
        
        
        
        
         id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        fname.setCellValueFactory(new PropertyValueFactory<>("Fname"));
        lname.setCellValueFactory(new PropertyValueFactory<>("Lname"));
        mail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        pass.setCellValueFactory(new PropertyValueFactory<>("Pass"));
        city.setCellValueFactory(new PropertyValueFactory<>("City"));
       tableCustomer.setItems(observableList);
        
    }    
     
        
        
   
        
        
        
    }    
    

