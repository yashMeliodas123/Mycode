package com.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insta.model.Whatsapp;

@Repository
public interface WhatsappRepository extends JpaRepository<Whatsapp,Integer> {

}
