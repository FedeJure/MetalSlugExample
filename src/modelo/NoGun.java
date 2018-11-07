package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

import vista.Main;

public class NoGun implements AttackStrategy {
	
	private int power;
	private String name = "marco_unarmed";

	@Override
	public void attack(Attackable target) {
		power = 1;
	}

	@Override
	public void hasChange() {
		Logger.getLogger("SimpleGun").log(Level.INFO, "Estrategia cambiada a NoGun");
		Main.playerHasChange();
	}

	@Override
	public String getName() {
		return name;
	}

}
