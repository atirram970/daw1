package crearEjecutableJava;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class holaMundo 
{

	public static void main(String[] args) 
	{		
		// Crear un objeto JFrame (ventana)
		JFrame ventana = new JFrame("Hola Mundo");

		// Crear un objeto JLabel (etiqueta) con el texto "Hola Mundo"
		JLabel etiqueta = new JLabel("Hola Mundo");

		// Añadir la etiqueta a la ventana
		ventana.add(etiqueta);

		// Establecer el tamaño de la ventana
		ventana.setSize(300, 200);

		// Establecer la operación predeterminada al cerrar la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Hacer visible la ventana
		ventana.setVisible(true);   
	}
}
