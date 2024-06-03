package unidad6.edificio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;

import unidad6.edificio_corregido.EdificioException;
import unidad6.edificio_corregido.Registro;

public class Edificio {
	// Lista de personas registradas anteriormente en el edificio
	private Map<String, Persona> listaVisitantes;
	// Lista de personas autorizadas para la zona privada
	private Set<Persona> listaZonaPrivada;
	private List<Registro> registroEntradaSalida;
	private List<Registro> registroEntradaSalidaVIP;
	// Conjunto de dni de las personas que se encuentran actualmente en el
	// edificio
	private Set<String> personasEnEdificio;
	// Conjunto de dni de las personas que se encuentran actualmente en la
	// zona privada
	private Set<String> personasEnZonaPrivada;

	public Edificio() {
		this.listaVisitantes = new TreeMap<String, Persona>();
		this.listaZonaPrivada = new TreeSet<Persona>();
		this.personasEnEdificio = new HashSet<String>();
		this.personasEnZonaPrivada = new HashSet<String>();
		this.registroEntradaSalida = new ArrayList<Registro>();
		this.registroEntradaSalidaVIP = new ArrayList<Registro>();
	}

	/**
	 * @return the listaVisitantes
	 */
	public Map<String, Persona> getListaVisitantes() {
		return listaVisitantes;
	}

	/**
	 * @param listaVisitantes the listaVisitantes to set
	 */
	public void setListaVisitantes(Map<String, Persona> listaVisitantes) {
		this.listaVisitantes = listaVisitantes;
	}

	/**
	 * @return the listaZonaPrivada
	 */
	public Set<Persona> getListaZonaPrivada() {
		return listaZonaPrivada;
	}

	/**
	 * @param listaZonaPrivada the listaZonaPrivada to set
	 */
	public void setListaZonaPrivada(Set<Persona> listaZonaPrivada) {
		this.listaZonaPrivada = listaZonaPrivada;
	}

	/**
	 * @return the registroEntradaSalida
	 */
	public List<Registro> getRegistroEntradaSalida() {
		return registroEntradaSalida;
	}

	/**
	 * @param registroEntradaSalida the registroEntradaSalida to set
	 */
	public void setRegistroEntradaSalida(List<Registro> registroEntradaSalida) {
		this.registroEntradaSalida = registroEntradaSalida;
	}

	/**
	 * @return the registroEntradaSalidaVIP
	 */
	public List<Registro> getRegistroEntradaSalidaVIP() {
		return registroEntradaSalidaVIP;
	}

	/**
	 * @param registroEntradaSalidaVIP the registroEntradaSalidaVIP to set
	 */
	public void setRegistroEntradaSalidaVIP(List<Registro> registroEntradaSalidaVIP) {
		this.registroEntradaSalidaVIP = registroEntradaSalidaVIP;
	}

	/**
	 * @return the personasEnEdificio
	 */
	public Set<String> getPersonasEnEdificio() {
		return personasEnEdificio;
	}

	/**
	 * @param personasEnEdificio the personasEnEdificio to set
	 */
	public void setPersonasEnEdificio(Set<String> personasEnEdificio) {
		this.personasEnEdificio = personasEnEdificio;
	}

	/**
	 * @return the personasEnZonaPrivada
	 */
	public Set<String> getPersonasEnZonaPrivada() {
		return personasEnZonaPrivada;
	}

	/**
	 * @param personasEnZonaPrivada the personasEnZonaPrivada to set
	 */
	public void setPersonasEnZonaPrivada(Set<String> personasEnZonaPrivada) {
		this.personasEnZonaPrivada = personasEnZonaPrivada;
	}

	public void nuevaEntrada(Registro entrada) throws EdificioException {
		if (this.personasEnEdificio.contains(entrada.getPersona().getDni())) {
			throw new EdificioException("La persona ya se encuentra en el edificio");
		}
		// Si es la primera vez que visita el edificio, lo registramos en la
		// lista de visitantes
		if (null == this.listaVisitantes.get(entrada.getPersona().getDni())) {
			this.listaVisitantes.put(entrada.getPersona().getDni(), entrada.getPersona());
		}
		this.registroEntradaSalida.add(entrada);
		this.personasEnEdificio.add(entrada.getPersona().getDni());
		System.out.println("Persona con dni: " + entrada.getPersona().getDni() + " accede al edificio");
	}

	/**
	 * Devuelve la persona con el dni pasado por parámentro
	 * o devuelve null si esa persona nunca ha visitado el edificio
	 * 
	 * @param dni
	 * @return
	 */
	public Persona getVisitante(String dni) {
		return this.listaVisitantes.get(dni);
	}

	/**
	 * Imprimimos los datos de los visitantes que se encuentran en el edificio
	 */
	public void imprimirVisitantesActuales() {
		for (String dni : this.personasEnEdificio) {
			System.out.println(this.listaVisitantes.get(dni));
		}

	}

	/**
	 * Registra la salida de un visitante y lo borra de la lista de personas
	 * actualmente en el edificio
	 * 
	 * @param salida
	 */
	public void salidaVisitante(Registro salida) {
		// Añade el registro de salida
		this.registroEntradaSalida.add(salida);
		// Borra el visitante de la lista de personas en el edificio
		this.personasEnEdificio.remove(salida.getPersona().getDni());
		// En caso de que el edificio tenga acceso directo a la zona privada,
		// al salir del edificio también borramos al visitante de la zona
		// privada
		this.personasEnZonaPrivada.remove(salida.getPersona().getDni());
		System.out.println("Persona con dni: " + salida.getPersona().getDni() + " abandona el edificio");
	}

	/**
	 * Registra un nuevo visitante con acceso a la zona privada
	 * 
	 * @param visitanteVIP
	 */
	public void altaVIP(Persona visitanteVIP) {
		// COmpruebo si la persona ya está en listaZonaPrivada
		this.listaVisitantes.put(visitanteVIP.getDni(), visitanteVIP);
		if(this.listaZonaPrivada.add(visitanteVIP)) {			
			System.out.println("Persona con dni: " + visitanteVIP.getDni() + " registrada en la zona privada");
		} else {			
			System.out.println("No se registra la Persona con dni: " + visitanteVIP.getDni() + " porque ya se encontraba registrada");
		}
	}

	/**
	 * Devuelve la persona con acceso a la zona privada del dni que se pasa
	 * por parámetro.
	 * En caso de que el dni no se encuentre registrado en la zona privada,
	 * devolverá nulo.
	 * 
	 * @param dniEntradaVIP
	 * @return personaVIP
	 */
	public Persona getVisitanteVIP(String dniEntradaVIP) {
		Iterator<Persona> itString = this.listaZonaPrivada.iterator();
		boolean encontrado = false;
		Persona personaVIP = null;
		while (itString.hasNext() && !encontrado) {
			personaVIP = itString.next();
			if (StringUtils.equalsIgnoreCase(dniEntradaVIP, personaVIP.getDni())) {
				encontrado = true;
			}
		}
		if (!encontrado) {
			personaVIP = null;
		}
		return personaVIP;

	}

	public void nuevaEntradaVIP(Registro entradaVIP) throws EdificioException {
		if (this.personasEnEdificio.contains(entradaVIP.getPersona().getDni())) {
			throw new EdificioException("La persona ya se encuentra en el edificio");
		}
		this.registroEntradaSalidaVIP.add(entradaVIP);
		this.personasEnZonaPrivada.add(entradaVIP.getPersona().getDni());
		// En caso de que el edificio tenga acceso directo a la zona privada,
		// lo añadimos pues en caso de que ya esté dentro del edificio no
		// afectará en nada
		this.personasEnEdificio.add(entradaVIP.getPersona().getDni());
		System.out.println("Persona con dni: " + entradaVIP.getPersona().getDni() + " accede a la zona privada");
	}

	public void salidaVisitanteVIP(Registro salidaVIP) {
		// Añade el registro de salida VIP
		this.registroEntradaSalidaVIP.add(salidaVIP);
		// Borra el visitante de la lista de personas en el edificio
		this.personasEnZonaPrivada.remove(salidaVIP.getPersona().getDni());
		System.out.println("Persona con dni: " + salidaVIP.getPersona().getDni() + " abandona la zona privada");
	}

	/**
	 * Imprimimos los datos de los visitantes que se encuentran en la zona
	 * privada
	 */
	public void imprimirVisitantesVIPActuales() {
		for (String dni : this.personasEnZonaPrivada) {
			System.out.println(this.listaVisitantes.get(dni));
		}
	}
}