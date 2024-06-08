package com.sim.set.a1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   TelephoneDirectory directory = new TelephoneDirectory();
		   directory.addContact(new Contact("Alice", "1234567", "abcd@gmail.com"));
		   directory.addContact(new Contact("Bob", "2345667", "bob@gmail.com"));
		   directory.addContact(new Contact("Charlie", "345-678-9012", "charlie@example.com"));
		   directory.addContact(new Contact("Alice", "1234567", "abcd@gmail.com"));
		   
		   // Display all contacts
	        System.out.println("Displaying all contacts:");
	        directory.displayContacts();

	        // Find a contact by phone number
	        System.out.println("\nFinding contact with phone number 1234567:");
	        Contact foundContact = directory.findContactByPhoneNumber("1234567");
	        if (foundContact != null) {
	            System.out.println(foundContact);
	        } else {
	            System.out.println("Contact not found");
	        }

	        // Remove a contact by phone number
	        System.out.println("\nRemoving contact with phone number 123-456-7890:");
	        directory.removeContact("345-678-9012");

	        // Display all contacts after removal
	        System.out.println("\nDisplaying all contacts after removal:");
	        directory.displayContacts();
	    }
	}


