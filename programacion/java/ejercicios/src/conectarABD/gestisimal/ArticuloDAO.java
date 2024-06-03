package conectarABD.gestisimal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ArticuloDAO {
	public Set<Articulo> obtenerArticulos() {
		Set<Articulo> articulos = new HashSet<Articulo>();
		Connection con = DatabaseManager.getConnection();
		String query = "SELECT codigo, descr, pre_compra, pre_venta, stock FROM articulos;";
		try {
			if (con == null) {
				throw new SQLException("Error de conexión");
			}
			// Preparamos la consulta
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Articulo art = new Articulo(rs.getNString("codigo"), rs.getNString("descr"), rs.getFloat("pre_compra"), rs.getFloat("pre_venta"), rs.getInt("stock"));
				//Articulo art = new Articulo(rs.getNString(1), rs.getNString(2), rs.getFloat(3), rs.getFloat(4), rs.getInt(5));
				articulos.add(art);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {			
			DatabaseManager.closeConnection(con);
		}
		return articulos;
	}
}
