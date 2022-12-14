package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Contact;
import com.app.repo.ContactRepo;
import com.app.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepo repo;

	@Override
	public String saveContact(Contact contact) {
		// TODO Auto-generated method stub
		 contact=repo.save(contact);
		if(contact.getId()!=null) {
			return "Contact Saved Succesfully!!!";
		}
		else
		
		return "Contact failed to saved";
	}

	@Override
	public String updateContact(Contact contact) {
		// TODO Auto-generated method stub
		 if(repo.existsById(contact.getId())) {
			 repo.save(contact);
			 return "Contact Updated Successfully";
		 }
		 else
		return "Contact Not updated";
	}

	@Override
	public String deleteOneContact(Integer id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		 if(repo.existsById(id)) {
			 return "Deleted Record Successfully:";
		 }
		return "Record not Deleted";
	}

	@Override
	public Contact getOneContact(Integer id) {
		// TODO Auto-generated method stub
		//Contact contact=repo.getById(id);
		Optional<Contact> opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
		
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		List<Contact> lis=repo.findAll();
		return lis;
	}

}
