package conectarABD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class TestDatabaseConnection {

	public static void main(String[] args) {
		// PRUEBAS DE LOS MÉTODOS CRUD
		// Connection con = DatabaseManager.getConnection();
		// DatabaseManager.closeConnection(con);
		for (Persona p : getPersonas()) {
			System.out.println(p);
		}
		// System.out.println("1");
		// System.out.println(getPersonaPorDNI("00000000T"));
		//
		// Persona p = new Persona("Alfonsina", "Martínez", "00000000T");
		// aniadirPersona(p);
		// System.out.println("2");
		// System.out.println(getPersonaPorDNI("00000000T"));
		// modificarPersonaPorDni("", "López", "87654321B");

	}

	/**
	 * Modifica el nombre y/o apellidos de la persona con el dni que se pasa
	 * por parámetros
	 * En caso de que el nombre/apellidos no cambie o vaya vacío o nulo, no se
	 * modificará
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 */
	private static void modificarPersonaPorDni(String nombre, String apellidos, String dni) {
		Connection con = DatabaseManager.getConnection();
		String query = "UPDATE persona SET nombre = ?, apellidos = ? WHERE dni = ?;";
		try {
			if (con == null) {
				throw new SQLException("Error de conexión");
			}
			// Preparamos la consulta
			PreparedStatement stmt = con.prepareStatement(query);
			Persona p = getPersonaPorDNI(dni);
			if (null != p) {
				String nombreNuevo = p.getNombre();
				boolean modificacion = false;
				if (StringUtils.isNotBlank(nombre) && !StringUtils.equals(nombre, nombreNuevo)) {
					nombreNuevo = nombre;
					modificacion = true;
				}
				String apellidosNuevo = p.getApellidos();
				if (StringUtils.isNotBlank(apellidos) && !StringUtils.equals(apellidos, apellidosNuevo)) {
					apellidosNuevo = apellidos;
					modificacion = true;
				}
				if (modificacion) {
					// Pasamos parámetro dni
					stmt.setNString(1, nombreNuevo);
					stmt.setNString(2, apellidosNuevo);
					stmt.setNString(3, dni);
					// Ejecutamos la consulta
					stmt.executeUpdate();
					System.out.println("Se ha modificado la persona con dni: " + dni);
				} else {
					System.out.println("No se ha modificado ningún valor de la persona con dni: " + dni);
				}
			} else {
				System.out.println("No hay ninguna persona con el dni: " + dni);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeConnection(con);
		}
	}

	/**
	 * Elimina la persona con el dni pasado por parámetro, si no existe
	 * mostrará un mensaje
	 * 
	 * @param dni
	 */
	private static void eliminarPersonaPorDni(String dni) {
		Connection con = DatabaseManager.getConnection();
		String query = "DELETE FROM persona WHERE dni = ?;";
		try {
			if (con == null) {
				throw new SQLException("Error de conexión");
			}
			// Preparamos la consulta
			PreparedStatement stmt = con.prepareStatement(query);
			// Pasamos parámetro dni
			stmt.setNString(1, dni);
			// Ejecutamos la consulta
			int registrosMod = stmt.executeUpdate();
			if (registrosMod == 0) {
				System.out.println("No hay ninguna persona con el dni: " + dni);
			} else if (registrosMod == 1) {
				System.out.println("Se ha borrado una persona con dni: " + dni);
			} else {
				System.out.println("Se han borrado " + registrosMod + " personas con dni: " + dni);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeConnection(con);
		}
	}

	/**
	 * Añade una persona con el objeto Persona pasado por parámetro
	 * 
	 * @param p
	 */
	private static void aniadirPersona(Persona p) {
		Connection con = DatabaseManager.getConnection();
		String query = "INSERT INTO persona (nombre, apellidos, dni) values (?, ?, ?);";
		try {
			if (con == null) {
				throw new SQLException("Error de conexión");
			}
			// Preparamos la consulta
			PreparedStatement stmt = con.prepareStatement(query);
			// Pasamos los parámetros
			stmt.setNString(1, p.getNombre());
			stmt.setNString(2, p.getApellidos());
			stmt.setNString(3, p.getDni());
			// Ejecutamos la consulta
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeConnection(con);
		}
	}

	/**
	 * Devuelve una lista con todas las personas que hay en la tabla
	 * 
	 * @return personas
	 */
	public static List<Persona> getPersonas() {
		Connection con = DatabaseManager.getConnection();

		List<Persona> personas = new ArrayList<Persona>();
		String query = "SELECT nombre, apellidos, dni FROM persona;";
		try {
			if (con == null) {
				throw new SQLException("Error de conexión");
			}
			// Preparamos la consulta
			PreparedStatement stmt = con.prepareStatement(query);
			// Ejecutamos la consulta
			ResultSet rs = stmt.executeQuery();

			//
			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String apellidos = rs.getString("apellidos");
				String dni = rs.getString("dni");
				personas.add(new Persona(nombre, apellidos, dni));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DatabaseManager.closeConnection(con);
		return personas;
	}

	/**
	 * Devuelve la persona que tiene el dni pasado por parámetro
	 * 
	 * @param dni
	 * @return persona
	 */
	public static Persona getPersonaPorDNI(String dni) {
		Connection con = DatabaseManager.getConnection();

		Persona persona = null;
		String query = "SELECT nombre, apellidos FROM persona WHERE dni = ?;";
		try {
			if (con == null) {
				throw new SQLException("Error de conexión");
			}
			// Preparamos la consulta
			PreparedStatement stmt = con.prepareStatement(query);
			// Pasamos parámetro dni
			stmt.setNString(1, dni);
			// Ejecutamos la consulta
			ResultSet rs = stmt.executeQuery();

			//
			if (rs.next() && rs.isLast()) {
				String nombre = rs.getString("nombre");
				String apellidos = rs.getString("apellidos");
				persona = new Persona(nombre, apellidos, dni);
			} else {
				throw new SQLException("No puede existir más de una persona con el mismo DNI");
			}
		} catch (SQLException e) {
			e.getMessage();
		}
		DatabaseManager.closeConnection(con);
		return persona;
	}

}