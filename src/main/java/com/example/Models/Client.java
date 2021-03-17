package com.example.Models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity @Data
public class Client {
	@Id @GeneratedValue
	private int id;
	private String name,email;
	private int solde;
	private boolean active;
	private Date birthday;
	
	public Client(String name, String email,int solde, boolean active, Date birthday) {
		super();
		this.name = name;
		this.email = email;
		this.solde= solde;
		this.active = active;
		this.birthday = birthday;
	}
	
}
