package main.java.com.fiuba.algo3.vista;

import javafx.scene.control.Button;

import main.java.com.fiuba.algo3.controller.buttonHandlers.HandlerNoGun;
import main.java.com.fiuba.algo3.modelo.NoGun;
import main.java.com.fiuba.algo3.vista.Main;

public class ButtonNoGun extends Button {
	private NoGun gun;

	public ButtonNoGun(PlayerView playerView) {
		super();
		gun = new NoGun();
		this.setText("Activate No Gun");
		this.setMinHeight(100);
		this.setOnAction(new HandlerNoGun(playerView));
	}

}
