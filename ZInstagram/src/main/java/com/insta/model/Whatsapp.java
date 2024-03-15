package com.insta.model;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Whatsapp {

	private String whatsappName;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer whatsappId;

	private String mobileNo;
	
	private String whatsappDeviceId;
	
	
}
