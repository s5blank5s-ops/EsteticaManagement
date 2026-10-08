package com.estetica.app;

import java.time.LocalDate;
import java.time.LocalTime;

import com.estetica.model.*;

public class Main {

	public static void main(String[] args) {
		
		//Creamos al cliente
		Cliente cliente1 = new Cliente(1, "Shadya", "Gomez", "624511417");
		
		//Creamos la lista de servicios
		Servicio s1 = new Servicio(101, "Manicura", 30.0);
		Servicio s2 = new Servicio(102, "Masaje_una_hora", 50.0);
		
		//Creamos la cita
		Cita cita1 = new Cita(1, LocalDate.now(), LocalTime.of(10, 30));
		
		//Añadimos los servicios a la cita
		cita1.agregarServicio(s1);
		cita1.agregarServicio(s2);
		
		//Asignamos al cliente a la cita
		cliente1.agregarCita(cita1);
		
		//Mostrar por pantalla resumen de la cita
		System.out.println("---Resumen de la cita---");
		System.out.println("Cliente: " + cliente1.getNombre());
		System.out.println("Fecha de la cita: " + cita1.getFecha() + "a las " + cita1.getHora());
		System.out.println("Servicios contratados: ");
		for (Servicio s : cita1.getServicios()) {
			System.out.println(" - " + s.getNombreServicio() + ": " + s.getPrecio() + "€");
		}
		
		System.out.print("Total a pagar: " + cita1.calcularTotal() + "€");

	}

}
