package com.sim.set.a1;

import java.util.HashSet;

public class TelephoneDirectory {
	
	HashSet<Contact> contacts = new HashSet<Contact>();

	public TelephoneDirectory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void addContact(Contact contact) {
		if(contacts.add(contact)) {
			System.out.println("Contact added :"+contact);
		}else {
			System.out.println("conatct already exists :"+contact);
		}
	}
		
	public void removeContact(String phoneNumber) {
        Contact contactToRemove = null;
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                contactToRemove = contact;
                break;
            }
        }

        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Contact removed: " + contactToRemove);
        } else {
            System.out.println("Contact not found");
        }
    }

	public Contact findContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }
		
		  public void displayContacts() {
			  for(Contact contact:contacts) {
				  System.out.println(contact);
			  }
		  }
	}


