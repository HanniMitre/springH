package com.segundoh.empleos.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data //  get and set 
public class Vacante {
	private Integer id;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private Double salario;
	private Integer destacado;
	private String imagen="no-image.png";
}
