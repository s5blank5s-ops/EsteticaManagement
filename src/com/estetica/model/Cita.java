package com.estetica.model;

// Librerias
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cita {
	
	//Creamos los atributos
private int idCita;
private LocalDate fecha;
private LocalTime hora;
private List<Servicio> servicios;

//Creamos el constructor

public Cita (int idCita, LocalDate fecha, LocalTime hora) {
	this.idCita = idCita;
	this.fecha = fecha;
	this.hora = hora;
	this.servicios = new ArrayList<>();
	}

	public int getIdCita() {
		return idCita;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void agregarServicio(Servicio s) {
		this.servicios.add(s);
	}

	//Metodo de negocio para calcular el coste total de la cita

	public double calcularTotal() {
		double total = 0;
		for (Servicio s : servicios) {
			total += s.getPrecio();
		}
		return total;
	}
}
