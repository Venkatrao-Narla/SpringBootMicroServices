package com.example.springboot.feignclient.springbootfeignclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.feignclient.springbootfeignclient.client.UserClient;
import com.example.springboot.feignclient.springbootfeignclient.dto.UserResponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringbootFeignClientApplication {
	
		@Autowired
		 private UserClient luserClient;
	
		@GetMapping("/findAllUser")
		public  List<UserResponse> getAllUser(){
			return luserClient.getUsers();
		}
		
		
	public static void main(String[] args) {
		SpringApplication.run(SpringbootFeignClientApplication.class, args);
	}
}
