package day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseFormat {

	public static void main(String[] args) {
	
		LocalDateTime dt = LocalDateTime.of(2024, 05, 10, 10, 20, 30);
		System.out.println(dt);
		
		String mydate = dt.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"));
		System.out.println(mydate);
		
		LocalDateTime customedt = LocalDateTime.parse(mydate, 
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		System.out.println(customedt);
		
		
	}

}
