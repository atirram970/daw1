package recuperacionDesarrolloClases;

public class TestVivienda {

	public static void main(String[] args) {
		Propietario Propietario12345678A = new Propietario("Miguel Molina","12345678A");
		Propietario Propietario87654321B = new Propietario("Paco Robles","87654321B");		
		Apartamento Apartamento10000 = new Apartamento("Calle Cal y Canto Nº1", 100, "Miguel Molina", 1, 'A');
		Apartamento Apartamento25432 = new Apartamento("Avenida de los Naranjos Nº3", 100, "Paco Robles", 0, 'C');
		Casa casa24237 = new Casa("Calle Calvo Sotelo", 100, "Miguel Molina", true, true);
		Casa casa28249 = new Casa("Calle José Martínez Romero Nº15", 100, "Miguel Molina", false, false);
		
		//Mostrar Info propietarios
		System.out.println(Propietario12345678A);
		System.out.println("===============================");
		System.out.println(Propietario87654321B);
		System.out.println("===============================");
		
		//Mostrar Info Apartamentos
		System.out.println(Apartamento10000);
		System.out.println("===============================");
		System.out.println(Apartamento25432);
		System.out.println("===============================");
		
		//Mostrar Info Casas
		System.out.println(casa24237);
		System.out.println("===============================");
		System.out.println(casa28249);
		System.out.println("===============================");
		
		//Calcular Cuota
		System.out.println(Apartamento10000.calcularCuota());
		System.out.println("===============================");
		System.out.println(Apartamento25432.calcularCuota());
		System.out.println("===============================");
		System.out.println(casa24237.calcularCuota());
		System.out.println("===============================");
		System.out.println(casa28249.calcularCuota());
		System.out.println("===============================");
	}

}