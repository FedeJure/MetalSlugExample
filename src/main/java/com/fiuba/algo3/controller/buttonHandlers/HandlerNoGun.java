package main.java.com.fiuba.algo3.controller.buttonHandlers;

import javafx.event.EventHandler;

import main.java.com.fiuba.algo3.modelo.*;
import main.java.com.fiuba.algo3.vista.PlayerView;
import javafx.event.ActionEvent;

public class HandlerNoGun implements EventHandler<ActionEvent> {

  private PlayerView player;

  public HandlerNoGun(PlayerView player) {
    this.player = player;
  }

  public void handle(ActionEvent event) {
    NoGun gun = new NoGun();
    player.changeAttackStrategy(gun);

  }
}