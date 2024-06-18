package day10;

import java.time.Duration;
import java.time.Instant;

public class DemoInstant {

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		
		Instant max = Instant.MAX;
		
		Duration interval = Duration.between(now, max);
		System.out.println("Time laspsed : "+ interval.toHours());
	}
}
