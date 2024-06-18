package day1;

public class TestDate {

	public static void main(String[] args) {
		int i= 10;
		
		MyDate today=new MyDate();
		today.setDay(0);
		today.setDate(26, "March", 2024);
		MyDate tomorrow = today;
		tomorrow.displayDate();

	}

}
