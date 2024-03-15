package com.insta.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

	@Id
	@Column(name = "USER_ID", nullable = false)
	private Integer userId;

	@Column(name = "EMAIL_ID", nullable = false)
	private String emailId;

	@Column(name = "MOBILE_NO", nullable = false)
	private String mobileNo;

	@Column(name = "COUNTRY", nullable = false)
	private String country;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<AddedFriends> addedFriends = new ArrayList<>();

	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ConnectedDevices> connectedDevices = new ArrayList<>();

    
	
	
}
