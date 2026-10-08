package com.estetica.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
	private static final Properties props = new Properties();
	
	static {
		try (FileInputStream fis = new FileInputStream("config.properties")) {
			props.load(fis);
		} catch (IOException e) {
			throw new RuntimeException("No se pudo leer config.properties", e);
		}
	}
	
	public static Connection obtenerConexion() throws SQLException {
		return DriverManager.getConnection(
				props.getProperty("db.url"),
				props.getProperty("db.user"),
				props.getProperty("db.password"));
	}
}
