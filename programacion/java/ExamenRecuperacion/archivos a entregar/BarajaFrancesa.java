
public class BarajaFrancesa 
{

	public static void main(String[] args) 
	{
		//declaración arrays cartas
		String numCarta [] = 
			{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		String tipoCarta [] =
			{"picas","corazones","diamantes","tréboles"};
		
		//variable que nos permite ejecutar el bucle
		int contador = 1;
		
		//topes del aleatorizador
		int minimo = 0;
		int maxNumero = 8;
		int maxLetra = 3;
		
		int numAleatorioNumero = (int) (Math.random() * (maxNumero - minimo + 1) + minimo);
		int numAleatorioLetra = (int) (Math.random() * (maxLetra - minimo + 1) + minimo);
		
		//cuerpo del bucle
		while(contador < 4)
		{
			//declaración del aleatorizador
			
			int numAleatorioNumeroComprobar = numAleatorioNumero;
			int numAleatorioLetraComprobar = numAleatorioLetra;
			
			if(numAleatorioNumero!=numAleatorioNumeroComprobar && numAleatorioLetra!=numAleatorioLetraComprobar)
			{
				System.out.println(numCarta[numAleatorioNumero] + " de " + tipoCarta[numAleatorioLetra]);
				contador++;
			}
		}
		
	}
}
