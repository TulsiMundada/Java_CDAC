package day3;

public class SalesManager extends Manager{
	protected double incentive;
	public SalesManager(int empid, String name, double basic, double incentive) {
		super(empid, name, basic);
		this.incentive = incentive;
	}	
	@Override
	public double calculateGross()
	{
		return super.calculateGross() + incentive;
	}	
	@Override
	public double calculateNet()
	{
		double tax = calculateTax();
		return calculateGross() - tax;
	}
	public void displayIncentive()
	{
		System.out.println("Incentive : " + incentive);
	}
	
	@Override 
	public double calculateTax()
	{
		return calculateGross() * 0.3;
		
	}
}
