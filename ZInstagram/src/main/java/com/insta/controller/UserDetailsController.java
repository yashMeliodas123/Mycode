package com.insta.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insta.model.UserDetails;
import com.insta.service.UserDetailsService;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	@Autowired
	private UserDetailsService userService;

	@PostMapping("/addUserDetails")
	public UserDetails addUserDetailsHandler(@RequestBody UserDetails userDetails) {
		// log.info("inside ProductClass ");
		return userService.addUserDetails(userDetails);
	}

	@GetMapping("/getUserDetails/{userId}" )
	public UserDetails getUserDetails(@PathVariable("userId") Integer userId) {

		return userService.getUserDetailsByUserId(userId);
	}

	@PutMapping("/updateUserDetails/{userId}")
	public UserDetails updateUserDetails(@RequestBody UserDetails UserDetails, @PathVariable("userId") Integer userId) {

		return userService.updateUserDetails(userId, UserDetails);

	}

	@DeleteMapping("/delete/{userId}")
	public UserDetails deleteproduct(@PathVariable("userId") Integer userId) {

		return userService.deleteUserDetails(userId);
	}

}
