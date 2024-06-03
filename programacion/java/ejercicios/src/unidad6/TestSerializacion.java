package unidad6;

public class TestSerializacion {

	public static void main(String[] args) {
		Contacto contacto = new Contacto("Antonio Hernández", "+34666777888");
		Serializable.escribirObjeto(contacto);
		
		final String filePath = "ficheros/objetoSerial.dat";
		Contacto contacto = (Contacto) Serializable.leerObjeto(filePath);
		System.out.println(contacto);
	}

}
