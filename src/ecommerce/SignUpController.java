/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXRadioButton;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.controlsfx.control.Notifications;

/**
 *
 * @author DCL
 */
public class SignUpController implements Initializable {
    
    
     
    Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
     
        String user = "root";
        String pass = "12345";
    
    
    
    
    @FXML
    private TextField Lname;

    @FXML
    private TextField Fname;

    @FXML
    private TextField Email;

    @FXML
    private TextField Password;

    @FXML
    private JFXRadioButton Gmale;

    @FXML
    private JFXRadioButton Gfemale;

    @FXML
    private JFXDatePicker Dob;

    @FXML
    private JFXButton VerEmailbtn;

    @FXML
    private Label Notice;
    
  
   
     @FXML
    private TextField city;

    @FXML
    private TextField country;

    @FXML
    private Label verLbl;

    @FXML
    private TextField verCode;

    @FXML
    private Button verDone;

    @FXML
    private Label sorryLbl;
static int codd;
   

    @FXML
    void verDoning(ActionEvent event) {
        
        String getstr=verCode.getText();
        
        int makeint=Integer.parseInt(getstr);
           
        if(makeint == codd){
             sorryLbl.setVisible(false);
             System.out.println(codd);
             congrast.setVisible(true);
           //  System.out.println(verCode.getText());
           try
    {
     
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);
    
   

      // the mysql insert statement
      String query = " insert into customer(firstName,lastName,email,password,city,country)"
        + " values (?, ?,?,?,?,?)";
             
      // DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
      // TimeFormat time=new SimpleTimeFormat("hh-mm-ss");
      // String strDate = dateFormat.format(date);
    //  String strDate1 = dateFormat.format(time);
      
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, Fname.getText());
       preparedStmt.setString (2, Lname.getText());
        preparedStmt.setString (3, Email.getText());
         preparedStmt.setString (4, Password.getText());
          preparedStmt.setString (5, city.getText());
           preparedStmt.setString (6, country.getText());
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
        else{
              System.out.println(codd);
             
            sorryLbl.setVisible(true);
             System.out.println(verCode.getText());
        }
        
    }

    
    
    @FXML
    void RunVerEmailbtn(ActionEvent event) {
       
        
          
        String cty=city.getText();
        String mail=Email.getText();
        String fn=Fname.getText();
        String pass=Password.getText();
        
        if(mail.equals("")||fn.equals("")||pass.equals("")||cty.equals("")){  //checking whether *fileds are filled or not
            
           Notifications.create()
           .title("Notifications")
            .text("PLEASE FILL ALL THE STAR SIGNED FIELDS").darkStyle().position(Pos.CENTER)
            .showWarning();
            
           
           Notice.setVisible(true);
        }
        else{
            
        
            
             verLbl.setVisible(true);
          // sorryLbl.setVisible(true);
              verCode.setVisible(true);
              verDone.setVisible(true);
            
            
            
            
             Random rnd =new Random();
        
        int code=rnd.nextInt(999999-100000)+100000;
        codd=code;
        
        final String username = "horizonbit11@gmail.com"; // enter your mail id
		final String password = "1234!@#$";// enter ur password

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {
                       
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("horizonbit11@gmail.com")); // same email id
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(mail));// whome u have to send mails that person id
			message.setSubject("Verification Number");
			message.setText("Your HorizonBit account verification code is:-"+code);

			Transport.send(message);
                        
                        
			//System.out.println("Done");

		} catch (MessagingException e) {
			
                           Notice.setVisible(false);
                         Notifications.create()
                 .title("Error!")
                .text("Invalid Email").darkStyle().position(Pos.CENTER)
                  .showWarning();
                         
                 throw new RuntimeException(e);
               
		}
        
        }
      
    }
    
    
                  
    
    
      @FXML
    private Label congrast;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          
      verLbl.setVisible(false);
      sorryLbl.setVisible(false);
      verCode.setVisible(false);
        verDone.setVisible(false);
         congrast.setVisible(false);
    }    
    
}
