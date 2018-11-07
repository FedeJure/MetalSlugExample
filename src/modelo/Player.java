package modelo;

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
		newStrategy.hasChange();
	}
}
