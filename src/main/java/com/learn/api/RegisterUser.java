package com.learn.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.learn.repository.RegisterRepository;
import com.learn.repository.registerUser;

@RestController
public class RegisterUser {
	
	@Autowired
	Gson gson;
	
	private RegisterRepository registorRepo;
	
	@PostMapping("/saveRegistrateruser")
	public ResponseEntity<?> saveRegistrateruser(@RequestBody String data) {
	
	registerUser userDetails = new registerUser();
	userDetails=	gson.fromJson(data, registerUser.class)	;
	try {
		registorRepo.save(userDetails);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}	
	}
	


