package day4;

import java.util.HashSet;
import java.util.Set;

public final class Car {
	private final String make;
	private final String model;
	private final double price;
	private final Set<String> colours;
	
	public Car(String make, String model, double price, Set<String> colours)
	{
		this.make = make;
		this.model=model;
		this.price = price;
		this.colours= colours;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public Set<String> getColours()
	{
		return new HashSet<>(colours);
	}
	
	public String toString()
	{
		return "Make : " + make + " Model : " + model + " Price : " + price 
				+ " Colours : " + colours;  
	}
	
	public static void main(String[] args) {
		Set<String> colours = new HashSet<>();
		colours.add("Black");
		colours.add("Red");
		Car car1 = new Car("Mahindra", "Thar", 200000, colours);
		System.out.println(car1);
		
		car1.getColours().add("Grey");
		System.out.println(car1);
	}
}
