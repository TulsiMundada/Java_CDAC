package day3;

import day4.TaxPayer;

public class SalariedEmployee extends Employee implements TaxPayer{
	protected double basic;
	public SalariedEmployee(int empid, String name, double basic) {
		super(empid, name);
		this.basic = basic;
	}
	@Override
	public double calculateGross() {
		double hra = basic * 0.4;
		double da = basic * 0.12;
		return basic + hra+da;
	}
	public double calculateNet()
	{
		double tax = calculateTax();
		return calculateGross() - tax;
	}
	@Override
	public double calculateTax() {
		return calculateGross() * 0.2;
	}
	@Override
	public String toString()
	{
		return super.toString() + " Gross : " + calculateGross() +
				" Net : " + calculateNet();
	}
	
	

}
