package controller.buttonHandlers;

import javafx.event.EventHandler;
import modelo.AttackStrategy;
import modelo.HeavyMachineGun;
import vista.PlayerView;
import javafx.event.ActionEvent;



class HandlerHeavyMachineGun extends EventHandler<ActionEvent> {

    private PlayerView player;

    public HandlerHeavyMachineGun(PlayerView player) {
        this.player = player;
    }

	@Override
	public void handle(ActionEvent event) {
        AttackStrategy gun = new HeavyMachineGun();
		player.changeAttackStrategy( gun );		
    
    }
}