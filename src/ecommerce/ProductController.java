/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import com.jfoenix.controls.JFXButton;
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
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class ProductController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
        @FXML
    private TableView<classprod> tableprod;

     @FXML
    private TableColumn<classprod, Integer> id;

    @FXML
    private TableColumn<classprod, String> category;

    @FXML
    private TableColumn<classprod, String> name;

    @FXML
    private TableColumn<classprod, String> model;

    @FXML
    private TableColumn<classprod, Double> price;
    
    Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
     
        String user = "root";
        String pass = "12345";
     ObservableList<classprod> observableList=FXCollections.observableArrayList();
    @FXML
    private JFXButton delete;

    @FXML
    void adding(ActionEvent event) {

    }

    @FXML
    void orderDeleting(ActionEvent event) {

    }

    @FXML
    void refreshing(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
          
         
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product");
             while (rs.next()) {
          
                 
              observableList.add(new classprod(rs.getInt("id"),rs.getString("prodCategory"),rs.getString("prodName"),rs.getString("prodModel"),rs.getDouble("prodPrice")));
            
                 
          
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
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
          
        
        
        
        
        
        
         id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        category.setCellValueFactory(new PropertyValueFactory<>("Category"));
        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        model.setCellValueFactory(new PropertyValueFactory<>("Model"));
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));
       // city.setCellValueFactory(new PropertyValueFactory<>("City"));
       tableprod.setItems(observableList);
        
    }    
     
        
        
        
        
        
        
        
        
        
    }    
    

