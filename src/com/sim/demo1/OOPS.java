package com.sim.demo1;

import java.util.Date;

class User{
	//Attribute 
	String name ;
	String phone ; 
	String email;
	char gender ; 
	Date birthDate ;
	String password;
	//default constructor 
	 User() {
		name = "";
		phone = "NA";
		email =" abcd@gmail.com";
		gender = 'F';
		birthDate = new Date();
		password = "password";
	}
    //Parameterized constructor 
     User(String n, String p, String e, char g, Date b, String pass) {
		
		name = n;
		phone = p;
		email = e;
		gender = g;
		birthDate = b;
		password = pass;
	}
	 void setUserData(String name , String phone , String email , Date birthDate , String password, String string ) {
		 this.name = name ; 
		 this.phone = phone ; this.email = email;this.gender=  gender; this.birthDate = birthDate ; this.password = password;
	 }
	void showUserData() {
		System.out.println("----------------------------------");
		System.out.println(name +"can be called at "+ phone );
		System.out.println(name +"can be emailed at "+ email );
		System.out.println(name +"has a gender  "+ gender );
		System.out.println("-----------------------------------");
	}
}


public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       User user1 = new User();
       User user2 = new User();
       User user3 = user1;
       User user5 = new User("Pooja", "12325637", "bbbb@gmail.com", 'M', new Date(), "pass123");
      
       
       System.out.println("user1 is : "+ user1 );
       user1.setUserData("Pankaj", "234444444", "pankaj@gmail.com", new Date(), "passddd", "hack");
       user1.showUserData();
       System.out.println("user2 is : "+ user2 );
       user2.setUserData("Anil", "234444444", "Anil@gmail.com", new Date(), "passddd", "hack");
       user2.showUserData();
       System.out.println("user3 is : "+ user3 );
       user3.setUserData("Shikhar", "234444444", "shikhar@gmail.com", new Date(), "passddd", "hack");
       user3.showUserData();
       System.out.println("User5 is  : "+ user5);
      
       user5.setUserData("Rakhi", "123456", "abdeee@yhaoo.com",new Date(), "bbb123", "pass");
       user5.showUserData();
       
       Product p1 = new Product("iphone", "4.7", "Apple iphone ", 800.00);
       Product p2 = new Product();
       p2.setProductData("ultraBoost shoe", "4.8", "shoes", 2000.00);
       p1.showProductData();
       p2.showProductData();
       
       
	}

}
