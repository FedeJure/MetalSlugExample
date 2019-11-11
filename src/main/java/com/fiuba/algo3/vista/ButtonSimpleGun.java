package main.java.com.fiuba.algo3.vista;

import javafx.scene.control.Button;

import main.java.com.fiuba.algo3.controller.buttonHandlers.HandlerSimpleGun;
import main.java.com.fiuba.algo3.modelo.Player;

public class ButtonSimpleGun extends Button {


	public ButtonSimpleGun(Player player) {
		super();
		this.setText("Activate Simple Gun");
		this.setMinHeight(20);
		this.setOnAction(new HandlerSimpleGun(player));
	}
}
