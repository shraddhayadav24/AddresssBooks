package com.addressbooks;

import java.util.ArrayList;
import java.util.List;

public class Addressbook {
	private List<Contact> contacts;
	
	public Addressbook() {
		this.contacts=new ArrayList<Contact>();
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	
	public List<Contact> getContacts(){
		return contacts;
	}
	public void display() {
		for(Contact contact: contacts) {
			System.out.println(contact);
		}
	}
}
