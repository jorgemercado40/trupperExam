package com.example.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "ListaCompras" )
public class Compras {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long idLista;
	
	
	//private Cliente cliente;
	
	@Column( name = "nombre" )
	private String nombre;
	
	@CreationTimestamp
	private Date fechaRegistro;
	
	@UpdateTimestamp
	private Date fechaActualizacion;
	
	@Column( name = "activo" )
	private byte activo;
	
	public long getIdLista() {
		return idLista;
	}
	public void setIdLista(long idLista) {
		this.idLista = idLista;
	}

	/*
	 * public Cliente getCliente() { return cliente; } public void
	 * setCliente(Cliente cliente) { this.cliente = cliente; }
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public byte getActivo() {
		return activo;
	}
	public void setActivo(byte activo) {
		this.activo = activo;
	}
	
}
