package br.com.paulo.SpringSec.models.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Permission implements GrantedAuthority, Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String description;

	public Permission() {
			
	}
	
	
	
	public Permission(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}


	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String getAuthority() {
		return this.description;
	}
}
