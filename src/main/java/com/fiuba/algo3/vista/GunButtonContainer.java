package main.java.com.fiuba.algo3.vista;

import javafx.scene.layout.HBox;
import main.java.com.fiuba.algo3.modelo.Player;

public class GunButtonContainer extends HBox {

	public GunButtonContainer(Player player) {
		super();
		this.setHeight(20);
		this.getChildren().add(new ButtonSimpleGun(player));
		this.getChildren().add(new ButtonHeavyMachineGun(player));
		this.getChildren().add(new ButtonNoGun(player));

	}
}
