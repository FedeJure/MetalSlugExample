package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import modelo.NoGun;
import vista.Main;

public class ButtonNoGun extends Button {
	private NoGun gun;
	public ButtonNoGun() {
		super();
		gun = new NoGun();
		this.setText("Activate No Gun");
		this.setMinHeight(Main.heigth/10);
		this.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Main.getPlayerModel().changeAttackStrategy(gun);
			}
			
		});
	}

}
