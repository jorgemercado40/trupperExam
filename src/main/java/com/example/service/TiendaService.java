package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Compras;
import com.example.repository.ClienteRepository;
import com.example.repository.ComprasRepository;
import com.example.repository.ProductoRepository;

@Service
@Transactional
public class TiendaService {
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@Autowired
	private ComprasRepository comprasRepo;
	
	@Autowired
	private ProductoRepository productosRepo;
	
	public Compras saveCompra( Compras compra ) {
		return comprasRepo.save( compra );
	}
	
	public List<Compras> getComprasById( long id ){
		
		Optional<Compras> comprasDb = comprasRepo.findById( id );
		
		if( comprasDb.isPresent() ) {
			return (List<Compras>) comprasDb.get();
		}else {
			return null;
		}
		
	}
	
	public Compras updatePrecio( long id , Compras compra ) {
		
		Optional<Compras> comprasDb = comprasRepo.findById( id );
		
		if( comprasDb.isPresent() ) {
			Compras newCompra = new Compras();
			newCompra.setIdLista(id);
			newCompra.setNombre( compra.getNombre() );
			newCompra.setActivo( compra.getActivo() );
			comprasRepo.save( newCompra );
		}else {
			// Elemento no a actualizar no existe
		}
		return null;
	}
	
	public void deleteListaCompra( long id) {
		
		Optional<Compras> comprasDb = comprasRepo.findById( id );
			
		if( comprasDb.isPresent() ) {
			comprasRepo.delete( comprasDb.get() );
		}else {
			// No existe elemto a borrar
		}
		
	}
	
}
