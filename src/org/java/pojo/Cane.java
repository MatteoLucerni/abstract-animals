package org.java.pojo;

import org.java.pojo.abs.Animal;

public class Cane extends Animal {

	@Override
	public void verso() {
		System.out.println("Bau Bau");
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
	}

}
