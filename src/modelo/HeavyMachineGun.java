
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HeavyMachineGun implements AttackStrategy {
	
	private int power;
	
	public HeavyMachineGun() {
		power = 100;
	}
	
	@Override
	public void attack(Attackable target) {
		target.takeDamage(power);
	}

	@Override
	public void hasChange() {
		Logger.getLogger("HeavyMachineGun").log(Level.INFO, "Estrategia cambiada a HeavyMachineGun");
	}
}