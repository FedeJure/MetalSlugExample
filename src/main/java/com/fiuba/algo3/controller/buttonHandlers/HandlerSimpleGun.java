package main.java.com.fiuba.algo3.controller.buttonHandlers;

import javafx.event.EventHandler;

import main.java.com.fiuba.algo3.modelo.*;
import main.java.com.fiuba.algo3.modelo.Player;
import javafx.event.ActionEvent;

public class HandlerSimpleGun implements EventHandler<ActionEvent> {

  private Player player;

  public HandlerSimpleGun(Player player) {
    this.player = player;
  }

  public void handle(ActionEvent event) {
    SimpleGun gun = new SimpleGun();
    player.changeAttackStrategy(gun);

  }
}