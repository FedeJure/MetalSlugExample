package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleGun implements AttackStrategy {
	
	private int power;
	
	public SimpleGun() {
		power = 10;
	}
	
	@Override
	public void attack(Attackable target) {
		target.takeDamage(power);
	}

	@Override
	public void hasChange() {
		Logger.getLogger("SimpleGun").log(Level.INFO, "Estrategia cambiada a SimpleGun");
	}
}
