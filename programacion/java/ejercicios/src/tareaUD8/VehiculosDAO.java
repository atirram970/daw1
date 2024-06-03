package tareaUD8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * La clase VehiculosDAO proporciona métodos para interactuar con la base de
 * datos de vehículos.
 */
public class VehiculosDAO {

	public int insertarVehiculo(Vehiculo v) {
	    int resultado = 0;
	    String queryBuscarMatricula = "SELECT COUNT(*) AS total FROM vehiculos WHERE matricula = ?";
	    String queryInsertar = "INSERT INTO vehiculos (marca, matricula, numKM, fechaMatriculacion, descripcion, precio, nombrePropietario, dniPropietario) "
	                         + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	    try {
	        Connection connection = DatabaseManager.getConnection();
	        
	        // Verificar si la matrícula ya existe en la base de datos
	        PreparedStatement preparedStatementBuscarMatricula = connection.prepareStatement(queryBuscarMatricula);
	        preparedStatementBuscarMatricula.setString(1, v.getMatricula());
	        ResultSet resultSet = preparedStatementBuscarMatricula.executeQuery();
	        resultSet.next();
	        int count = resultSet.getInt("total");
	        resultSet.close();
	        preparedStatementBuscarMatricula.close();
	        
	        if (count == 0) {
	            // La matrícula no existe, se puede insertar el vehículo
	            PreparedStatement preparedStatementInsertar = connection.prepareStatement(queryInsertar);
	            preparedStatementInsertar.setString(1, v.getMarca());
	            preparedStatementInsertar.setString(2, v.getMatricula());
	            preparedStatementInsertar.setInt(3, v.getNumKM());
	            preparedStatementInsertar.setDate(4, java.sql.Date.valueOf(v.getFechaMatriculacion()));
	            preparedStatementInsertar.setString(5, v.getDescripcion());
	            preparedStatementInsertar.setDouble(6, v.getPrecio());
	            preparedStatementInsertar.setString(7, v.getNombrePropietario());
	            preparedStatementInsertar.setString(8, v.getDniPropietario());
	            resultado = preparedStatementInsertar.executeUpdate();
	            preparedStatementInsertar.close();
	            
	            if(resultado == 1) {
	                System.out.println("Vehículo insertado correctamente.");
	            } else {
	                System.out.println("No se pudo insertar el vehículo.");
	            }
	        }
	        
	        connection.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return resultado;
	}

	
	/**
	 * Lista todos los vehículos almacenados en la base de datos.
	 * 
	 * @return Un conjunto de vehículos.
	 */
	public Set<Vehiculo> listarVehiculos() {
		Set<Vehiculo> vehiculos = new HashSet<>();
		String query = "SELECT * FROM vehiculos";
		try {
			Connection connection = DatabaseManager.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String marca = resultSet.getString("marca");
				String matricula = resultSet.getString("matricula");
				int numKM = resultSet.getInt("numKM");
				LocalDate fechaMatriculacion = resultSet.getDate("fechaMatriculacion").toLocalDate();
				String descripcion = resultSet.getString("descripcion");
				double precio = resultSet.getDouble("precio");
				String nombrePropietario = resultSet.getString("nombrePropietario");
				String dniPropietario = resultSet.getString("dniPropietario");
				Vehiculo vehiculo = new Vehiculo(marca, matricula, numKM, fechaMatriculacion, descripcion, precio,
						nombrePropietario, dniPropietario);
				vehiculos.add(vehiculo);
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vehiculos;
	}

	/**
	 * Busca un vehículo por su matrícula en la base de datos.
	 * 
	 * @param matricula La matrícula del vehículo a buscar.
	 * @return El vehículo encontrado o null si no se encontró ningún vehículo con
	 *         esa matrícula.
	 */
	public Vehiculo buscarVehiculo(String matricula) {
		Vehiculo vehiculo = null;
		String query = "SELECT * FROM vehiculos WHERE matricula = ?";
		try {
			Connection connection = DatabaseManager.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, matricula);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				String marca = resultSet.getString("marca");
				String matriculaDB = resultSet.getString("matricula");
				int numKM = resultSet.getInt("numKM");
				LocalDate fechaMatriculacion = resultSet.getDate("fechaMatriculacion").toLocalDate();
				String descripcion = resultSet.getString("descripcion");
				double precio = resultSet.getDouble("precio");
				String nombrePropietario = resultSet.getString("nombrePropietario");
				String dniPropietario = resultSet.getString("dniPropietario");
				vehiculo = new Vehiculo(marca, matriculaDB, numKM, fechaMatriculacion, descripcion, precio,
						nombrePropietario, dniPropietario);

				// Imprimir el resultado del método toString() del objeto Vehiculo
				System.out.println(vehiculo);
			} else {
				System.out.println("No existe ningún vehículo con la matrícula proporcionada.");
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			// Manejo de la excepción SQLException
			e.printStackTrace();
			// Si ocurre una excepción, devuelve null
			return null;
		}
		return vehiculo;
	}

	/**
	 * Elimina unvehículo de la base de datos por su matrícula.
	 *
	 * @param matricula La matrícula del vehículo a eliminar.
	 * @return true si se eliminó correctamente, false si ocurrió algún error o el
	 *         vehículo no existe.
	 */
	public boolean eliminarVehiculo(String matricula) {
		boolean eliminado = false;
		String query = "DELETE FROM vehiculos WHERE matricula = ?";
		try {
			Connection connection = DatabaseManager.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, matricula);
			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				eliminado = true;
			}
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return eliminado;
	}

//Métodos de actualización de campos del vehículo
//Estos métodos delegan la actualización en el método privado actualizarVehiculoEnBD()

	/**
	 * Actualiza un campo del vehículo en la base de datos.
	 * 
	 * @param matricula  La matrícula del vehículo a actualizar.
	 * @param campo      El nombre del campo a actualizar.
	 * @param nuevoValor El nuevo valor del campo.
	 * @return true si la actualización fue exitosa, false si falló.
	 */
	public boolean actualizarVehiculo(String matricula, String campo, String nuevoValor) {
		return actualizarVehiculoEnBD(matricula, campo, nuevoValor);
	}

	/**
	 * Actualiza un campo del vehículo en la base de datos.
	 * 
	 * @param matricula  La matrícula del vehículo a actualizar.
	 * @param campo      El nombre del campo a actualizar.
	 * @param nuevoValor El nuevo valor del campo.
	 * @return true si la actualización fue exitosa, false si falló.
	 */
	public boolean actualizarVehiculo(String matricula, String campo, int nuevoValor) {
		return actualizarVehiculoEnBD(matricula, campo, nuevoValor);
	}

	/**
	 * Actualiza un campo del vehículo en la base de datos.
	 * 
	 * @param matricula  La matrícula del vehículo a actualizar.
	 * @param campo      El nombre del campo a actualizar.
	 * @param nuevoValor El nuevo valor del campo.
	 * @return true si la actualización fue exitosa, false si falló.
	 */
	public boolean actualizarVehiculo(String matricula, String campo, double nuevoValor) {
		return actualizarVehiculoEnBD(matricula, campo, nuevoValor);
	}

	/**
	 * Actualiza un campo del vehículo en la base de datos.
	 * 
	 * @param matricula  La matrícula del vehículo a actualizar.
	 * @param campo      El nombre del campo a actualizar.
	 * @param nuevoValor El nuevo valor del campo.
	 * @return true si la actualización fue exitosa, false si falló.
	 */
	public boolean actualizarVehiculo(String matricula, String campo, LocalDate nuevoValor) {
		return actualizarVehiculoEnBD(matricula, campo, java.sql.Date.valueOf(nuevoValor));
	}

	/**
	 * Actualiza un campo del vehículo en la base de datos.
	 * 
	 * @param matricula  La matrícula del vehículo a actualizar.
	 * @param campo      El nombre del campo a actualizar.
	 * @param nuevoValor El nuevo valor del campo.
	 * @return true si la actualización fue exitosa, false si falló.
	 */
	private boolean actualizarVehiculoEnBD(String matricula, String campo, Object nuevoValor) {
		boolean actualizado = false;
		String query = "UPDATE vehiculos SET " + campo + " = ? WHERE matricula = ?";
		try {
			Connection connection = DatabaseManager.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			if (nuevoValor instanceof String) {
				preparedStatement.setString(1, (String) nuevoValor);
			} else if (nuevoValor instanceof Integer) {
				preparedStatement.setInt(1, (Integer) nuevoValor);
			} else if (nuevoValor instanceof Double) {
				preparedStatement.setDouble(1, (Double) nuevoValor);
			} else if (nuevoValor instanceof java.sql.Date) {
				preparedStatement.setDate(1, (java.sql.Date) nuevoValor);
			}
			preparedStatement.setString(2, matricula);
			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				actualizado = true;
			}
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actualizado;
	}
}