package com.estetica.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	// 1. Atributos privados
	private int idCliente;
	private String nombre;
	private String apellido;
	private String telefono;
	private List<Cita> citas;
	
	//2. Constructor
	public Cliente(int idCliente, String nombre, String apellido, String telefono) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.citas = new ArrayList<>(); //Iniciamos la lista vacia
		
	}
	public int getIdCliente() {
		return idCliente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void agregarCita(Cita cita) {
		this.citas.add(cita);
	}
}
