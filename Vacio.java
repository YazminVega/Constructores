package Vacio;

/**
 * @author Yazmín Vega
 * @date 03/09/17
 */
 
public class Arboles { 

    public Arboles() { // Se crea un constructor el cual se encuentra vacío
      System.out.println("Un árbol genérico");
    }
  
    public Arboles(String tipo) { 
     System.out.println("Un árbol tipo " + tipo);
    }

    public Arboles(int altura) { 
     System.out.println("Un árbol de " + altura + " metros");
	} 

    public Arboles(int altura,String tipo) { 
     System.out.println("Un " + tipo + " de " + altura + " metros");
	} 
	
	/*
    * Es necesaria la definición de un constructor vacío cuando se hace uso de otros constructores
    */
}