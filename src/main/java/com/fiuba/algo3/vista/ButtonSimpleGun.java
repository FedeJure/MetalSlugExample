package main.java.com.fiuba.algo3.vista;

import javafx.scene.control.Button;

import main.java.com.fiuba.algo3.controller.buttonHandlers.HandlerSimpleGun;
import main.java.com.fiuba.algo3.modelo.AttackStrategy;
import main.java.com.fiuba.algo3.modelo.SimpleGun;
import main.java.com.fiuba.algo3.vista.Main;
import main.java.com.fiuba.algo3.vista.PlayerView;;

public class ButtonSimpleGun extends Button {

	private AttackStrategy gun;

	public ButtonSimpleGun(PlayerView playerView) {
		super();
		gun = new SimpleGun();
		this.setText("Activate Simple Gun");
		this.setMinHeight(100);
		this.setOnAction(new HandlerSimpleGun(playerView));
	}
}
