package unidad6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploDataXputStream {

	public static void main(String[] args) {
		try {
			File f = new File("ficheros/datos_binarios.txt");
			FileOutputStream fos = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fos);
			//equivale a --> 
			//DataOutputStream dos = new DataOutputStream(new FileOutputStream("ficheros/datos_binarios.txt"));
			dos.writeLong(4l);
			dos.close();
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			int i = dis.readInt();
			System.out.println(i);
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
