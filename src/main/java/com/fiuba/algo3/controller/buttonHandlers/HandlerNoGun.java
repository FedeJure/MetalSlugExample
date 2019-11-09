package main.java.com.fiuba.algo3.controller.buttonHandlers;

import javafx.event.EventHandler;

import main.java.com.fiuba.algo3.modelo.NoGun;;
import main.java.com.fiuba.algo3.modelo.Player;
import javafx.event.ActionEvent;

public class HandlerNoGun implements EventHandler<ActionEvent> {

  private Player player;

  public HandlerNoGun(Player player) {
    this.player = player;
  }

  public void handle(ActionEvent event) {
    NoGun gun = new NoGun();
    player.changeAttackStrategy(gun);

  }
}