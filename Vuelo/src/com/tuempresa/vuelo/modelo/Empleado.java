package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class Empleado {

	@Id
	
	@Column(length = 15)
	String nombre;
	
	@Column(length = 20)
	String puesto;
}
