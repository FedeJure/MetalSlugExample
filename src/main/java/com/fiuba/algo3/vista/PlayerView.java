package main.java.com.fiuba.algo3.vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.com.fiuba.algo3.modelo.AttackStrategy;
import main.java.com.fiuba.algo3.modelo.NoGun;
import main.java.com.fiuba.algo3.modelo.Player;
import main.java.com.fiuba.algo3.vista.World;

public class PlayerView implements Drawable {
	private double positionX;
	private double positionY;
	private double playerScale = 4;
	private World stage;
	ImageView playerImage;

	private Player player;

	public PlayerView(World stage) {
		this.stage = stage;
		player = new Player();

		positionX = stage.getWidth() / 2;
		positionY = stage.getHeigth() / 2;

		playerImage = new ImageView();
		playerImage.setTranslateX(positionX);
		playerImage.setTranslateY(positionY);
		playerImage.setScaleX(playerScale);
		playerImage.setScaleY(playerScale);

		playerImage.setImage(new Image("marco_unarmed.png"));
		stage.addView(playerImage);
		draw();

	}

	@Override
	public void draw() {
		playerImage.setTranslateX(positionX);
		playerImage.setTranslateY(positionY);
		stage.updateView(playerImage);
	}

	public void moveHorizontal(int count) {
		if (positionX + count > stage.getWidth() - playerImage.getImage().getWidth() * playerImage.getScaleX()
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
		draw();
	}

	public void moveVertical(int count) {
		if (positionY + count > stage.getHeigth() - playerImage.getImage().getHeight() || positionY + count < 0) {
			return;
		}
		positionY += count;
		draw();
	}

	private void changePlayerSkin(String fileName) {
		playerImage.setImage(new Image(fileName + ".png"));
	}

	public void updateSkin(AttackStrategy strategy) {
		Logger.getLogger("Update skin").log(Level.INFO, strategy.getName());
		changePlayerSkin(strategy.getName());
	}

	public void changeAttackStrategy(AttackStrategy strategy) {
		player.changeAttackStrategy(strategy);
		updateSkin(strategy);
	}

}
