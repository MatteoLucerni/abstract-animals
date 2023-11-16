package org.java.pojo;

import org.java.pojo.abs.Animal;
import org.java.pojo.in.INuotante;

public class Delfino extends Animal implements INuotante {

	@Override
	public void verso() {
		System.out.println("Rititititititi");
		
	}

	@Override
	public void mangia() {
		System.out.println("Pesci");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
		
	}

}
