package com.tuempresa.vuelo.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity @Getter @Setter
public class Vuelo {
    @Id
    @Column(length = 12)@Required
    String origen;
   
    @Column(length = 12)@Required
      String destino;
    
    @Column(length = 4)@Required
    String hora;
    
    @Required
   	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
   	LocalDate fecha;
    
    //mensaje para confirmar de que se estan subiendo mis cambios
    
    
	
    
}
