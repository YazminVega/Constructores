package Sobreescrito;

/**
 * @author Yazmín Vega
 * @date 03/09/17
 */

public class A {

    public A(int a, int b) { // Se crea un constructor
		int i, j;
		i = a;
		j = b;
	}
  
	void show() {
		System.out.println("i y j: " + i + " " + j);
	}
}

public class B extends A {
	
	public B(int a, int b, int c) {
		int k;
		super(a, b);
		k = c;
	} // muestra k sobreescribe el metodo show() de A

	void show() {
		System.out.println("k: " + k);
	}
}

public class Override {
  
	public static void main(String args[]) {
		B subOb = new B(1, 2, 3);
		subOb.show(); // llama al metodo show() de B
	}
  /*
  * Este constructor consiste en construir un método en una subclase con el mismo nombre
  */
}