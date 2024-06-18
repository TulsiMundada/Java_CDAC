package day4;

import day3.Manager;
import day3.SalariedEmployee;
import day3.SalesManager;

public class Payroll {
	
	public void processTax(TaxPayer payer)
	{
		System.out.println("Tax payable : " + payer.calculateTax());
	}

	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		TaxPayer [] payers = new TaxPayer [4];
		payers[0] = new SalesManager(222, "sss", 100000, 20000);
		payers[1] = new SalariedEmployee(678, "ddd", 75000);
		payers[2] = new Manager(987, "ppp", 85000);
		payers[3] = new Consultant("aaa", 100000);
		
		for(TaxPayer payer : payers)
		{
			payroll.processTax(payer);
		}
	}

}
