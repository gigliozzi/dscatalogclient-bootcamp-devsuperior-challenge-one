package com.devsuperior.dscatalogclient.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalogclient.dto.ClientDTO;
import com.devsuperior.dscatalogclient.services.ClientService;


@RestController
@RequestMapping(value = "/clients")
public class ClientResources {
	
	@Autowired
	private ClientService clientService;

	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll() {
		List<ClientDTO> listClient = clientService.findAll();		
		return ResponseEntity.ok().body(listClient);
	}
}
