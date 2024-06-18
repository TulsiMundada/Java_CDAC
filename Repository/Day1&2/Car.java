package day1;

public class Car {
   private String make;
   private String model;
   private double price;
   private int man_year;
   private static int count=0;
   
   //default
   public Car()
   {
	   count++;
	   make = "Honda";
	   model ="City";
	   price = 1500000;
	   man_year = 2020;
//	   this("Honda", "City", 1500000, 2020);
   }
   public Car(String make, String model, double price)
   {
	   count++;
	   this.make = make;
	   this.model =model;
	   this.price = price;
	   this.man_year = 2024;
   }
   
   public Car(String make, String model, double price, int man_year)
   {
	   count++;
	   this.make = make;
	   this.model =model;
	   this.price = price;
	   this.man_year = man_year;
   }
   
   public void setPrice(double price)
   {
	   this.price = price;
   }
   
   public double getPrice()
   {
	   return price;
   }
   public String toString()
   {
	   return "Car : "+ make + " , " + model + " , " + price + " , " + man_year;
   }
   
   public static void displayCount()
   {
	   System.out.println("Total cars : "+ count);
   }
}
