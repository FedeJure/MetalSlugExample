package com.fiuba.algo3.vista;

import javafx.scene.control.Button;

import com.fiuba.algo3.controller.buttonHandlers.HandlerNoGun;
import com.fiuba.algo3.modelo.NoGun;
import com.fiuba.algo3.vista.Main;

public class ButtonNoGun extends Button {
	private NoGun gun;

	public ButtonNoGun(PlayerView playerView) {
		super();
		gun = new NoGun();
		this.setText("Activate No Gun");
		this.setMinHeight(Main.heigth / 10);
		this.setOnAction(new HandlerNoGun(playerView));
	}

}
