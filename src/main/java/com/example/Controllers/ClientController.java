package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Models.Client;
import com.example.Services.ClientService;

@RestController
@RequestMapping("clients")
@CrossOrigin("*")

public class ClientController {
	@Autowired
	ClientService clientService;
	
	
	@GetMapping
	public ResponseEntity<List<Client>> getAllClients(){
		return ResponseEntity.ok().body(clientService.getAllClients());
	}
	
	@GetMapping("/active")
	public ResponseEntity<List<Client>> getActiveClients(){
		return ResponseEntity.ok().body(clientService.getActiveClients());
	}

	
}
