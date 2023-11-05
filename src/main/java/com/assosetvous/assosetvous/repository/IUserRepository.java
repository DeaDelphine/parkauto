package com.assosetvous.assosetvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assosetvous.assosetvous.entity.User;



public interface IUserRepository extends JpaRepository<User, Long>  {

}
