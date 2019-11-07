package main.java.com.fiuba.algo3.modelo;

public class Player {
	private AttackStrategy attackStrategy;

	public Player() {
		attackStrategy = new SimpleGun();
	}

	public void attack(Attackable target) {
		attackStrategy.attack(target);
	}

	public void changeAttackStrategy(AttackStrategy newStrategy) {
		attackStrategy = newStrategy;
	}

	public String getStrategyName() {
		return attackStrategy.getName();
	}
}
