package com.assosetvous.assosetvous.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assosetvous.assosetvous.entity.User;
import com.assosetvous.assosetvous.service.UserService;



@RestController
@RequestMapping
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public User createUser(@Validated @RequestBody(required = false) User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getUser();
	}
	
	@GetMapping("/users/{iduser}")
	public ResponseEntity getUserbyId(@PathVariable(name= "iduser") Long iduser) {
		if(iduser == null) {
			return ResponseEntity.badRequest().body("Canot retreive camion with null id");
		}
		User user1 = userService.getUserByid(iduser);
		if(user1 == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(user1);
	}
	
	@DeleteMapping("/users/{iduser}")
	public ResponseEntity<User> deleteUser(@Validated @PathVariable(name= "iduser") Long iduser) {
		
		User user1 = userService.getUserByid(iduser);
		if(user1 == null) {
			return ResponseEntity.notFound().build();
		}
		userService.deleteUser(user1); 
		return ResponseEntity.ok().body(user1);
	}
}
