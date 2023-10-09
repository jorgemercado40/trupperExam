package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Compras;
import com.example.service.TiendaService;

@RestController
public class TiendaController {
	
	@Autowired
	private TiendaService tiendaService;
	
	@PostMapping( "/compras" )
	public ResponseEntity<Compras> saveCompras( @RequestBody Compras compras ){
		return ResponseEntity.ok().body( this.tiendaService.saveCompra(compras) );
	}
	
	@GetMapping( "/compras({id}" )
	public ResponseEntity<List<Compras>> getComprasById( @PathVariable long id ){
		return ResponseEntity.ok().body( this.tiendaService.getComprasById(id) );
	}
	
	@PutMapping( "/compras/{id}" )
	public ResponseEntity<Compras> updateCompras( @PathVariable long id, @RequestBody Compras compras ){
		return ResponseEntity.ok().body( this.tiendaService.updatePrecio(id, compras) );
	}
	
	@DeleteMapping( "compras/{id}" )
	public ResponseEntity<?> deleteCompras( @PathVariable long id ){
		this.tiendaService.deleteListaCompra(id);
		return ( ResponseEntity<?> ) ResponseEntity.status( HttpStatus.OK );
	}
}
