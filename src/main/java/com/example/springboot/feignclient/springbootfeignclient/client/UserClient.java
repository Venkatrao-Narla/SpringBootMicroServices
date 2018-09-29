package com.example.springboot.feignclient.springbootfeignclient.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springboot.feignclient.springbootfeignclient.dto.UserResponse;


@FeignClient(url="https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserClient {
	
	
	//public List<UserResponse> getUsers();
	@GetMapping("/users")
	public List<UserResponse> getUsers();

}
