package day3;

public class Manager extends SalariedEmployee{
	protected static int travelallow = 1500;
	
	public Manager(int empid, String name, double basic) {
		super(empid, name, basic);
	}
	
	@Override
	public double calculateGross()
	{
//		double hra = basic * 0.4;
//		double da = basic * 0.12;
//		return basic + hra+da + travelallow;
		return super.calculateGross() + travelallow;
	}

}
