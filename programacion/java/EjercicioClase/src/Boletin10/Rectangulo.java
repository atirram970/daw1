package Boletin10;

class Rectangulo {
    private Punto esquinaSuperiorIzquierda;
    private double ancho;
    private double alto;

    public Rectangulo(Punto esquinaSuperiorIzquierda, double ancho, double alto) {
        this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return ancho * alto;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    // Método para verificar si un punto está dentro del rectángulo
    public boolean puntoEstaDentro(Punto punto) {
        double puntoX = punto.getX();
        double puntoY = punto.getY();

        double rectanguloX = esquinaSuperiorIzquierda.getX();
        double rectanguloY = esquinaSuperiorIzquierda.getY();

        return puntoX >= rectanguloX && puntoX <= rectanguloX + ancho &&
               puntoY >= rectanguloY && puntoY <= rectanguloY + alto;
    }
    
    public void sumaRectangulo(Rectangulo rect)
    {
    	this.alto += rect.getAlto();
    	this.ancho += rect.getAncho();
    }   
    
    public class Main 
    {
        public static void main(String[] args) {
            // Crear dos puntos
            Punto punto1 = new Punto(1, 2);
            Punto punto2 = new Punto(3, 4);

            // Sumar y restar puntos
            Punto resultadoSuma = punto1.sumar(punto2);
            Punto resultadoResta = punto1.restar(punto2);

            System.out.println("Resultado de la suma: (" + resultadoSuma.getX() + ", " + resultadoSuma.getY() + ")");
            System.out.println("Resultado de la resta: (" + resultadoResta.getX() + ", " + resultadoResta.getY() + ")");

            // Crear un rectángulo
            Rectangulo rectangulo = new Rectangulo(new Punto(1, 1), 5, 3);

            // Calcular y mostrar el área del rectángulo
            double areaRectangulo = rectangulo.calcularArea();
            System.out.println("Área del rectángulo: " + areaRectangulo);

            // Calcular y mostrar el perímetro del rectángulo
            double perimetroRectangulo = rectangulo.calcularPerimetro();
            System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);

            // Verificar si un punto está dentro del rectángulo
            Punto puntoPrueba = new Punto(3, 2);
            boolean puntoDentro = rectangulo.puntoEstaDentro(puntoPrueba);
            System.out.println("¿El punto está dentro del rectángulo? " + puntoDentro);
        }

    }
}