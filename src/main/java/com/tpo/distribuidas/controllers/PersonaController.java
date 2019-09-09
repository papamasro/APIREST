package com.tpo.distribuidas.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpo.distribuidas.exceptions.CodeAndMessageException;
import com.tpo.distribuidas.exceptions.CodeAndMessageException.ErrorCode;

import controlador.Controlador;
import exceptions.PersonaException;

import views.PersonaView;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ClienteController {

	Controlador c = Controlador.getInstancia();
	
	// @RequestMapping("/get_personas")
	// public List<ClienteView> getClientes() {
	// 	try {
	// 		return c.getClientes();			
	// 	} catch (Exception e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
	// 	}
	// }
	
	@RequestMapping("/buscarPersona/{numero}")
	public PersonaView buscarPersona(@PathVariable String numero) {
			try {
				return c.buscarPersona(numero);
			} catch (ClienteException e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.CLIENTE_INEXISTENTE, "La persona no existe");
			} catch (Exception e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
			}		
		
	}

	@RequestMapping("/habilitadosPorEdificio/{numero}")
	public PersonaView habilitadosPorEdificio(@PathVariable int numero) {
			try {
				return c.habilitadosPorEdificio(numero);
			} catch (ClienteException e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.CLIENTE_INEXISTENTE, "La persona no existe");
			} catch (Exception e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
			}		
		
	}

	@RequestMapping("/dueniosPorEdificio/{numero}")
	public PersonaView dueniosPorEdificio(@PathVariable int numero) {
			try {
				return c.dueniosPorEdificio(numero);
			} catch (ClienteException e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.CLIENTE_INEXISTENTE, "La persona no existe");
			} catch (Exception e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
			}		
		
	}

	@RequestMapping("/habitantesPorEdificio/{numero}")
	public PersonaView habitantesPorEdificio(@PathVariable int numero) {
			try {
				return c.habitantesPorEdificio(numero);
			} catch (ClienteException e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.CLIENTE_INEXISTENTE, "La persona no existe");
			} catch (Exception e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
			}		
		
	}

	@RequestMapping("/dueniosPorUnidad/{codigo}{piso}{codigo}")
	public PersonaView dueniosPorUnidad(@PathVariable int codigo, int piso , int numero) {
			try {
				return c.dueniosPorUnidad(numero,piso,codigo);
			} catch (ClienteException e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.CLIENTE_INEXISTENTE, "La persona no existe");
			} catch (Exception e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
			}		
		
	}

	@RequestMapping("/inquilinosPorUnidad/{codigo}{piso}{codigo}")
	public PersonaView inquilinosPorUnidad(@PathVariable int codigo, int piso , int numero) {
			try {
				return c.inquilinosPorUnidad(numero,piso,codigo);
			} catch (ClienteException e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.CLIENTE_INEXISTENTE, "La persona no existe");
			} catch (Exception e) {
				throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
			}		
		
	}
		
}
