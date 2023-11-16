package org.java.pojo.main;

import java.util.Iterator;

import org.java.pojo.Aquila;
import org.java.pojo.Cane;
import org.java.pojo.Delfino;
import org.java.pojo.Passerotto;
import org.java.pojo.in.INuotante;
import org.java.pojo.in.IVolante;

public class Main {
	public static void main(String[] args) {
		// CANE
		System.out.println("Cane: ");
		Cane c = new Cane();
		c.dormi();
		c.verso();
		c.mangia();
		System.out.println("---------------------------------");
		// PASSEROTTO
		System.out.println("Passerotto: ");
		Passerotto p = new Passerotto();
		p.dormi();
		p.verso();
		p.mangia();
		System.out.println("---------------------------------");
		// AQUILA
		System.out.println("Aquila: ");
		Aquila a = new Aquila();
		a.dormi();
		a.verso();
		a.mangia();
		System.out.println("---------------------------------");
		// DELFINO
		System.out.println("Delfino: ");
		Delfino d = new Delfino();
		d.dormi();
		d.verso();
		d.mangia();

		// INTERFACCE

		System.out.println("---------------------------------");

		IVolante[] animalsCanFly = new IVolante[2];

		animalsCanFly[0] = p;
		animalsCanFly[1] = a;

		for (int i = 0; i < animalsCanFly.length; i++) {
			faiVolare(animalsCanFly[i]);
		}

		INuotante[] animalsCanSwim = new INuotante[1];

		animalsCanSwim[0] = d;

		faiNuotare(d);
	}
	
	static void faiNuotare(INuotante animal) {
		animal.nuota();
	}
	
	static void faiVolare(IVolante animal) {
		animal.vola();
	}
}
