package com.qa.individual.individual.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qa.individual.individual.model.Users;
import com.qa.individual.individual.repository.UsersRepository;

@RestController
@RequestMapping("api/v1/")
public class UserController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@RequestMapping(value = "users", method = RequestMethod.GET)
	public List<Users> list(){
		return usersRepository.findAll();
		
	}
	@RequestMapping(value = "users", method = RequestMethod.POST)
	public Users create(@RequestBody Users uu){
		return usersRepository.saveAndFlush(uu);
		
	}
	@RequestMapping(value = "users/{id}", method = RequestMethod.GET)
	public Users create(@PathVariable Long id){
		return usersRepository.findOne(id);
		
	}
	@RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
	public Users update(@PathVariable Long id, @RequestBody Users uu){
	Users existingUsers = usersRepository.findOne(id);
	BeanUtils.copyProperties(uu, existingUsers);
	return usersRepository.saveAndFlush(existingUsers);
		
	}
	@RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
	public Users delete(@PathVariable Long id, @RequestBody Users uu){
		Users existingUsers = usersRepository.findOne(id);
		usersRepository.delete(existingUsers);
		return existingUsers;
	}
	

}
