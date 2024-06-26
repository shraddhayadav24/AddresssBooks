package com.addressbooks;

import java.util.Scanner;

public class Contact {
	
	private String first_name;
	private String last_name;
	private String address;
	private String city;
	private String state;
	private String email;
	private String phoneno;
	
	public Contact(String first_name, String last_name, String address, String city, String state, String email, String phoneno) {
		
		this.first_name=first_name;
		this.last_name=last_name;
		this.address=address;
		this.city=city;
		this.state=state;
		this.email=email;
		this.phoneno=phoneno;
	}
	
	 public String toString() {
		return "Contact[" +" firstname= " +first_name + " lastname= " +last_name + " Address= " + address + " City= " + city + " State= " +state
				+ " Email= " +email + " phoneno= " +phoneno;
		 
	 }
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
	public static Contact newContact(Scanner scanner) {		
		
		System.out.println("Enter the First Name: ");
		int id= scanner.nextInt();
		
		System.out.println("Enter the First Name: ");
		String Firstname= scanner.nextLine();
		
		System.out.println("Enter the Last Name: ");
		String lastname= scanner.nextLine();
		
		System.out.println("Enter the address Name: ");
		String address= scanner.nextLine();
		
		System.out.println("Enter the city Name: ");
		String city= scanner.nextLine();
		
		System.out.println("Enter the State Name: ");
		String state= scanner.nextLine();
		
		System.out.println("Enter the Email: ");
		String email= scanner.nextLine();
		
		System.out.println("Enter the Phone no: ");
		String phoneno= scanner.nextLine();
		
		return new Contact(Firstname, lastname, address, city, state, email, phoneno);
	}
	

public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		// to add the contact
		Addressbook addressbook=new Addressbook();
		addressbook.addContact(newContact(scanner));
		addressbook.display();
		// to update the contact
		System.out.print("Enter the name of the contact you want to update: ");
        String toupdate_name = scanner.nextLine();
        Contact updated= newContact(scanner);
       addressbook.updateContact(toupdate_name, updated);
       //to delete the addressbook
       System.out.print("Enter the name of the contact you want to update: ");
       String todelete = scanner.nextLine();
       addressbook.deleteContact(todelete);
       addressbook.display();
       scanner.close();
        
}
}

