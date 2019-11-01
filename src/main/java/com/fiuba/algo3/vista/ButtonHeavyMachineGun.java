package com.fiuba.algo3.vista;

import javafx.scene.control.Button;
import com.fiuba.algo3.modelo.AttackStrategy;
import com.fiuba.algo3.modelo.HeavyMachineGun;
import com.fiuba.algo3.vista.Main;
import com.fiuba.algo3.vista.PlayerView;
import com.fiuba.algo3.controller.buttonHandlers.HandlerHeavyMachineGun;

public class ButtonHeavyMachineGun extends Button {
	private AttackStrategy gun;

	public ButtonHeavyMachineGun(PlayerView playerView) {
		super();
		gun = new HeavyMachineGun();
		this.setText("Activate Heavy Machine Gun");
		this.setMinHeight(Main.heigth / 10);
		this.setOnAction(new HandlerHeavyMachineGun(playerView));
	}
}
