package com.estetica.dao;

import com.estetica.model.Cliente;
import java.util.List;


public interface ClienteDAO {
	
	// 1. Crear (Instertar un nuevo cliente)
	boolean insertar(Cliente cliente);
	
	// 2. Leer (Obtener un cliente por su ID o listar todos)
	Cliente obtenerPorId(int idCliente);
	List<Cliente> obtenerTodos();
	
	// 3. Actualizar (Actualizar los datos de un cliente existente)
	boolean actualizar(Cliente cliente);
	
	// 4 Borrar (Eliminar un cliente por su ID)
	boolean eliminar(int idCliente);

}
