package com.order.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.order.models.Register;



@Repository
public interface RegisterDAO extends CrudRepository<Register, Integer>{

	
	Register findByUsernameAndPassword(@Param("username") String username,
	                             @Param("password") String password);
}