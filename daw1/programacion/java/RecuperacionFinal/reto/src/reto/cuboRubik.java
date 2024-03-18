package reto;

public class cuboRubik {
    public static void main(String[] args) {
    	try {
    		if (args[0].length()>6) {
    			throw new IllegalArgumentException();
    		}
    		int casos = Integer.parseInt(args[0]);
    		System.out.println(casos);
    		if(casos == args.length-1) {
    			for (int index = 0; index < args.length; index++) {
					//calculamos solucion
    				int entrada = Integer.parseInt(args[index]);
    				int cuadrosPorCara = entrada*entrada*entrada - (entrada-2)*(entrada-2)*(entrada-2);
    				//esquinas 4
    				//centrales (entrada-2)*(entrada-2)
    				//bordes laterales
    				
				}
    		}
    	}
    	catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static int calculoBordes(int numCuadrados) {
    	int result = 0;
    	if(numCuadrados == 3) {
    		result += 1;
    	}
    	else if(numCuadrados > 3) {
    		result = calculoBordes(numCuadrados-1);
    	}
    	return result;
	}
}
