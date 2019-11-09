package main.java.com.fiuba.algo3.vista;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.java.com.fiuba.algo3.controller.MainKeyboardController;
import main.java.com.fiuba.algo3.modelo.Player;
import main.java.com.fiuba.algo3.modelo.Position;
import main.java.com.fiuba.algo3.modelo.Map;
public class Main extends Application {


    private PlayerView player;
    private MapView mapView;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage theStage) {
        theStage.setTitle("Strategy Example");

        Map map = new Map();
        mapView = new MapView(map);

        Player playerModel = new Player();
        map.positionate(playerModel, new Position(0, 0));
        map.addObserver(player);

        player = new PlayerView(mapView, playerModel);
        VBox vbox = new VBox();



        vbox.getChildren().add(mapView);
        vbox.getChildren().add(new GunButtonContainer(playerModel));
        vbox.setOnKeyPressed(new MainKeyboardController(playerModel,  map));
        
        
        Scene theScene = new Scene(vbox);
        theStage.setScene(theScene);
        theStage.show();
    }

}