package com.fiuba.algo3.vista;

import javafx.scene.control.Button;

import com.fiuba.algo3.controller.buttonHandlers.HandlerSimpleGun;
import com.fiuba.algo3.modelo.AttackStrategy;
import com.fiuba.algo3.modelo.SimpleGun;
import com.fiuba.algo3.vista.Main;
import com.fiuba.algo3.vista.PlayerView;;

public class ButtonSimpleGun extends Button {

	private AttackStrategy gun;

	public ButtonSimpleGun(PlayerView playerView) {
		super();
		gun = new SimpleGun();
		this.setText("Activate Simple Gun");
		this.setMinHeight(Main.heigth / 10);
		this.setOnAction(new HandlerSimpleGun(playerView));
	}
}
