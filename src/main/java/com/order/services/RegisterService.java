package com.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.RegisterDAO;
import com.order.models.Register;



@Service
public class RegisterService {

	@Autowired
	private RegisterDAO registerDao;
	
	public String registerUser(Register reg) {
		
		registerDao.save(reg);
		return "Success";
		
	}
	
	public String findUser(Register reg) {
		try {
			Register r=registerDao.findByUsernameAndPassword(reg.getUsername(), reg.getPassword());
			return r.toString();
		}
		catch(NullPointerException e) {
			return null;
		}
		
		
	}
	
}
