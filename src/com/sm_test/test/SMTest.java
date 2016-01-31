package com.sm_test.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sm_test.domain.User;
import com.sm_test.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)// π”√spring≤‚ ‘øÚº‹
@ContextConfiguration("/beans.xml")
public class SMTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testAdd(){
		User user = new User(-1, "tom", new Date(), 13245);
		userMapper.save(user);
	}
}
