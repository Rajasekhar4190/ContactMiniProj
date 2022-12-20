package com.app.repo;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Contact;


public interface ContactRepo extends JpaRepository<Contact, Integer> {
	//@Query("select * from contact_tab where activeSwitch=:status")
	public List<Contact> findByActiveSwitch(String status);

}
