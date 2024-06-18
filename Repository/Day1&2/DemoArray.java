package day2;

import day1.Car;

public class DemoArray {
	public static void main(String[] args) {
		Car [] cars = new Car[2];
		cars[0] = new Car();
		cars[1]= new Car("xyz", "abc", 1000000);
		System.out.println(cars[0].getPrice());
		System.out.println(cars[1].getPrice());
		
		//for(date type var : collection)
		for(Car c : cars)
		{
			System.out.println(c);
		}
		
		System.out.println("\n*********************");
		
		int [] num = {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<num.length; i++)
		{
			if(num[i] %2==0)
			{
				System.out.println(num[i]);
			}
		}

	}

}
