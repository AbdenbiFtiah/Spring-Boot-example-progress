package com.example.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.Models.Client;

@CrossOrigin("*")
@Repository
public interface ClientRepository  extends JpaRepository<Client, Integer>{
	
//	@Query("select c from Client c where c.active = true")
//	public List<Client> getActiveClients();

}
