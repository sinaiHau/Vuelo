package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class Aerolinea {
	
	@Id
	
	@Column(length = 15)
	String aerolinea;

}
