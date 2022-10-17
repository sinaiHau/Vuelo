package com.tuempresa.vuelo.modelo;

import javax.persistence.*;

import lombok.*;
@Getter @Setter
public class Pasajero {
@Id
@Column(length =16)
String nombre;
}
