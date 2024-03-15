package com.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insta.model.Facebook;

@Repository
public interface FacebookRepository extends JpaRepository<Facebook,Integer>{

}
