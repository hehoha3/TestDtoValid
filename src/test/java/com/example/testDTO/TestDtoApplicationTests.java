package com.example.testDTO;

import com.example.testDTO.model.dto.UserRequest;
import com.example.testDTO.model.entity.User;
import com.example.testDTO.repository.UserRepo;
import com.example.testDTO.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestDtoApplicationTests {

	@Autowired
	UserRepo userRepo;

	@Autowired
	UserService userService;

	@Test
	public void testGetAllUser(){
		List<User> list = userService.getListUser();
		System.out.println(list);
	}

	@Test
	public void testAddUser(){
		UserRequest userRequest = new UserRequest();
		userRequest.setName("Vinh");
		userRequest.setEmail("lhvinh2002@gmail.com");
		userRequest.setMobile("0923316882");
		userRequest.setGender("male");
		userRequest.setAge(17L);
		userRequest.setNationality("FR");
		userService.addUser(userRequest);
	}
}
