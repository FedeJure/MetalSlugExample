package main.java.com.fiuba.algo3.vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import main.java.com.fiuba.algo3.modelo.Observer;
import main.java.com.fiuba.algo3.modelo.Player;
import main.java.com.fiuba.algo3.vista.MapView;

public class PlayerView implements Observer, Drawable {
	private double playerScale = 1;
	private MapView stage;
	ImageView playerImage;

	private Player player;

	private int lastXPosition;

	public PlayerView(MapView stage, Player player) {
		this.stage = stage;
		this.player = player;

		this.lastXPosition = player.getPosition().getX();
		player.addObserver(this);

		playerImage = new ImageView();
		playerImage.setScaleX(playerScale);
		playerImage.setScaleY(playerScale);
		playerImage.setFitHeight(64);
		playerImage.setFitWidth(64);

		playerImage.setImage(new Image("marco_unarmed.png"));
		stage.addViewOnMap(playerImage, player.getPosition().getX(), player.getPosition().getY());;
		draw();

	}

	@Override
	public void draw() {
		playerImage.setTranslateX(0);
		playerImage.setTranslateY(0);
		stage.updateView(playerImage);
	}

	private void changePlayerSkin(String fileName) {
		playerImage.setImage(new Image(fileName + ".png"));
	}

	@Override
	public void change() {
		changePlayerSkin(player.getStrategyName());
		if (lastXPosition > player.getPosition().getX()) {
			this.playerImage.setScaleX( - 
			Math.abs(playerImage.getScaleX()));
		}

		else if (lastXPosition < player.getPosition().getY()) {
			this.playerImage.setScaleX(
			-Math.abs(playerImage.getScaleX()));
		}
		lastXPosition = player.getPosition().getX();
		stage.addViewOnMap(this.playerImage, player.getPosition().getX(), player.getPosition().getY());
	}

}
