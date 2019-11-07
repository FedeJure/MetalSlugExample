package main.java.com.fiuba.algo3.vista;

import javafx.scene.layout.HBox;

public class GunButtonContainer extends HBox {

	public GunButtonContainer(PlayerView playerView) {
		super();
		this.setTranslateY(500);
		this.setTranslateX(100);
		this.setHeight(100);
		this.getChildren().add(new ButtonSimpleGun(playerView));
		this.getChildren().add(new ButtonHeavyMachineGun(playerView));
		this.getChildren().add(new ButtonNoGun(playerView));

	}
}
