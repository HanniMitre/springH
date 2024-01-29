package com.segundoh.empleos.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.segundoh.empleos.model.Vacante;


@Controller
public class HomeController {
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Vacante> lista = getVacantes();
		model.addAttribute("vacantes", lista);
		return "tabla";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante();
		vacante.setNombre("Ingeniero de cominicaciones");
		vacante.setDescripcion("Se solicita ingeniero para dar soporte a intranet");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);
		model.addAttribute("vacante", vacante);
		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero en Sistemas");
		lista.add("Auxiliar de Contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");
		
		model.addAttribute("empleos", lista);
		
		return "listado";
	}
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
	    /*
		model.addAttribute("mensaje", "Bienvenidos a Empleos App");
		model.addAttribute("fecha", new Date());
	    */
		
		String nombre = "Auxiliar de Contabilidad";
		Date fechaPub = new Date();
		double salario = 9000.0;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);

		return "home";
	}
	
	/**
	 * Metodo que regresa una lista de objetos de tipo Vacante
	 * @return
	 */
	 
  private List <Vacante> getVacantes() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	List <Vacante> lista = new LinkedList<Vacante>();
	try {
		//Creamos la oferta de trabajo 1.
		Vacante vacante1 = new Vacante();
		vacante1.setId(1);
		vacante1.setNombre("Ingeniero Civil"); // Titulo de la vacante
		vacante1.setDescripcion("Solicitamos Ing. Civil para diseñar puente peatonal.");
		vacante1.setFecha(sdf.parse("24-01-2024"));
		vacante1.setSalario(8500.0);
		vacante1.setDestacado(1);
		vacante1.setImagen("empresa1.png");
		
		//Creamos la oferta de trabajo 2.
		Vacante vacante2 = new Vacante();
		vacante2.setId(2);
		vacante2.setNombre("Contador Publico"); // Titulo de la vacante
		vacante2.setDescripcion("Solicitamos contador publico.");
		vacante2.setFecha(sdf.parse("25-01-2024"));
		vacante2.setSalario(8700.0);
		vacante2.setDestacado(0);
		vacante2.setImagen("empresa2.png");

		//Creamos la oferta de trabajo 3.
		Vacante vacante3 = new Vacante();
		vacante3.setId(3);
		vacante3.setNombre("Ingeniero Electrico"); // Titulo de la vacante
		vacante3.setDescripcion("Solicitamos Ing. Electrico.");
		vacante3.setFecha(sdf.parse("26-01-2024"));
		vacante3.setSalario(9500.0);
		vacante3.setDestacado(0);

		//Creamos la oferta de trabajo 4.
		Vacante vacante4 = new Vacante();
		vacante4.setId(4);
		vacante4.setNombre("Diseñador Grafico"); // Titulo de la vacante
		vacante4.setDescripcion("Solicitamos Diseñador Grafico para diseñar.");
		vacante4.setFecha(sdf.parse("27-01-2024"));
		vacante4.setSalario(5700.0);
		vacante4.setDestacado(1);
		vacante4.setImagen("empresa3.png");

		/**
		 * Agregamos  los 4 objetos de tipo Vacante a la lista...
		 */
		lista.add(vacante1);
		lista.add(vacante2);
		lista.add(vacante3);
		lista.add(vacante4);
		
	} catch (ParseException e) {
		System.out.println("Error severo: " + e.getMessage());
	}
	return lista;
		
		}
	
	}
	

