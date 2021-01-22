package com.devsuperior.dscatalogclient.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalogclient.dto.ClientDTO;
import com.devsuperior.dscatalogclient.entities.Client;
import com.devsuperior.dscatalogclient.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> listClient = clientRepository.findAll();
		return listClient.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}

	
	
	
	
}
