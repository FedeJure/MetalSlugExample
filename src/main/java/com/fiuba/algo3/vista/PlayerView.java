package com.fiuba.algo3.vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.fiuba.algo3.modelo.AttackStrategy;
import com.fiuba.algo3.modelo.NoGun;
import com.fiuba.algo3.modelo.Player;

public class PlayerView implements Drawable {
	private double positionX;
	private double positionY;
	private double playerScale = 4;
	private Group root;
	ImageView playerImage;

	private Player player;

	public PlayerView(Group root) {
		this.root = root;
		player = new Player();

		positionX = Main.width / 2;
		positionY = Main.heigth / 2;

		playerImage = new ImageView();
		playerImage.setTranslateX(positionX);
		playerImage.setTranslateY(positionY);
		playerImage.setScaleX(playerScale);
		playerImage.setScaleY(playerScale);

		playerImage.setImage(new Image("marco_unarmed.png"));
		root.getChildren().add(playerImage);

	}

	@Override
	public void draw() {
		playerImage.setTranslateX(positionX);
		playerImage.setTranslateY(positionY);
		root.getChildren().remove(playerImage);
		root.getChildren().add(playerImage);
	}

	public void moveHorizontal(int count) {
		if (positionX + count > Main.width - playerImage.getImage().getWidth() * playerImage.getScaleX()
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
		if (positionY + count > Main.heigth - playerImage.getImage().getHeight() || positionY + count < 0) {
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
