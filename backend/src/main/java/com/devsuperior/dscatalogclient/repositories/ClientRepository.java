package com.devsuperior.dscatalogclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalogclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
