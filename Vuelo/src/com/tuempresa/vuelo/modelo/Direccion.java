package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import jdk.jfr.*;
import lombok.*;

@Enabled @Getter @Setter
public class Direccion {

	
	@Column(length = 10)
	String calle;
	
	@Column(length = 15)
	String colonia;
	
	@Column(length = 20)
	String ciudad;
	
	@Column(length = 15)
	String pais;
}
