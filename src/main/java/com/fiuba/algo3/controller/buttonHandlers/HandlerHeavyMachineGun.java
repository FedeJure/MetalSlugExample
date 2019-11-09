package main.java.com.fiuba.algo3.controller.buttonHandlers;

import javafx.event.EventHandler;

import main.java.com.fiuba.algo3.modelo.HeavyMachineGun;;
import main.java.com.fiuba.algo3.modelo.Player;
import javafx.event.ActionEvent;

public class HandlerHeavyMachineGun implements EventHandler<ActionEvent> {

    private Player player;

    public HandlerHeavyMachineGun(Player player) {
        this.player = player;
    }

    public void handle(ActionEvent event) {
        HeavyMachineGun gun = new HeavyMachineGun();
        player.changeAttackStrategy(gun);

    }
}