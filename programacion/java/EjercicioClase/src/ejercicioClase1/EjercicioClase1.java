/**
 * 
 */
package ejercicioClase1;

/**
 * 
 */
public class EjercicioClase1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//creacion y declaracion variables
		double d1=10;
		double d2=20;
		
		//cuerpo script
		
		//primera operación
		double result1=-4+d1*2;
		System.out.println(" Restamos 4 al doble de d1: " + result1);
		
		//segunda operación
		double result2=(d1-4)*2;
		System.out.println(" Restamos 4 a d1 y calculamos el doble: " + result2);
		
		//tercera operación
		double result3=(2+d1)/12+d2;
		System.out.println(" Sumamos 2 a d1 y dividimos por 12, a todo ello sumamos d2: " + result3);
		
		//cuarta operación
		double result4=d2/d1/2;
		System.out.println(" Dividimos d2 entre d1 y todo ello dividido entre 2: " + result4);
		
		//quinta operación
		double result5=d2/(d1/2);
		System.out.println(" Dividimos d2 entre la mitad de d1: " + result5);
		
		//sexta operación
		double result6=d1/4-d2;
		System.out.println(" Restamos a d2 un cuarto de d1: " + result6);
		
		//septima operación
		double result7=(d2-d1)/4;
		System.out.println(" Restamos d1 a d2 y todo ello lo dividimos entre 4 " + result7);
		
		//octava operación
		double result8=d2/d1*2;
		System.out.println(" Dividimos d2 entre d1 y todo ello multiplicado por 2 " + result8);
		
		//novena operación
		double result9=d2/(d1*2);
		System.out.println(" Dividimos d2 entre el doble de d1" + result9);
		
		//décima operación
		double result10=d2*2-d1/4;
		System.out.println(" Restamos al doble de d2 un cuarto de d1: " + result10);
		
		//oncevaba operación
		double result11=d2*(100-d1);
		System.out.println(" Multiplicamos d2 por 100 menos d1 " + result11);
		
		//doceava operación
		double result12=(d2*50+d1)/10;
		System.out.println(" Multiplicamos d2 por 50 más d1, y todo ello lo dividimos por 10 " + result12);
	}

}
