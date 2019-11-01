package com.fiuba.algo3.controller.buttonHandlers;

import javafx.event.EventHandler;

import com.fiuba.algo3.modelo.*;
import com.fiuba.algo3.vista.PlayerView;
import javafx.event.ActionEvent;

public class HandlerHeavyMachineGun implements EventHandler<ActionEvent> {

    private PlayerView player;

    public HandlerHeavyMachineGun(PlayerView player) {
        this.player = player;
    }

    public void handle(ActionEvent event) {
        HeavyMachineGun gun = new HeavyMachineGun();
        player.changeAttackStrategy(gun);

    }
}