package com.estetica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
	private static final String URL = "jdbc:mariadb://localhost:3306/estetica_db";
	private static final String USUARIO = "root";
	private static final String PASSWORD = "Zxcvbnm1";
	
	public static Connection obtenerConexion() throws SQLException {
		return DriverManager.getConnection(URL, USUARIO, PASSWORD);
	}

}
