package main.java.com.fiuba.algo3.vista;

import javafx.scene.control.Button;
import main.java.com.fiuba.algo3.modelo.Player;
import main.java.com.fiuba.algo3.controller.buttonHandlers.HandlerHeavyMachineGun;

public class ButtonHeavyMachineGun extends Button {

	public ButtonHeavyMachineGun(Player player) {
		super();
		this.setText("Activate Heavy Machine Gun");
		this.setMinHeight(20);
		this.setOnAction(new HandlerHeavyMachineGun(player));
	}
}
