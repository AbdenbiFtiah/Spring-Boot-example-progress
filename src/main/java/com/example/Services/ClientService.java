package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.ClientRepository;
import com.example.Models.Client;

import java.util.List;

@Service
public class ClientService {
	@Autowired
	ClientRepository clientRepository;
	
	
	public List<Client> getAllClients(){
		return clientRepository.findAll();
		
	}
	
	public Client getClientByID(int id){
		return clientRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Client " + id + " not found"));
	}
	
	public List<Client> getActiveClients(){
		return clientRepository.getActiveClients();
		
	}

}
