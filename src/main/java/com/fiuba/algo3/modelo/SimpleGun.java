package com.fiuba.algo3.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.fiuba.algo3.vista.Main;

public class SimpleGun implements AttackStrategy {

	private int power;
	private String name = "marco_pistola";

	public SimpleGun() {
		power = 10;
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
