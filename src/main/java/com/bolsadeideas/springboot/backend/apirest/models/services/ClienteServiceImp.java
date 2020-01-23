package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.iClienteDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;;

@Service // marca la clase como de servicio
public class ClienteServiceImp implements iClienteService {

	@Autowired // inyeccion de dependencias, en este caso inyecta el clienteDao
	private iClienteDao clienteDao; // este atributo se usa para acceder a la lista de clientes*

	@Override
	@Transactional(readOnly = true) // nos permite manejar transaccion en el metodo es una consulta, aunque se puede
									// omitir es recomendado para tenerlo en cuenta
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll(); // *por lo tanto se retorna aqui con un cast a la lista
	}

}
