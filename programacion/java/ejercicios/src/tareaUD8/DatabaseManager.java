package tareaUD8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * La clase DatabaseManager proporciona métodos estáticos para obtener y cerrar la conexión a la base de datos.
 */
public class DatabaseManager {

	//variable para definir el estado de la conexión a la base de datos
    private static Connection connection = null;
    //variable para decir donde se ubica la base de datos
    private static final String URL = "jdbc:mysql://localhost/concesionarioBD";
    //variable con mi usuario
    private static final String USER = "atirram970";
    //variable con mi contraseña
    private static final String PASSWORD = "2104";

    /**
     * Obtiene la conexión a la base de datos.
     * 
     * @return La conexión a la base de datos.
     * @throws SQLException Si ocurre un error al establecer la conexión.
     */
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * Cierra la conexión a la base de datos.
     */
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}