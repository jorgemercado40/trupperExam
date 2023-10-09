package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "Clientes" )
public class Cliente {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long idCliente;
	
	@Column( name = "nombre" )
	private String name;
	
	@Column( name = "activo" )
	private byte activo;
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getActivo() {
		return activo;
	}
	public void setActivo(byte activo) {
		this.activo = activo;
	}
}
