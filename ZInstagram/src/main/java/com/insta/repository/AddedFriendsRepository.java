package com.insta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insta.model.AddedFriends;

@Repository
public interface AddedFriendsRepository  extends JpaRepository<AddedFriends,Integer> {

}
