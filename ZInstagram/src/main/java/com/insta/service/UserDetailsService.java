package com.insta.service;

import com.insta.model.UserDetails;

public interface UserDetailsService {
	
	public UserDetails addUserDetails(UserDetails userDetails);
	//public UserDetails updateUserDetails(String userId );
	public UserDetails deleteUserDetails(Integer userId) ;
	public UserDetails getUserDetailsByUserId(Integer userId);
	public UserDetails updateUserDetails(Integer userId, UserDetails userDetails);


}
