package main.java.com.fiuba.algo3.vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.com.fiuba.algo3.controller.MainKeyboardController;
public class Main extends Application {


    private PlayerView player;

    private World world;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage theStage) {
        theStage.setTitle("Strategy Example");

        world = new World();
        Scene theScene = new Scene(world);
        theStage.setScene(theScene);

        player = new PlayerView(world);
        world.getChildren().add(new GunButtonContainer(player));

        world.setOnKeyPressed(new MainKeyboardController(player));

        theStage.show();
    }

}