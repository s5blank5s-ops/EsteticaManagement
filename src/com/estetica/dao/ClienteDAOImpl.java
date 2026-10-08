package com.estetica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.estetica.model.Cliente;

public class ClienteDAOImpl implements ClienteDAO {

	@Override
	public boolean insertar(Cliente cliente) {
		// 1. Definimos la consulta SQL
		String sql = "INSERT INTO clientes (nombre, apellido, telefono) VALUES (?, ?, ?)";
		
		// 2. Abrimos recursos y ejecutamos
		try (Connection conn = ConexionBD.obtenerConexion();
			PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellido());
			ps.setString(3, cliente.getTelefono());
			
			// 1. Ejectuamos la consulta SQL
			int filasAfectadas = ps.executeUpdate();
			
			// 2. Si se ha insertado al menos 1 fila, devolvemos true
			return filasAfectadas > 0;

		} catch (SQLException e) {
			System.err.println("Error: " + e.getMessage());
			return false;
		}
	}

	@Override
	public Cliente obtenerPorId(int idCliente) {
		return null;
	}

	@Override
	public List<Cliente> obtenerTodos() {
		return null;
	}

	@Override
	public boolean actualizar(Cliente cliente) {
		return false;
	}

	@Override
	public boolean eliminar(int idCliente) {
		return false;
	}

}
