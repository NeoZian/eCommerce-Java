/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class AdminController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
      @FXML
    private TableView<classOrder> tableOrder;

    @FXML
    private TableColumn<classOrder, String> orderName;

    @FXML
    private TableColumn<classOrder, String> orderNum;

    @FXML
    private TableColumn<classOrder, String> orderStreet;

    @FXML
    private TableColumn<classOrder, String> orderCity;

    @FXML
    private TableColumn<classOrder, String> orderCountry;

    @FXML
    private TableColumn<classOrder, Integer> orderId;

   
    @FXML
    private JFXButton customerad;

    @FXML
    private JFXButton delete;

    @FXML
    private JFXTextField ID;
     @FXML
    private JFXButton logout;
    
     @FXML
    void loggingOut(ActionEvent event) throws Exception {
        Stage stage = new Stage();


        ECommerce ec=new ECommerce();
        ec.start(stage);
        

    }


    @FXML
    void admcustomering(ActionEvent event) throws IOException {
              
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("adminCustomer.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show();
        
        
    }
    
      Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
     
        String user = "root";
        String pass = "12345";
     ObservableList<classOrder> observableList=FXCollections.observableArrayList();

    @FXML
    void orderDeleting(ActionEvent event) {
        
         /* String ii=ID.getText();
          int in=Integer.parseInt(ii);
        
         try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("DELETE from orderdetails WHERE id='"+in+"'   ");
             while (rs.next()) {
          
          
              observableList.remove(in);
            
               
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
                    Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
          */
        
        
        

    }

        @FXML
    private JFXButton prod;
        
            @FXML
    void producting(ActionEvent event) throws IOException {
        
        
FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("product.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show();

    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
  
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from orderdetails ");
             while (rs.next()) {
          
          
              observableList.add(new classOrder(rs.getString("Name"),rs.getString("contactNumber"),rs.getString("street"),rs.getString("city"),rs.getString("country"),rs.getInt("id") ));
             
               
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
                    Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
          
        
        
        
        
        
        
         orderName.setCellValueFactory(new PropertyValueFactory<>("name"));
        orderCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        orderNum.setCellValueFactory(new PropertyValueFactory<>("num"));
        orderStreet.setCellValueFactory(new PropertyValueFactory<>("street"));
        orderCountry.setCellValueFactory(new PropertyValueFactory<>("country"));
        orderId.setCellValueFactory(new PropertyValueFactory<>("id"));
       tableOrder.setItems(observableList);
        
    }    
     
     
     
     
     
     
     
        
    }    
    

