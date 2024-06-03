package unidad6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ej11 {

	public static void main(String[] args) {
		//Crea una aplicación que almacene los datos básicos de un vehículo como la 
		//matricula (String), marca (String), tamaño de depósito (double) y modelo 
		//(String) en ese orden y de uno en uno usando la clase DataInputStream.
		//Los datos anteriores datos se pedirán por teclado y se irán añadiendo al fichero 
		//(no se sobrescriben los datos) cada vez que ejecutemos la aplicación.
		//El fichero siempre será el mismo, en todos los casos.
		//Muestra todos los datos de cada coche por consola. Un ejemplo de salida de 
		//información puede ser este:
		//El vehículo tiene una matrícula 5582CRT, su marca es Seat y el modelo Ibiza. El 
		//tamaño del depósito es de 50,25 litros
		
		try {
			File f = new File("ficheros/vehiculos.txt");
			FileOutputStream fos = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeLong(4l);
			dos.close();
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			int i = dis.readInt();
			System.out.println(i);
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
