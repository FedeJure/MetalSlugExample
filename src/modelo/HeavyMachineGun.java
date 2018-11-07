
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

import vista.Main;

public class HeavyMachineGun implements AttackStrategy {
	
	private int power;
	private String name = "marco_heavy_machinegun";
	
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
		Main.playerHasChange();
	}

	@Override
	public String getName() {
		return name;
	}
}