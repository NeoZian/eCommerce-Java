/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerce;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author DCL
 */
public class ECommerce extends Application {

    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        
       //  Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
         Pane bottom=FXMLLoader.load(getClass().getResource("home_bottom.fxml"));
      // Pane c=FXMLLoader.load(getClass().getResource("center.fxml"));
       
       // Group gr=new Group();
         String[] photos = { "img/4.png","img/5.png","img/1.png","img/2.png","img/3.png","img/7.png"};
    Pagination p = new Pagination(photos.length);
   
         p.setPageFactory((Integer pageIndex) -> {
        return new ImageView(getClass().getResource(photos[pageIndex])
                .toExternalForm());
    });
        
        
        

        Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(3), event -> {
            int pos = (p.getCurrentPageIndex()+1) % p.getPageCount();
            
            p.setCurrentPageIndex(pos);
           
            
        }));
        p.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);
        fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        fiveSecondsWonder.play();
      
         
       
       // stage.setScene(new Scene(p));
        //stage.show();
       
        
      
        BorderPane bpane=new BorderPane(); 
         bpane.setStyle("-fx-background-color: #C5DED8;");
        //  stk.getParent();
        bpane.setTop(root);
       // bpane.setCenter(c);
        bpane.setLeft(p);
          bpane.setRight(call());
        bpane.setCenter(callc());
        
        
        
        bpane.setBottom(bottom);
        
       // gr.getChildren().add(bpane);
        //gr.getChildren().add(root);
        
       Scene scene = new Scene(bpane);
        
       stage.setScene(scene);
       // stage.getIcons().add(new Image(getClass().getResourceAsStream("boost-my-shop-magento-conflit.png")));
      //  stage.setMaximized(true);
      // stage.resizableProperty().set(false);
         stage.initStyle(StageStyle.UTILITY);
        
       // stage.setFullScreen(true);
        
    
      
        stage.show();
       
       // Scene scene = new Scene(root);
        
    
      
      //  stage.setScene(scene);
       // stage.setMaximized(true);
       // stage.initStyle(StageStyle.UTILITY);
      //  stage.show();
    }
    
    
    
    Pagination call(){
          
         String[] photos = { "img/4.png","img/5.png","img/1.png","img/2.png","img/3.png","img/7.png"};
    Pagination p = new Pagination(photos.length);
   
         p.setPageFactory((Integer pageIndex) -> {
        return new ImageView(getClass().getResource(photos[pageIndex])
                .toExternalForm());
    });
        
         p.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);
        

        Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(3), event -> {
            int pos = (p.getCurrentPageIndex()+1) % p.getPageCount();
            p.setCurrentPageIndex(pos);
            
        }));
        fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        fiveSecondsWonder.play();
      
         
        return p;
        
    }
    
    
    
    Pagination callc(){
          
         String[] photos = { "img/4.png","img/5.png","img/1.png","img/2.png","img/3.png","img/7.png"};
    Pagination p = new Pagination(photos.length);
   
         p.setPageFactory((Integer pageIndex) -> {
        return new ImageView(getClass().getResource(photos[pageIndex])
                .toExternalForm());
    });
        
         p.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);
        

        Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(3), event -> {
            int pos = (p.getCurrentPageIndex()+1) % p.getPageCount();
            p.setCurrentPageIndex(pos);
            
        }));
        fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        fiveSecondsWonder.play();
      
         
        return p;
        
        
    }
    
        
        
        
        
        
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
