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
	
	public void updateContact(String oldname, Contact newname) {
		for(int i=0;i<contacts.size();i++) {
			if(contacts.get(i).getFirst_name().equalsIgnoreCase(oldname)) {
				contacts.set(i, newname);
				return;
			}
			
		}
		System.out.println("Contact not found");
		
	}
	
	
	public void deleteContact(String name) {
		for(int i=0;i<contacts.size();i++) {
			if(contacts.get(i).getFirst_name().equalsIgnoreCase(name)) {
				contacts.remove(i);
				System.out.println("Contact deleted");
				return;
			}
		}
		System.out.println("Contact not found");
	}
}
