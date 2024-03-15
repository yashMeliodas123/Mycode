package com.insta.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insta.model.UserDetails;
import com.insta.repository.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails addUserDetails(UserDetails userDetails) {
		UserDetails saveUserDetails = userDetailsRepository.save(userDetails);
		return saveUserDetails;

	}

	@Override
	public UserDetails updateUserDetails(Integer userId,UserDetails userDetails) {
		UserDetails saveUserDetails = userDetailsRepository.save(userDetails);
		return saveUserDetails;
	}
	
	@Override
	public UserDetails deleteUserDetails(Integer userId) {

		Optional<UserDetails> deleteUserId = userDetailsRepository.findById(userId);

		if (deleteUserId.isPresent()) {

			UserDetails user = deleteUserId.get();
			userDetailsRepository.delete(user);
			return user;
		} else
			return null;
	}

	@Override
	public UserDetails getUserDetailsByUserId(Integer userId) {
		UserDetails user=userDetailsRepository.findById(userId).get();
		return user;
	}

}
