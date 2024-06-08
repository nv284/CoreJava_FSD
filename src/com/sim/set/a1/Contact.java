package com.sim.set.a1;

import java.util.Objects;

public class Contact {
	
	private String name;
    private String phoneNumber;
    private String email;
	public Contact(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;}
	    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
		
		@Override
		public int hashCode() {
			return Objects.hash(phoneNumber);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contact other = (Contact) obj;
			return Objects.equals(phoneNumber, other.phoneNumber);
		}
		@Override
		public String toString() {
			return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
		}
	    
}
