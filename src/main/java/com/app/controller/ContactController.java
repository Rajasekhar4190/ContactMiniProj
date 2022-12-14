package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Contact;
import com.app.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	private ContactService service;
	
	@PostMapping("/create")
	public String saveContact(@RequestBody Contact contact) {
		
		return service.saveContact(contact);
	}
	
	@GetMapping("/contact/{id}")
	public Contact getOneContact(@PathVariable Integer id) {
		    Contact c=service.getOneContact(id);
		return  c;
		
	}
	@GetMapping("/contact/all")
	public List<Contact> getAllContacts(){
		List<Contact> lis=service.getAllContacts();
		return lis;
		
	}
	@PutMapping("/contact/update")
	public String updateOneContact(@RequestBody Contact contact) {
		return service.updateContact(contact);
		
	}
	@DeleteMapping("/contact/{id}")
	public String deleteOneContact(@PathVariable Integer id) {
		return service.deleteOneContact(id);
		
	}

}
