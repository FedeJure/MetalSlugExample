package vista;


import javafx.scene.canvas.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import modelo.Player;
 
public class Main extends Application 
{
	public static double width;
	public static double heigth;
	private static PlayerView player;
	private static Player playerModel;
	private Group root;
	
    public static void main(String[] args) 
    {
        launch(args);
    }
 
    public void start(Stage theStage) 
    {
    	width = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
    	heigth = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;
    	playerModel = new Player();
        theStage.setTitle( "Strategy Example" );
        
        root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );

        drawStage(root);
        

		root.setOnKeyPressed(new EventHandler<KeyEvent>() {
		    public void handle(KeyEvent event) {
		        if(event.getCode() == KeyCode.W) {
		        	player.moveVertical(-10);
		        }
		        if( event.getCode() == KeyCode.S) {
		        	player.moveVertical(10);
		        }
		        if (event.getCode() == KeyCode.D) {
		        	player.moveHorizontal(10);
		        }
		        if (event.getCode() == KeyCode.A) {
		        	player.moveHorizontal(-10);
		        } 
		        event.consume();
		    }
			
		});
        
        theStage.show();
    }
    
    private void drawStage(Group root) {
        setBackground();
    	
        player = new PlayerView(root);
    	
    	root.getChildren().add(new GunButtonContainer());
    	
         
    }
    
    
    public static Player getPlayerModel() {
    	return playerModel;
    }
    
    public static PlayerView getPlayerView() {
    	return player;
    }
    
    private void setBackground() {
        ImageView background= new ImageView();
        background.setImage(new Image("fondo.png"));
        background.setFitHeight(heigth);
        background.setFitWidth(width);
        root.getChildren().add(background);
    }
    
    public static void playerHasChange() {
    	player.updateSkin();
    }
    
}