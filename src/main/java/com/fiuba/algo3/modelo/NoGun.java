package com.fiuba.algo3.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.fiuba.algo3.vista.Main;

public class NoGun implements AttackStrategy {

	private String name = "marco_unarmed";

	@Override
	public void attack(Attackable target) {
	}

	@Override
	public String getName() {
		return name;
	}

}
