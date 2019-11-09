package main.java.com.fiuba.algo3.modelo;


import main.java.com.fiuba.algo3.modelo.Observable;
import main.java.com.fiuba.algo3.modelo.Positionable;;

public class Player extends Observable implements Positionable {
	private AttackStrategy attackStrategy;
	private Position position;

	public Player() {
		super();
		attackStrategy = new SimpleGun();
	}

	public void changeAttackStrategy(AttackStrategy newStrategy) {
		attackStrategy = newStrategy;
		notifyObservers();
	}

	public String getStrategyName() {
		return attackStrategy.getName();
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public void setPosition(Position position) {
		this.position = position;
		notifyObservers();
	}
}
