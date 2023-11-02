package com.assosetvous.assosetvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assosetvous.assosetvous.entity.Commande;

public interface ICommandeRepository extends JpaRepository<Commande, Long>{

}
