package com.main.bitfinal.memberService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.bitfinal.memberService.memberEntity.User;

import store.bean.CartDTO;

@Repository
public interface MypageDAO extends JpaRepository<User, String> {

	@Query("select user from User user where user.username = :userName")
	public User findByUser(@Param("userName") String username);
	
}
