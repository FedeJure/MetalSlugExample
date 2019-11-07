
package main.java.com.fiuba.algo3.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.com.fiuba.algo3.vista.Main;

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
	public String getName() {
		return name;
	}
}