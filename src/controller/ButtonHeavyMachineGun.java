package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import modelo.AttackStrategy;
import modelo.SimpleGun;
import vista.Main;

public class ButtonHeavyMachineGun extends Button {
	private AttackStrategy gun;
	
	public ButtonHeavyMachineGun() {
		super();
		gun = new SimpleGun();
		this.setText("Activate Heavy Machine Gun");
		this.setMinHeight(Main.heigth/10);
		this.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Main.getPlayerModel().changeAttackStrategy(gun);
				Main.getPlayerView().changePlayerSkin(new Image("marco_heavy_machinegun.png"));
			}
			
		});
	}
}
