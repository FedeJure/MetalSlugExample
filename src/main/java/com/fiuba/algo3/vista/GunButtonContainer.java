package com.fiuba.algo3.vista;

import javafx.scene.layout.HBox;

public class GunButtonContainer extends HBox {

	public GunButtonContainer(PlayerView playerView) {
		super();
		this.setTranslateY(Main.heigth);
		this.setTranslateX(Main.width / 3);
		this.setHeight(Main.heigth / 10);
		this.getChildren().add(new ButtonSimpleGun(playerView));
		this.getChildren().add(new ButtonHeavyMachineGun(playerView));
		this.getChildren().add(new ButtonNoGun(playerView));

	}
}
