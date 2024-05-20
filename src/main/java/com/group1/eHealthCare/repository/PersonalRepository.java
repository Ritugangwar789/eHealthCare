package com.group1.eHealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.group1.eHealthCare.entity.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal,Integer> {

	@Query(value ="select * from PDETAILS", nativeQuery =true)
	Personal findByName(String first_name);
	
	Personal findByNameNative(String first_name);
}
