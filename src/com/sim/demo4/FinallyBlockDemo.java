package com.sim.demo4;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("111");
			System.out.println(20/0);
			System.out.println("222");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("333");
		}
		finally {
			System.out.println(10/0);
		}
		System.out.println("555");

	}

}
