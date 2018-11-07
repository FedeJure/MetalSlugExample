package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import modelo.AttackStrategy;
import modelo.HeavyMachineGun;
import vista.Main;

public class ButtonHeavyMachineGun extends Button {
	private AttackStrategy gun;
	
	public ButtonHeavyMachineGun() {
		super();
		gun = new HeavyMachineGun();
		this.setText("Activate Heavy Machine Gun");
		this.setMinHeight(Main.heigth/10);
		this.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Main.getPlayerModel().changeAttackStrategy(gun);			}
			
		});
	}
}
