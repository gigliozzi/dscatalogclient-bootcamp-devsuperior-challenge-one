package com.devsuperior.dscatalogclient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscatalogclient.entities.Client;
import com.devsuperior.dscatalogclient.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> findAll() {
		return clientRepository.findAll();
		
	}

}
