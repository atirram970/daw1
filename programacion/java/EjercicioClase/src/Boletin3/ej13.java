/**
 * 
 */
package Boletin3;

import java.util.Scanner;

/**
 * 
 */
public class ej13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Eleccion Maquina
		double ELM=Math.floor(Math.random()*3);
		//System.out.println(ElM);
		Scanner scannerNUM=new Scanner(System.in);
		System.out.println("Introduce (pidra,papel o tijera): ");
		String eleccionJugador=scannerNUM.next();
		
		//jugador siempre piedra
		if (eleccionJugador.equals("piedra") & ELM==1) 
		{
			System.out.println(eleccionJugador+" vs "+"piedra: "+"Empate");
		}
		else if (eleccionJugador.equals("piedra") & ELM==2) 
		{
			System.out.println(eleccionJugador+" vs "+"papel: "+"Gana el ordenador");
		}
		else if (eleccionJugador.equals("piedra") & ELM==3) 
		{
			System.out.println(eleccionJugador+" vs "+"tijera: "+"Gana el jugador");
		}
		
		//jugador siempre papel
		if (eleccionJugador.equals("papel") && ELM==1) 
		{
			System.out.println(eleccionJugador+" vs "+" piedra: "+"Gana el jugador");
		}
		else if (eleccionJugador.equals("papel") && ELM==2) 
		{
			System.out.println(eleccionJugador+" vs "+"papel: "+"Empate");
		}
		else if (eleccionJugador.equals("papel") && ELM==3) 
		{
			System.out.println(eleccionJugador+" vs "+"tijera: "+"Gana el ordenador");
		}
		
		//jugador siempre tijera
		if (eleccionJugador.equals("tijera") && ELM==1) 
		{
			System.out.println(eleccionJugador+" vs "+"piedra: "+"Gana el ordenador");
		}
		else if (eleccionJugador.equals("tijera") && ELM==2) 
		{
			System.out.println(eleccionJugador+" vs "+"papel: "+"Gana el jugador");
		}
		else if (eleccionJugador.equals("tijera") && ELM==3) 
		{
			System.out.println(eleccionJugador+" vs "+"tijera: "+"Empate");
		}
		scannerNUM.close(); 
	}

}
