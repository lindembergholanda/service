package com.example.serviceauthserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.serviceauthserver.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}