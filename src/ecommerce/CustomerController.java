/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXDrawersStack;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
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
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

//Image file chooser import:

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;


/**
 * FXML Controller class
 *
 * @author DCL
 */



    
public class CustomerController implements Initializable {
    
      @FXML
    private JFXButton message;
      
      @FXML
    void messaging(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bot.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
        

    }
    
     @FXML
    private Label label_click;
    
      @FXML
    private JFXButton all_productid;
    
    @FXML
    void all_product(ActionEvent event) {

    }
    
    
    
    

  int totPrice=0;
    
    @FXML
    private Label totalPriceLbl;
    
    
    

    /**
     * Initializes the controller class.
     */
     Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        ResultSet rs4 = null;
         ResultSet rsphoto =null;
        String user = "root";
        String pass = "12345";
    
     @FXML
    public  Label img1Name;
       @FXML
    private Label img1Model;

    @FXML
    private Label img1Price;

    @FXML
    private Label img2Name;

    @FXML
    private Label img2Model;

    @FXML
    private Label img2Price;

    @FXML
    private Label img3Name;

    @FXML
    private Label img3Model;

    @FXML
    private Label img4Name;

    @FXML
    private Label img4Model;

    @FXML
    private Label img3Price;

    @FXML
    private Label img4Price;
     
     
     
     
     
     
      
      @FXML
    public ImageView img1;

    @FXML
    private ImageView img3;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img4;
    
    @FXML
    public Label fname;

    @FXML
    public Label city;

    @FXML
    public Label lname;
    
       @FXML
    private Label cartcount;
           @FXML
    private JFXDrawer drawer;
    @FXML
    private JFXButton buyBtn;
      
        @FXML
    private Button logout;
        @FXML
    private AnchorPane anchorpane;
   
  
    @FXML
    private JFXHamburger hamburger;
     @FXML
    private JFXButton add1;

    @FXML
    private JFXButton add2;

    @FXML
    private JFXButton add3;

    @FXML
    private JFXButton add4;
    
        @FXML
    private VBox vbx;
    
         @FXML
    private JFXButton electronic;
         
             @FXML
    private TextField searchBar;
               @FXML
    private JFXButton search;
      public String sch;
         
      
         @FXML
    private Pane pan3;
  @FXML
    private Pane pan2;
    @FXML
    private Pane pan4;
        @FXML
    private ImageView dolr2;
         @FXML
    private ImageView dolr3;

    @FXML
    private ImageView dolr4; 
      
     @FXML
    private JFXButton showItem;

    @FXML
    private JFXButton history;

    @FXML
    private JFXButton help;
    @FXML
    void historing(ActionEvent event) {

    }
        @FXML
    void showingItems(ActionEvent event) throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("showsItems.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.setTitle("Items");
stage.initStyle(StageStyle.UTILITY);
stage.show();


    }
      @FXML
    void helping(ActionEvent event) throws IOException {

        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("help.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setScene(new Scene(root1));  
stage.show();

        
        
    }
    
    @FXML
    private JFXButton propic;
     @FXML
    void addingProPic(ActionEvent event) {
        
          
         FileChooser fileChooser = new FileChooser();
              
            //Set extension filter
            FileChooser.ExtensionFilter extFilterJPG = 
                    new FileChooser.ExtensionFilter("JPG files (*.JPG)", "*.JPG");
            FileChooser.ExtensionFilter extFilterjpg = 
                    new FileChooser.ExtensionFilter("jpg files (*.jpg)", "*.jpg");
            FileChooser.ExtensionFilter extFilterPNG = 
                    new FileChooser.ExtensionFilter("PNG files (*.PNG)", "*.PNG");
            FileChooser.ExtensionFilter extFilterpng = 
                    new FileChooser.ExtensionFilter("png files (*.png)", "*.png");
            fileChooser.getExtensionFilters()
                    .addAll(extFilterJPG, extFilterjpg, extFilterPNG, extFilterpng);
 
            //Show open file dialog
            File file = fileChooser.showOpenDialog(null);
             
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                Image image = SwingFXUtils.toFXImage(bufferedImage, null);
              customerImg.setImage(image);
              proPicLbl.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        

    }
    
    
    
    
      
           @FXML
    void searching(ActionEvent event) {
        
        sch = searchBar.getText();
        
        if(sch.equals("")){
        System.out.println("nulll");
        
        }
        
        else{
            
        
        try {
            img2Name.setVisible(false);
           img2Model.setVisible(false);
           img2Price.setVisible(false);
           img2.setVisible(false);
           
           img3Name.setVisible(false);
           img3Model.setVisible(false);
           img3Price.setVisible(false);
           img3.setVisible(false);
           
           img4Name.setVisible(false);
           img4Model.setVisible(false);
           img4Price.setVisible(false);
           img4.setVisible(false);
           
            dolr2.setVisible(false);
            dolr3.setVisible(false);
            dolr4.setVisible(false);
             
             
             pan2.setVisible(false);
             pan3.setVisible(false);
             pan4.setVisible(false);
             
             add2.setVisible(false);
             add3.setVisible(false);
             add4.setVisible(false);
             
            
            // 1. Get a connection to database
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where prodName REGEXP '"+sch+"' ");
             while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }  } catch (Exception exc) {
            exc.printStackTrace();
            System.out.println("regexxxxp");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
            
         //else end
        
        }
       
    }

    
   void makeTrue(){
        img2Name.setVisible(true);
           img2Model.setVisible(true);
           img2Price.setVisible(true);
           img2.setVisible(true);
           
            img3Name.setVisible(true);
           img3Model.setVisible(true);
           img3Price.setVisible(true);
           img3.setVisible(true);
           
            img4Name.setVisible(true);
           img4Model.setVisible(true);
           img4Price.setVisible(true);
           img4.setVisible(true);
           
           dolr2.setVisible(true);
            dolr3.setVisible(true);
             dolr4.setVisible(true);
             
             
             pan2.setVisible(true);
             pan3.setVisible(true);
             pan4.setVisible(true);
             
             add2.setVisible(true);
              add3.setVisible(true);
               add4.setVisible(true);
       
   }    

    @FXML
    void electring(ActionEvent event) throws SQLException {
         makeTrue();
        
       try {
           
           
        
           
           
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where id=1 ");
            
          
            while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }
            
            
             rs2 = stmt.executeQuery("select * from product where id=2 ");
            
          
            while (rs2.next()) {
           
           img2Name.setText(rs2.getString("prodName"));
           img2Model.setText(rs2.getString("prodModel"));
           img2Price.setText(rs2.getString("prodPrice"));
           
             InputStream is = rs2.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs2.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img2.setImage(imge);
               
            }
            
            
            //3
             rs3 = stmt.executeQuery("select * from product where id=3 ");
            
          
            while (rs3.next()) {
            
           img3Name.setText(rs3.getString("prodName"));
           img3Model.setText(rs3.getString("prodModel"));
           img3Price.setText(rs3.getString("prodPrice"));
           
             InputStream is = rs3.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs3.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img3.setImage(imge);
               
            }
            
             //4
             rs4 = stmt.executeQuery("select * from product where id=4 ");
            
          
            while (rs4.next()) {
              
           img4Name.setText(rs4.getString("prodName"));
           img4Model.setText(rs4.getString("prodModel"));
           img4Price.setText(rs4.getString("prodPrice"));
           
             InputStream is = rs4.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs4.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img4.setImage(imge);
               
            }
            
     

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }
       
    
     @FXML
    private JFXButton muGames;
     
       @FXML
    void musiGaming(ActionEvent event) {
        
          makeTrue();
        
        try {
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where id=5 ");
            
          
            while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }
            
            
             rs2 = stmt.executeQuery("select * from product where id=6 ");
            
          
            while (rs2.next()) {
           
           img2Name.setText(rs2.getString("prodName"));
           img2Model.setText(rs2.getString("prodModel"));
           img2Price.setText(rs2.getString("prodPrice"));
           
             InputStream is = rs2.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs2.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img2.setImage(imge);
               
            }
            
            
            //7
             rs3 = stmt.executeQuery("select * from product where id=7 ");
            
          
            while (rs3.next()) {
            
           img3Name.setText(rs3.getString("prodName"));
           img3Model.setText(rs3.getString("prodModel"));
           img3Price.setText(rs3.getString("prodPrice"));
           
             InputStream is = rs3.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs3.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img3.setImage(imge);
               
            }
            
             //8
             rs4 = stmt.executeQuery("select * from product where id=8 ");
            
          
            while (rs4.next()) {
              
           img4Name.setText(rs4.getString("prodName"));
           img4Model.setText(rs4.getString("prodModel"));
           img4Price.setText(rs4.getString("prodPrice"));
           
             InputStream is = rs4.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs4.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img4.setImage(imge);
               
            }
            
     

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
       
        

    }
     
    
        @FXML
    private JFXButton mobiles;
    
        @FXML
    void mobiling(ActionEvent event) {
        
         makeTrue();
           
        
        try {
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where id=9 ");
            
          
            while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }
            
            
             rs2 = stmt.executeQuery("select * from product where id=10");
            
          
            while (rs2.next()) {
           
           img2Name.setText(rs2.getString("prodName"));
           img2Model.setText(rs2.getString("prodModel"));
           img2Price.setText(rs2.getString("prodPrice"));
           
             InputStream is = rs2.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs2.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img2.setImage(imge);
               
            }
            
            
            //7
             rs3 = stmt.executeQuery("select * from product where id=11 ");
            
          
            while (rs3.next()) {
            
           img3Name.setText(rs3.getString("prodName"));
           img3Model.setText(rs3.getString("prodModel"));
           img3Price.setText(rs3.getString("prodPrice"));
           
             InputStream is = rs3.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs3.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img3.setImage(imge);
               
            }
            
             //8
             rs4 = stmt.executeQuery("select * from product where id=12 ");
            
          
            while (rs4.next()) {
              
           img4Name.setText(rs4.getString("prodName"));
           img4Model.setText(rs4.getString("prodModel"));
           img4Price.setText(rs4.getString("prodPrice"));
           
             InputStream is = rs4.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs4.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img4.setImage(imge);
               
            }
            
     

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
     
         @FXML
    private JFXButton tv;
         
            @FXML
    void tving(ActionEvent event) {
        
         makeTrue();
         
         try {
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where id=13 ");
            
          
            while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }
            
            
             rs2 = stmt.executeQuery("select * from product where id=14");
            
          
            while (rs2.next()) {
           
           img2Name.setText(rs2.getString("prodName"));
           img2Model.setText(rs2.getString("prodModel"));
           img2Price.setText(rs2.getString("prodPrice"));
           
             InputStream is = rs2.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs2.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img2.setImage(imge);
               
            }
            
            
            //7
             rs3 = stmt.executeQuery("select * from product where id=15 ");
            
          
            while (rs3.next()) {
            
           img3Name.setText(rs3.getString("prodName"));
           img3Model.setText(rs3.getString("prodModel"));
           img3Price.setText(rs3.getString("prodPrice"));
           
             InputStream is = rs3.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs3.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img3.setImage(imge);
               
            }
            
             //8
             rs4 = stmt.executeQuery("select * from product where id=16 ");
            
          
            while (rs4.next()) {
              
           img4Name.setText(rs4.getString("prodName"));
           img4Model.setText(rs4.getString("prodModel"));
           img4Price.setText(rs4.getString("prodPrice"));
           
             InputStream is = rs4.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs4.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img4.setImage(imge);
               
            }
            
     

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        

    }
       
    public int count=0;
    public String cs;
    Double prc;
    
      @FXML
    void adding1(ActionEvent event) {
        
         count++;
         cs=Integer.toString(count);
         
          cartcount.setText(cs);
          
          
          String im1n= img1Name.getText();
          String im1p=img1Price.getText();
          System.out.println(im1p);
          
          //totPrice = totPrice+Integer.parseInt(im1p) ;
             System.out.println(totPrice);
           try
    {
      
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);
    
      

      // the mysql insert statement
      String query = " insert into selected (prodName,prodPrice)"
        + " values (?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, im1n);
      preparedStmt.setString (2, im1p);
      

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

    @FXML
    void adding2(ActionEvent event) {
        count++;
         cs=Integer.toString(count);
         
          cartcount.setText(cs);
          
          
            String im2n= img2Name.getText();
          String im2p=img2Price.getText();
          
          // totPrice = totPrice+Integer.parseInt(im2p) ;
            //   totalPriceLbl.setText(Integer.toString(totPrice));
           try
    {
      // create a mysql database connection
    //  String myDriver = "org.gjt.mm.mysql.Driver";
     // String myUrl = "jdbc:mysql://localhost/ecommerce";
    //  Class.forName(myDriver);
    //  Connection conn = DriverManager.getConnection(myUrl, "root", "12345");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);
    
      // create a sql date object so we can use it in our INSERT statement
     // Calendar calendar = Calendar.getInstance();
     // java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

      // the mysql insert statement
      String query = " insert into selected (prodName,prodPrice)"
        + " values (?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, im2n);
      preparedStmt.setString (2, im2p);
      
    //  totPrice=Integer.valueOf(im2p);
     // System.out.println(totPrice);

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

    @FXML
    void adding3(ActionEvent event) {
          count++;
           cs=Integer.toString(count);
         
          cartcount.setText(cs);
          
            String im3n= img3Name.getText();
          String im3p=img3Price.getText();
          
             // totPrice = totPrice+Integer.parseInt(im3p) ;
               //  totalPriceLbl.setText(Integer.toString(totPrice));
              
              
           try
    {
      // create a mysql database connection
    //  String myDriver = "org.gjt.mm.mysql.Driver";
     // String myUrl = "jdbc:mysql://localhost/ecommerce";
    //  Class.forName(myDriver);
    //  Connection conn = DriverManager.getConnection(myUrl, "root", "12345");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);
    
      // create a sql date object so we can use it in our INSERT statement
     // Calendar calendar = Calendar.getInstance();
     // java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

      // the mysql insert statement
      String query = " insert into selected (prodName,prodPrice)"
        + " values (?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, im3n);
      preparedStmt.setString (2, im3p);
      

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

    @FXML
    void adding4(ActionEvent event) {
              
        count++;
         cs=Integer.toString(count);
         
          cartcount.setText(cs);
          
            String im4n= img4Name.getText();
          String im4p=img4Price.getText();
         
           //   totPrice = totPrice+Integer.parseInt(im4p) ;
           //    totalPriceLbl.setText(Integer.toString(totPrice));
              
           try
    {
     
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);
    
   

      // the mysql insert statement
      String query = " insert into selected (prodName,prodPrice)"
        + " values (?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, im4n);
      preparedStmt.setString (2, im4p);
      

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
      
    
   @FXML
    private JFXButton ex;
     @FXML
    void exiting(ActionEvent event) {
        
        vbx.setVisible(false);

    }
   
    
    
    @FXML
    void logginout(ActionEvent event) throws IOException, Exception {
    
     Stage stage = new Stage();
     ECommerce ec=new ECommerce();
     ec.start(stage);
        
    }


    
    
    @FXML
    void buying(ActionEvent event) {
        
        
         try {
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("deliveryInfo.fxml"));
             Parent root1 = (Parent) fxmlLoader.load();
             Stage stage = new Stage();
             stage.setScene(new Scene(root1));
          //   stage.setMaximized(true);
            stage.initStyle(StageStyle.UTILITY);
             stage.show();
         } catch (IOException ex) {
             Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
         }

        
        

    }
    
    
        @FXML
    private JFXButton bikes;
           
    @FXML
    void biking(ActionEvent event) {
     
         
         makeTrue();
         
         try {
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where id=17 ");
            
          
            while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }
            
            
             rs2 = stmt.executeQuery("select * from product where id=18");
            
          
            while (rs2.next()) {
           
           img2Name.setText(rs2.getString("prodName"));
           img2Model.setText(rs2.getString("prodModel"));
           img2Price.setText(rs2.getString("prodPrice"));
           
             InputStream is = rs2.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs2.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img2.setImage(imge);
               
            }
            
            
            //7
             rs3 = stmt.executeQuery("select * from product where id=19 ");
            
          
            while (rs3.next()) {
            
           img3Name.setText(rs3.getString("prodName"));
           img3Model.setText(rs3.getString("prodModel"));
           img3Price.setText(rs3.getString("prodPrice"));
           
             InputStream is = rs3.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs3.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img3.setImage(imge);
               
            }
            
             //8
             rs4 = stmt.executeQuery("select * from product where id=20 ");
            
          
            while (rs4.next()) {
              
           img4Name.setText(rs4.getString("prodName"));
           img4Model.setText(rs4.getString("prodModel"));
           img4Price.setText(rs4.getString("prodPrice"));
           
             InputStream is = rs4.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs4.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img4.setImage(imge);
               
            }
            
     

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
       

    }
    
    
    
    
       @FXML
    private JFXButton beauty;
       
    @FXML
    void beauting(ActionEvent event) {
        
        
          makeTrue();
         
         try {
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where id=21 ");
            
          
            while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }
            
            
             rs2 = stmt.executeQuery("select * from product where id=22");
            
          
            while (rs2.next()) {
           
           img2Name.setText(rs2.getString("prodName"));
           img2Model.setText(rs2.getString("prodModel"));
           img2Price.setText(rs2.getString("prodPrice"));
           
             InputStream is = rs2.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs2.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img2.setImage(imge);
               
            }
            
            
            //7
             rs3 = stmt.executeQuery("select * from product where id=23 ");
            
          
            while (rs3.next()) {
            
           img3Name.setText(rs3.getString("prodName"));
           img3Model.setText(rs3.getString("prodModel"));
           img3Price.setText(rs3.getString("prodPrice"));
           
             InputStream is = rs3.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs3.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img3.setImage(imge);
               
            }
            
             //8
             rs4 = stmt.executeQuery("select * from product where id=24 ");
            
          
            while (rs4.next()) {
              
           img4Name.setText(rs4.getString("prodName"));
           img4Model.setText(rs4.getString("prodModel"));
           img4Price.setText(rs4.getString("prodPrice"));
           
             InputStream is = rs4.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs4.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img4.setImage(imge);
               
            }
            
     

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        

    }
    
    
    
    
    @FXML
    private JFXButton toys;
        @FXML
    void toying(ActionEvent event) {
        
        
          makeTrue();
         
         try {
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where id=25 ");
            
          
            while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }
            
            
             rs2 = stmt.executeQuery("select * from product where id=26");
            
          
            while (rs2.next()) {
           
           img2Name.setText(rs2.getString("prodName"));
           img2Model.setText(rs2.getString("prodModel"));
           img2Price.setText(rs2.getString("prodPrice"));
           
             InputStream is = rs2.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs2.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img2.setImage(imge);
               
            }
            
            
            //7
             rs3 = stmt.executeQuery("select * from product where id=27 ");
            
          
            while (rs3.next()) {
            
           img3Name.setText(rs3.getString("prodName"));
           img3Model.setText(rs3.getString("prodModel"));
           img3Price.setText(rs3.getString("prodPrice"));
           
             InputStream is = rs3.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs3.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img3.setImage(imge);
               
            }
            
             //8
             rs4 = stmt.executeQuery("select * from product where id=28 ");
            
          
            while (rs4.next()) {
              
           img4Name.setText(rs4.getString("prodName"));
           img4Model.setText(rs4.getString("prodModel"));
           img4Price.setText(rs4.getString("prodPrice"));
           
             InputStream is = rs4.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs4.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img4.setImage(imge);
               
            }
            
     

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        

    }
    
        @FXML
    private JFXButton garden;
        
            @FXML
    void gardening(ActionEvent event) {
        
         makeTrue();
         
         try {
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();

            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where id=29 ");
            
          
            while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }
            
            
             rs2 = stmt.executeQuery("select * from product where id=30");
            
          
            while (rs2.next()) {
           
           img2Name.setText(rs2.getString("prodName"));
           img2Model.setText(rs2.getString("prodModel"));
           img2Price.setText(rs2.getString("prodPrice"));
           
             InputStream is = rs2.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs2.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img2.setImage(imge);
               
            }
            
            
            //7
             rs3 = stmt.executeQuery("select * from product where id=31");
            
          
            while (rs3.next()) {
            
           img3Name.setText(rs3.getString("prodName"));
           img3Model.setText(rs3.getString("prodModel"));
           img3Price.setText(rs3.getString("prodPrice"));
           
             InputStream is = rs3.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs3.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img3.setImage(imge);
               
            }
            
             //8
             rs4 = stmt.executeQuery("select * from product where id=32 ");
            
          
            while (rs4.next()) {
              
           img4Name.setText(rs4.getString("prodName"));
           img4Model.setText(rs4.getString("prodModel"));
           img4Price.setText(rs4.getString("prodPrice"));
           
             InputStream is = rs4.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs4.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img4.setImage(imge);
               
            }
            
     

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        

    }
        
        
    
    @FXML
    void show(MouseEvent event) {
       
        vbx.setVisible(true);
        
    }
        @FXML
    private Label proPicLbl;
     @FXML
    public ImageView customerImg;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
     /*   InputStream is = rs.getBinaryStream("photo");
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("photo"));
               Image imge = new Image(input);
               customerImg.setImage(imge);
        
        */
        
        
        HomeController hc=new HomeController();
        String ss= hc.fn;
        fname.setText(ss);
        lname.setText(hc.ln);
        city.setText(hc.ct);
        int id=hc.custId;
        
      //  System.out.println(id);
        
        vbx.setVisible(false);
        
        
        
        try {
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();
            
            proPicLbl.setVisible(false);
              
            rsphoto = stmt.executeQuery("select photo from customer where id='"+id+"' ");     
            while (rsphoto.next()){
                InputStream is = rsphoto.getBinaryStream("photo");
             
    
             
               InputStream input = new ByteArrayInputStream(rsphoto.getBytes("photo"));
               Image imge = new Image(input);
               customerImg.setImage(imge);
                
            }}catch(Exception e){
                    
                 //  customerImg.setImage();
                proPicLbl.setVisible(true);
                    }
        
        
        
        //load event setting eletronic item as default
         try {
            // 1. Get a connection to database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();
            
            // 3. Execute SQL query
            rs = stmt.executeQuery("select * from product where id=1 ");
            
          //  rsphoto = stmt.executeQuery("select photo from customer where id='"+id+"' ");
            
            while (rs.next()) {
          
           img1Name.setText(rs.getString("prodName"));
           img1Model.setText(rs.getString("prodModel"));
           img1Price.setText(rs.getString("prodPrice"));
             InputStream is = rs.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img1.setImage(imge);
               
            }
          
            
             rs2 = stmt.executeQuery("select * from product where id=2 ");
            
          
            while (rs2.next()) {
           
           img2Name.setText(rs2.getString("prodName"));
           img2Model.setText(rs2.getString("prodModel"));
           img2Price.setText(rs2.getString("prodPrice"));
           
             InputStream is = rs2.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs2.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img2.setImage(imge);
               
            }
            
            
            //3
             rs3 = stmt.executeQuery("select * from product where id=3 ");
            
          
            while (rs3.next()) {
            
           img3Name.setText(rs3.getString("prodName"));
           img3Model.setText(rs3.getString("prodModel"));
           img3Price.setText(rs3.getString("prodPrice"));
           
             InputStream is = rs3.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs3.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img3.setImage(imge);
               
            }
            
             //4
             rs4 = stmt.executeQuery("select * from product where id=4 ");
            
          
            while (rs4.next()) {
              
           img4Name.setText(rs4.getString("prodName"));
           img4Model.setText(rs4.getString("prodModel"));
           img4Price.setText(rs4.getString("prodPrice"));
           
             InputStream is = rs4.getBinaryStream("prodPhoto");
             
    
             
               InputStream input = new ByteArrayInputStream(rs4.getBytes("prodPhoto"));
               Image imge = new Image(input);
               img4.setImage(imge);
               
            }
            
     

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("in product table");
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    } 
      
}
