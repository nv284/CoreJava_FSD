package com.sim.demo2;

import java.util.Random;

@FunctionalInterface
 interface ExampleInterface {
    int randomCalculate(int a, int b);

    default void print(int result) {
        System.out.println(result);
    }
}


public class TestFunctionalInterface implements ExampleInterface{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestFunctionalInterface t1 = new TestFunctionalInterface();
     
      t1.print(t1.randomCalculate(210, 233));
	}

	@Override
	public int randomCalculate(int a, int b) {
		// TODO Auto-generated method stub
		int randomCal = a * b / 20;
        Random random = new Random();
        randomCal = randomCal + random.nextInt(1000);
        return randomCal;
	}

}
