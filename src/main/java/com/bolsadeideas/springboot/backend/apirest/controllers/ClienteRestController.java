package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.services.iClienteService;

@CrossOrigin(origins = { "http://localhost:4200" }) // configuracion para saber que peticiones son permitidas por el
													// back en el lado del cliente
@RestController // marcar la clase como rest controller
@RequestMapping("/api") // mapear el rest controller el end point de la url
public class ClienteRestController {

	@Autowired // inyecta la interfaz y busca la primera implementacion, si tuviera mas de una
				// habria que usar un cualifier
	private iClienteService clienteService;

	@GetMapping("/clientes") // mapear la url a este metodo
	public List<Cliente> index() {
		return clienteService.findAll();
	}
}
