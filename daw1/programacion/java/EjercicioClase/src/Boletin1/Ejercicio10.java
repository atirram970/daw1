/**
 * 
 */
package Boletin1;

/**
 * 
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//creacion y declaracion variables
		double d=(Math.random()*100);
		String msg=(d>=0 && d<20) ? 
		"El número está entre 0 y 20, sin incluir 20" : 
			"El número no está entre 0 y 20, sin incluir 20";
		
		msg=(d>=20 && d<=50) ? 
				"El número está entre 20 y 50, incluyendo ambos" : 
					"El número no está entre 0 y 20, incluyendo ambos";
		
		msg=(d>50 && d<75) ? 
				"El número está entre 50 y 75, sin incluir a ninguno" : 
					"El número no está entre 50 y 75, sin incluir a ninguno";
		
		msg=(d>=75 && d<100) ? 
				"El número está entre 75 y 100, incluyendo ambos" : 
					"El número no está entre 75 y 100, incluyendo ambos";
		
		msg=((d>=0 && d<=25) || (d>=75 && d<=100)) ? 
				"El número está entre 0 y 25 o entre 75 y 100, incluyendo todos" : 
					"El número no está entre 0 y 25 ni entre 75 y 100, incluyendo todos";
		
		System.out.println(d);
		System.out.println(msg);
	}

}
