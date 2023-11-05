package com.assosetvous.assosetvous.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assosetvous.assosetvous.entity.User;
import com.assosetvous.assosetvous.repository.IUserRepository;

@Service
public class UserService {

	@Autowired
	IUserRepository userRepository;
	
	//Liste des Users
	
		public List<User> getUser(){
			return userRepository.findAll();
		}
		
		//Save
		public User saveUser(User user) {
			return userRepository.save(user);
		}
		
		//get a User
		public User getUserByid(Long iduser) {
			return userRepository.findById(iduser).get();
		}
		
		//delete a User
		public void deleteUser(User user){
			userRepository.delete(user);
		}
}
