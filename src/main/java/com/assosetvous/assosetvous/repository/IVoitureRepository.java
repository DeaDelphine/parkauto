package com.assosetvous.assosetvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assosetvous.assosetvous.entity.Voiture;

public interface IVoitureRepository extends JpaRepository<Voiture, Long> {

}
