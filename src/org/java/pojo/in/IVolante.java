package org.java.pojo.in;

public interface IVolante {
	abstract void vola();
	
	static void faiVolare(IVolante animal) {
		animal.vola();
	}
}
