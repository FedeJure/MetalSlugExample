package com.fiuba.algo3.vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import com.fiuba.algo3.modelo.Player;
import com.fiuba.algo3.controller.MainKeyboardController;;

public class Main extends Application {
    public static double width;
    public static double heigth;
    private static PlayerView player;
    private static Player playerModel;
    private Group root;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage theStage) {
        width = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        heigth = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;
        playerModel = new Player();
        theStage.setTitle("Strategy Example");

        root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);

        player = new PlayerView(root);

        drawStage(root);

        root.setOnKeyPressed(new MainKeyboardController(player));

        theStage.show();
    }

    private void drawStage(Group root) {
        setBackground();

        root.getChildren().add(new GunButtonContainer(player));

    }

    public static Player getPlayerModel() {
        return playerModel;
    }

    public static PlayerView getPlayerView() {
        return player;
    }

    private void setBackground() {
        ImageView background = new ImageView();
        background.setImage(new Image("fondo.png"));
        background.setFitHeight(heigth);
        background.setFitWidth(width);
        root.getChildren().add(background);
    }

}