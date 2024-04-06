package unidad6.listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {

	//Creación Productos por defecto
	Producto p1 = new Producto(1, "Camiseta", "Ropa", 15.99, 50);
    Producto p2 = new Producto(2, "Pantalón", "Ropa", 29.99, 30);
    Producto p3 = new Producto(3, "Zapatillas", "Calzado", 39.99, 20);
	
	private ArrayList<Producto> lista = new ArrayList<Producto>();
	static Scanner scan = new Scanner(System.in);

	//Devuelve el tamaño de la lista
    public int tamanio(){
    	return lista.size();
    }

    //Añade un elemento tipo Producto en la lista
    public void adicionar(Producto e){
    	lista.add(e);
    }
    
    //Borra un elemento indicando la posición
    public void eliminar(int pos){			
    	lista.remove(pos);
    }
    
    //Devuelve el elemento de una posición
    public Producto obtener(int pos){
		return lista.get(pos);
    }
    
	//Recorre la lista y busca si el código del producto
	// si coincide con cod devuelve el producto 
	//y si no está el la lista devuelve null
    public Producto buscar(int cod){
    	for (Producto producto : lista) {
			if(producto.ver_codigo() == cod) {
				return producto;
			}
		}
    	return null;
    }  

	//Muestra todos los elementos de la lista
    public void mostrar_todo() {
    	System.out.println("Contenido de la lista: ");
    	for (Producto producto : lista) {
			System.out.println(producto);
		}
    }
    
    //Aumenta el precio del producto indicando la posición
    public void aumentoPrecio(int pos) {
    	
    }

 
}