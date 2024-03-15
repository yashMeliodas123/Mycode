package com.insta.model;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConnectedDevices {
	
	@Id
	//@UuidGenerator
	private Integer deviceId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Whatsapp userWhatsapp;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Facebook userFacebook;
	
	

}
