package com.insta.model;

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
public class Facebook {

	private String facebookName;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer facebookId;

	private String mobileNo;
	
	private String facebookDeviceId;
	

}
