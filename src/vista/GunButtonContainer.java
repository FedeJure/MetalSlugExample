package vista;

import controller.ButtonHeavyMachineGun;
import controller.ButtonNoGun;
import controller.ButtonSimpleGun;
import javafx.scene.layout.HBox;

public class GunButtonContainer extends HBox{
	
	public GunButtonContainer() {
		super();
		this.setTranslateY(Main.heigth);
		this.setTranslateX(Main.width / 3);
		this.setHeight(Main.heigth/10);
		this.getChildren().add(new ButtonSimpleGun());
		this.getChildren().add(new ButtonHeavyMachineGun());
		this.getChildren().add(new ButtonNoGun());
		
	}
}
