package vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class PlayerView implements Drawable{
	private double positionX;
	private double positionY;
	private double playerScale = 4;
	private Group root;
	ImageView playerImage;
	public PlayerView(Group root) {
		this.root = root;
		positionX = Main.width /2;
		positionY = Main.heigth /2;
		
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
		if (positionX + count > Main.width - playerImage.getImage().getWidth() * playerImage.getScaleX()|| positionX + count < 0) {
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
	
	public void changePlayerSkin(String fileName) {
		playerImage.setImage(new Image(fileName + ".png"));
	}
	public void updateSkin() {
		changePlayerSkin(Main.getPlayerModel().getStrategyName());
	}
	
	
}
