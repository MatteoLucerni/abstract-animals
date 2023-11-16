package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.in.IVolante;

public class Aquila extends Animal implements IVolante {

	@Override
	public void verso() {
		System.out.println("Gneeeooo");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mammiferi");		
	}
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");		
	}

}
