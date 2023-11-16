package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.in.IVolante;

public class Passerotto extends Animal implements IVolante {

	@Override
	public void verso() {
		System.out.println("Cip Cip");
		
	}

	@Override
	public void mangia() {
		System.out.println("Insetti");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");		
	}

}
