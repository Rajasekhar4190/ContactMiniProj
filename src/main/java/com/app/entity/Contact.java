package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="contact_tab")
@Data
public class Contact {
	@Id
	@GeneratedValue
	private Integer id;
	private String contName;
	private String mail;
	private Long phNo;
	private String activeSwitch;
	

}
 