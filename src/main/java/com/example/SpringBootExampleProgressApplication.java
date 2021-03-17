package com.example;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Dao.ClientRepository;
import com.example.Models.Client;

@SpringBootApplication
public class SpringBootExampleProgressApplication implements CommandLineRunner {
	
	@Autowired
	ClientRepository clientRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleProgressApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
		clientRepository.save(new Client("Abden","Abden@gmail.com",2321,true,(Date) dateFormat.parse("11/12/2012")));
		clientRepository.save(new Client("Hassan","Hassan@gmail.com",2111,true,(Date) dateFormat.parse("10/12/2012")));
		clientRepository.save(new Client("Mouna","Mouna@gmail.com",9921,true,(Date) dateFormat.parse("12/12/2012")));


		
	}

	
}
