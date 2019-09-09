package com.tpo.distribuidas.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpo.distribuidas.exceptions.CodeAndMessageException;
import com.tpo.distribuidas.exceptions.CodeAndMessageException.ErrorCode;

import controlador.Controlador;
import exceptions.ProductoException;
import exceptions.RubroException;
import exceptions.SubRubroException;

import view.UnidadView;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UnidadController {

	Controlador c = Controlador.getInstancia();

	// @RequestMapping("/get_productos")
	// public List<ProductoView> getProductos() {
		
	// 	try {
	// 		return c.getProductos();	
	// 	} catch (Exception e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
	// 	}
	// } 

	@RequestMapping("/getUnidadesPorEdificio/{codigo}")
	public List<UnidadView> getUnidadesPorEdificio(@PathVariable int codigo) {
		try {
			return c.getUnidadesPorEdificio(codigo));	
		} catch (Exception e) {
			throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
		}
	}
	
	@RequestMapping("/buscarUnidad/{id}{piso}{numero}")
	public Unidad buscarUnidad(@PathVariable int id, String piso, String numero) {
		try {
			return c.buscarUnidad(id,piso,numero);	
		} catch (ProductoException e) {
			throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.PRODUCTO_INEXISTENTE, "El producto no existe");
		} catch (Exception e) {
			throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
		}
	}

	// @RequestMapping("/get_productos_by_subrubro/{subRubro}")
	// public List<ProductoView> getProductosBySubrubro(@PathVariable int subRubro) {
	// 	try {
	// 		return c.getProductosBySubRubro(new SubRubroView(subRubro, null, null));	
	// 	} catch (Exception e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
	// 	}
	// }

	// @PostMapping("/alta_producto")
	// public int altaProducto(@RequestBody ProductoView producto){
	// 	try {
	// 		c.altaProducto(producto);
	// 		return 1;
	// 	} catch (RubroException e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.RUBRO_INEXISTENTE, "El rubro no existe");
	// 	} catch (SubRubroException e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.SUBRUBRO_INEXISTENTE, "El subrubro no existe");
	// 	} catch (Exception e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
	// 	}
	// }

	// @PostMapping("/baja_producto/{codigoProducto}")
	// public int bajaProducto(@PathVariable int codigoProducto) {
	// 	try {
	// 		c.bajaProducto(new ProductoView(null, null, null, null, null, 0, codigoProducto));
	// 		return 1;
	// 	} catch (ProductoException e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.PRODUCTO_INEXISTENTE, "El producto no existe");
	// 	} catch (Exception e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
	// 	}
	// }
	
	// @PostMapping("/modificar_producto")
	// public int bajaProducto(@RequestBody ProductoView recibido) {
	// 	try {
	// 		c.modificaProducto(recibido);
	// 		return 1;
	// 	} catch (ProductoException e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.PRODUCTO_INEXISTENTE, "El producto no existe");
	// 	} catch (Exception e) {
	// 		throw new CodeAndMessageException(HttpStatus.NOT_FOUND, ErrorCode.ERROR_INESPERADO, "Ha ocurrido un error inesperado");
	// 	}
	// }
	
	
}
