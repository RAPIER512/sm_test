package com.sm_test.mapper;

import java.util.List;

import com.sm_test.domain.User;

public interface UserMapper {

	void save(User user);
	void update(User user);
	void delete(int id);
	User findById(int id);
	List<User> findAll();
}
