package day3;

public class EmployeePortal {
	public void showGross(Employee e)
	{
		System.out.println("Gross Salary : " + e.calculateGross());	
	}	
	public void showNet(SalariedEmployee e)
	{
		System.out.println("Net Salary : " + e.calculateNet());	
	}
	public static void main(String[] args) {
		EmployeePortal portal = new EmployeePortal();
		SalariedEmployee esal = new SalariedEmployee(556, "aaa", 60000);
		System.out.println(esal);
		portal.showGross(esal); //up casting
		portal.showNet(esal);
		
		Manager em = new Manager(433, "bbb", 80000);
		System.out.println(em);
		
		Employee [] emps = new Employee[3];
        emps[0] = new SalesManager(222, "sss", 100000, 20000);
        emps[1] = new SalariedEmployee(678, "ddd", 75000);
        emps[2] = new Manager(987, "ppp", 85000);
        
        for(Employee e : emps)
        {
        	portal.showGross(e);
        	if(e instanceof SalariedEmployee)
        	{
        		SalariedEmployee ss=(SalariedEmployee) e; //down casting
        		portal.showNet(ss);
        	}
        }
	}

}
