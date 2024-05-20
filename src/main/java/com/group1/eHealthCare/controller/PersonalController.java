package com.group1.eHealthCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group1.eHealthCare.entity.Personal;
import com.group1.eHealthCare.service.PersonalService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/personal")
public class PersonalController {

	@Autowired
	private PersonalService service;

	@PostMapping("/adduser")
	public Personal adduser(@RequestBody Personal personal) {
		return service.saveuser(personal);
	}

	@PostMapping("/addusers")
	public List<Personal> addusers(@RequestBody List<Personal> personals) {
		return service.saveusers(personals);
	}

	@GetMapping("/users")
	public List<Personal> findallusers() {
		return service.getusers();
	}

	@GetMapping("/userbyid/{id}")
	public Personal finduserbyid(@PathVariable int id) {
		return service.getuserbyid(id);
	}

	@PutMapping("/updatepersonal/{id}")
	public Personal updateuser(@RequestBody Personal personal) {
		return service.updateuser(personal);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteuser(@PathVariable int id) {
		return service.deleteuser(id);
	}

}
