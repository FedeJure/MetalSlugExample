package main.java.com.fiuba.algo3.vista;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;
import javafx.stage.Screen;
import javafx.scene.Node;

public class World extends Group {

    public double width;
    public double heigth;

    private Group root;
    private ImageView background;

    public World() {
        
        width = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        heigth = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;
        
        background = new ImageView();
        background.setImage(new Image("fondo.png"));
        background.setFitHeight(heigth);
        background.setFitWidth(width);
        addView(background);
    }

    public void addView(Node view) {
        getChildren().add(view);
    }

    public void updateView(Node view) {
		getChildren().remove(view);
		getChildren().add(view);
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }
}