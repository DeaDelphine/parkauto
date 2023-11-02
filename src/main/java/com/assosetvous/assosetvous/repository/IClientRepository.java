package com.assosetvous.assosetvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assosetvous.assosetvous.entity.Client;

public interface IClientRepository extends JpaRepository<Client, Long>  {
	
}
