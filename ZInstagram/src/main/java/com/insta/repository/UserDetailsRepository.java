package com.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.insta.model.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer> {

}
