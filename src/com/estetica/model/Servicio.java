package com.estetica.model;

public class Servicio {
	
	private int idServicio;
	private String nombreServicio;
	private double precio;
	
	// Creamos el constructor
	
	public Servicio(int idServicio, String nombreServicio, double precio) {
		this.idServicio = idServicio;
		this.nombreServicio = nombreServicio;
		this.precio = precio;
	}
	
	public int getIdServicio() {
		return idServicio;
	}
	
	public String getNombreServicio() {
		return nombreServicio;
	}
	
	public double getPrecio() {
		return precio;
	}

}
