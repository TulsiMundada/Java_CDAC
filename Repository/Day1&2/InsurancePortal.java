package day1;

public class InsurancePortal {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car);
		
		car.setPrice(1600000);
		System.out.println(car.getPrice());
		
		Car car1 = new Car("Honda", "Elevate", 200000, 2023);
		System.out.println(car1);
		
		//Static methods are invoked as ClassName.methodName
		Car.displayCount();
	}
}
