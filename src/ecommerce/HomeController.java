/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXToggleButton;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
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
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import org.controlsfx.control.Rating;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class HomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
       CustomerController cc=new CustomerController();
        static int custId;
    @FXML
     public static String fn;
     
    @FXML
     public static String ln;
     
   @FXML
    public static String ct;
    
    @FXML
    private AnchorPane rootPane;

    @FXML
    private ProgressIndicator progress;
    
    
    @FXML
    private JFXButton signup;
      
    @FXML
    private TextField mailh;

    @FXML
    private PasswordField passh;

    @FXML
    private JFXButton login;
   
     @FXML
    private JFXButton see;
    
         @FXML
    private JFXButton forgot;
         
        @FXML
    private Label passlbl;   
        
        
      

        
        
   
    @FXML
    void seeing(ActionEvent event) {
        
        String a=passh.getText();
              
       passlbl.setText(a);
       
       passlbl.setVisible(true);
       
     
    
    }
    
    
    //items are rated here
    
    @FXML
    void itemBikes(ActionEvent event) throws IOException {
        
   FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bikes.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
 stage.initStyle(StageStyle.UTILITY);
stage.setScene(new Scene(root1));  
stage.show();
       
     
    
    }
    
     @FXML
    void itemMusics(ActionEvent event) throws IOException {
        
   FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Musics.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
 stage.initStyle(StageStyle.UTILITY);
stage.setScene(new Scene(root1));  
stage.show();

        
        
       
     
    
    }
     @FXML
    void itemBeauty(ActionEvent event) throws IOException {
        
              
   FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("beauty.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
 stage.initStyle(StageStyle.UTILITY);
stage.setScene(new Scene(root1));  
stage.show();
       
       
     
    
    }
     @FXML
    void itemElectronics(ActionEvent event) throws IOException {
        
      
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("electronics.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
 stage.initStyle(StageStyle.UTILITY);
stage.setScene(new Scene(root1));  
stage.show();

     
    
    }
    
    
    
   
    
    @FXML
    void forgoting(ActionEvent event) throws IOException {
        
        
        
          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ForgotPass.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
         stage.initStyle(StageStyle.UTILITY);
        stage.setScene(new Scene(root1));  
        stage.show();       
        
        
        
    }
    @FXML
    public void Signing(ActionEvent event) throws IOException {
        
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
         Parent root1 = (Parent) fxmlLoader.load();
       
         Stage stage = new Stage();
         stage.setScene(new Scene(root1));
         stage.setTitle("SignUp Page");
         
        // stage.centerOnScreen();
       //  stage.initStyle(StageStyle.UTILITY);
        // stage.setFullScreen(true);
       //  stage.setMaximized(true);
         stage.show();
        

    }
    
   
   
      @FXML
    public void logging(ActionEvent event) throws SQLException {
          
            
       
      
        //Processing Icon Play()
        progress.setVisible(true);
          PauseTransition pt= new PauseTransition();
          pt.setDuration(Duration.seconds(3));
          pt.play();
          pt.setOnFinished(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent ev) {
                progress.setVisible(false);
                
                Connection con = null;
                PreparedStatement pst = null;
            //    PreparedStatement pst2 = null;
                Statement _deleteTableDtataStmt = null;
                ResultSet rs = null;
              //  ResultSet rs1=null;
                
                /* String _deleteTableData ="TRUNCATE TABLE selected";
                try {
                    _deleteTableDtataStmt.executeUpdate(_deleteTableData);
                } catch (SQLException ex) {
                    Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                
                if(mailh.getText().equals("admin")&& passh.getText().equals("111222")){
                    
                    ///loading admin


                          FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("admin.fxml"));
                           Parent roo = null;
                    try {
                        roo = (Parent) fxmlLoader.load();
                    } catch (IOException ex) {
                        Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                           Stage stage = new Stage();
                           stage.setMaximized(true);
                            stage.setScene(new Scene(roo));  
                             stage.show();

                    
                }
                  else{
                    
                
               // String _deleteTableData ="TRUNCATE TABLE selected";
                String sql="select * from customer where email=? and password=?" ;
               // String sql2="TRUNCATE TABLE selected";
                try{
                    con = DriverManager.getConnection("jdbc:mysql://localhost/ecommerce?autoReconnect=true&useSSL=false","root","12345");
                    pst=con.prepareStatement(sql);
                 //   pst2=con.prepareStatement(sql2);
                   //  _deleteTableDtataStmt.executeUpdate(_deleteTableData);
                    
                    pst.setString(1, mailh.getText());
                    pst.setString(2,passh.getText());
                    rs=pst.executeQuery();
                   // rs1=pst2.executeQuery();
                       Statement stmt = con.createStatement();

    // Use TRUNCATE
    String sql2 = "TRUNCATE selected";
    // Execute deletion
    stmt.executeUpdate(sql2);
 
                
                    
               
                    
                    if(rs.next())
                    {
//JOptionPane.showMessageDialog(null,"username and password matched");
                        
                        
                      //  int id=rs.getInt("id");
                      //  System.out.println("id="+id);
                      fn=rs.getString("firstName");
                      ln=rs.getString("lastName");
                      ct=rs.getString("city");
                      //   System.out.println("id="+id+" "+fn);
                         
                       //  setName(fn);
                       //  cc.initialize(null, null);
                   //   cc.fname.setText(nn);
                        //  cc.lname.setText(rs.getString("lastName"));
                           // cc.city.setText(rs.getString("city"));
                      
                      
                   //   customerImg;
                      
                       custId=rs.getInt("id");
                       System.out.println(custId);
                      
                        
                        Notifications.create()
                                .title("Notification")
                                .text("Successfully Logged in!").darkStyle().position(Pos.BOTTOM_CENTER)
                                .showWarning();
                        
                        
                        
                        
                        
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("customer.fxml"));
                        
                        
                        Parent root1 = null;
                        try {
                            root1 = (Parent) fxmlLoader.load();
                        } catch (IOException ex) {
                            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                       // stage.setMaximized(true);
                        stage.initStyle(StageStyle.UTILITY);
                        stage.show();
                        
                        
                        
                        
                        
                        
                        
                    }
                    else
                    {
//JOptionPane.showMessageDialog(null, "username and password do not matched");
//System.out.println("nooo");
                        Notifications.create()
                                .title("Notification")
                                .text("Invalid Email or Password!").darkStyle().position(Pos.TOP_RIGHT)
                                .showWarning();
                    }
                }
                catch (Exception exc) {
                    exc.printStackTrace();
                    
                    Notifications.create()
                            .title("Notification")
                            .text("Database is OFFLINE!").darkStyle().position(Pos.CENTER)
                            .showWarning();
                    
                    
                } finally {
                    if (rs != null) {
                        try {
                            rs.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    if (pst != null) {
                        try {
                            pst.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    if (con != null) {
                        try {
                            con.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }  
                
                }
            }
            
        });
          
           
         
      
        
    }
  /* public void setName(String name) {
       this.fn= name;
    }
   public String getName() {
        return fn;
    }*/
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
   
                progress.setVisible(false);
                passlbl.setVisible(false);
       
        
    }    
    
}
