package org.java.pojo.in;

public interface INuotante {
	void nuota();
	
	static void faiNuotare(INuotante animal) {
		animal.nuota();
	}
}
