package com.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insta.model.ConnectedDevices;

@Repository
public interface ConnectedDevicesRepository extends JpaRepository<ConnectedDevices,Integer> {

}
