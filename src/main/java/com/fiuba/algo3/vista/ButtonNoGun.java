package main.java.com.fiuba.algo3.vista;

import javafx.scene.control.Button;

import main.java.com.fiuba.algo3.controller.buttonHandlers.HandlerNoGun;
import main.java.com.fiuba.algo3.modelo.Player;

public class ButtonNoGun extends Button {

	public ButtonNoGun(Player player) {
		super();
		this.setText("Activate No Gun");
		this.setMinHeight(100);
		this.setOnAction(new HandlerNoGun(player));
	}

}
