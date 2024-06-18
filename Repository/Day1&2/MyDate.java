package day1;

public class MyDate {	
	private int day;
	private String month;
	private int year;	
	
	public void setDay(int day)
	{
		if(day > 0)
		{
			this.day = day;
		}
	}
	
	public int getDay()
	{
		return this.day;
	}
	public void setDate(int day, String month, int year)
	{
		this.day =day;
		this.month=month;
		this.year =year;
	}	
	public void displayDate()
	{
		System.out.println("Date : " + day + "/" + month + "/"+ year);
	}

	public String toString()
	{
		return "Date : " + day + "/" + month + "/"+ year;
	}
}
