package com.app.service;

import java.util.List;

import com.app.entity.Contact;

public interface ContactService {
	public String saveContact(Contact contact);
	public String updateContact(Contact contact);
	public String deleteOneContact(Integer id);
	public Contact getOneContact(Integer id);
	public List<Contact> getAllContacts();

}
