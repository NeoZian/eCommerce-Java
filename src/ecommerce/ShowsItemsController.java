/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

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
public class ShowsItemsController implements Initializable {

    /**
     * Initializes the controller class.
     */
     Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
     
        String user = "root";
        String pass = "12345";
     ObservableList<selectedItable> observableList=FXCollections.observableArrayList();
    
    
        @FXML
    private TableView<selectedItable> itemsTable;

    @FXML
    private TableColumn<selectedItable, String> prodTname;

    @FXML
    private TableColumn<selectedItable, Double> prodTprice;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
          
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from selected ");
             while (rs.next()) {
          
          
              observableList.add(new selectedItable(rs.getString("prodName"), rs.getDouble("prodPrice")));
             
               
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
                    Logger.getLogger(ShowsItemsController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ShowsItemsController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
          
        
        
        
        
        
        
         prodTname.setCellValueFactory(new PropertyValueFactory<>("name"));
        prodTprice.setCellValueFactory(new PropertyValueFactory<>("price"));
       itemsTable.setItems(observableList);
    }    
    
}
