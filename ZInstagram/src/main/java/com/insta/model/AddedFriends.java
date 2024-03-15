package com.insta.model;

import org.hibernate.annotations.UuidGenerator;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddedFriends {
	
	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Whatsapp whatsapp;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Facebook facebook;
	
	
	
}
