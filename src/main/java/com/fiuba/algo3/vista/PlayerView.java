package main.java.com.fiuba.algo3.vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import main.java.com.fiuba.algo3.modelo.Observer;
import main.java.com.fiuba.algo3.modelo.Player;
import main.java.com.fiuba.algo3.vista.MapView;

public class PlayerView implements Observer, Drawable {
	private double positionX;
	private double positionY;
	private double playerScale = 1;
	private MapView stage;
	ImageView playerImage;

	private Player player;

	public PlayerView(MapView stage, Player player) {
		this.stage = stage;
		this.player = player;
		player.addObserver(this);

		playerImage = new ImageView();
		playerImage.setTranslateX(positionX);
		playerImage.setTranslateY(positionY);
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
		playerImage.setTranslateX(positionX);
		playerImage.setTranslateY(positionY);
		stage.updateView(playerImage);
	}

	public void moveHorizontal(int count) {
		/*if (positionX + count > stage.getWidth() - playerImage.getImage().getWidth() * playerImage.getScaleX()
				|| positionX + count < 0) {
			return;
		}
		if (count < 0 && playerImage.getScaleX() > 0) {
			playerImage.setScaleX(playerImage.getScaleX() * -1);
		}
		if (count > 0 && playerImage.getScaleX() < 0) {
			playerImage.setScaleX(playerImage.getScaleX() * -1);
		}
		positionX += count;
		draw();*/
	}

	public void moveVertical(int count) {
		/*if (positionY + count > stage.getHeight() - playerImage.getImage().getHeight() || positionY + count < 0) {
			return;
		}
		positionY += count;
		draw();*/
	}

	private void changePlayerSkin(String fileName) {
		playerImage.setImage(new Image(fileName + ".png"));
	}

	@Override
	public void change() {
		changePlayerSkin(player.getStrategyName());
		stage.addViewOnMap(this.playerImage, player.getPosition().getX(), player.getPosition().getY());
	}

}
