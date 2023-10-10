/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
//import static ecommerce.SignUpController.codd;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.controlsfx.control.Notifications;

/**
 * FXML Controller class
 *
 * @author DCL
 */
public class ForgotPassController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
      @FXML
    private JFXTextField forgotEmail;

    @FXML
    private Label forgotlbl;

    @FXML
    private Label enterCode;

    @FXML
    private TextField forgotCode;

    @FXML
    private JFXButton ok;

    @FXML
    private JFXButton maildone;
    
       @FXML
    private Label retry;

    @FXML
    private Label gainedpass;

    @FXML
    private Label passtxt;
    
    
    
    static int codd;
    
    
      Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
         String passtbl;
        String user = "root";
        String pass = "12345";

    @FXML
    void forgotCoding(ActionEvent event) {
        
        String cc=forgotCode.getText();
        int nn=Integer.valueOf(cc);
       // System.out.println(nn);
         String getmail=forgotEmail.getText();
        if(codd==nn){
            
            passtxt.setVisible(true);
            
            try{
            
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?autoReconnect=true&useSSL=false",user, pass);

            // 2. Create a statement
            stmt = conn.createStatement();
            
           // proPicLbl.setVisible(false);
            
             // String passtbl;
            //passtbl = 
                rs =stmt.executeQuery("select password from customer where email='"+getmail+"' ");     
            while (rs.next()){
              
              passtbl=rs.getString("password");
              System.out.println(passtbl);
              
            }
             gainedpass.setText(passtbl);
            
            }catch(Exception e){
                    
                 //  customerImg.setImage();
              //  proPicLbl.setVisible(true);
                
                
                    }
        
        }
        else{
            
            retry.setVisible(true);
            
        }
        
    }

    @FXML
    void maildoning(ActionEvent event) {
             
               
        
           
        
        String mail=forgotEmail.getText();
      //  String fn=Fname.getText();
      //  String pass=Password.getText();
        
        if(forgotEmail.equals("")){  //checking whether *fileds are filled or not
            
           Notifications.create()
           .title("Notifications")
            .text("Please provide your email").darkStyle().position(Pos.CENTER)
            .showWarning();
            
           
        
        }
        else{
            
        
            
         ok.setVisible(true);
        forgotCode.setVisible(true);
        enterCode.setVisible(true);
        forgotlbl.setVisible(true);
            
            
             Random rnd =new Random();
        
        int code=rnd.nextInt(999999-100000)+100000;
        codd=code;
        System.out.println(codd);
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
			message.setText("Your HorizonBit Password Verification Code is:-"+code);

			Transport.send(message);
                        
			//System.out.println("Done");

		} catch (MessagingException e) {
			
                         //  Notice.setVisible(false);
                         Notifications.create()
                 .title("Error!")
                .text("Invalid Email").darkStyle().position(Pos.CENTER)
                  .showWarning();
                         
                 throw new RuntimeException(e);
               
		}
        
        
            
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        
        
        
        ok.setVisible(false);
        forgotCode.setVisible(false);
        enterCode.setVisible(false);
        forgotlbl.setVisible(false);
         passtxt.setVisible(false);
          retry.setVisible(false);
        
    }    
    
}
