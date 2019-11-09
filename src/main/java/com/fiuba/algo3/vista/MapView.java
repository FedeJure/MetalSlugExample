package main.java.com.fiuba.algo3.vista;


import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.Group;
import javafx.scene.Node;
import main.java.com.fiuba.algo3.modelo.Map;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.BorderWidths;
import javafx.scene.paint.Color;

public class MapView extends Group {

    public double width;
    public double heigth;
    private double tileWidth = 64;
    private double tileHeigth = 64;

    private Map map;
    private GridPane table;

    private Pane[][] panes;

    public MapView(Map map){
        table = new GridPane();
        this.map = map;
        width = tileWidth * map.getWidth();
        heigth = tileHeigth * map.getHeigth();
        panes = new Pane[ (int)width][(int)heigth];
        
        for (int i = 0; i < map.getWidth(); i++) {
            for (int j = 0; j < map.getHeigth(); j++) {
                Pane v = new Pane();
                v.setBorder(new Border(new BorderStroke(Color.BLACK, 
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                v.setMinHeight(this.tileHeigth);
                v.setMinWidth(this.tileWidth);
                panes[i][j] = v;
                table.add(v , i, j);
            }
        }
        Background bi = new Background(new BackgroundImage(new Image("fondo.png"),
        BackgroundRepeat.NO_REPEAT,
        BackgroundRepeat.NO_REPEAT,
        BackgroundPosition.CENTER,
        new BackgroundSize(this.width, this.heigth, false, false, false, false)));
        table.setBackground(bi);

        this.addView(table);
    }

    public void addViewOnMap(Node view, int x, int y) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                try {
                    panes[i][j].getChildren().remove(view);
                    
                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
        }
        panes[x][y].getChildren().add(0, view);
    }

    public void addView(Node view) {
        this.getChildren().add(view);
    }

    public void updateView(Node view) {
		getChildren().remove(view);
		getChildren().add(view);
    }
}