package day10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DemoDateTime {

	public static void main(String[] args) {
		LocalTime later = LocalTime.of(12, 30);
		
		LocalDateTime dt = later.atDate(LocalDate.now());
		System.out.println(dt);
		
		dt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(dt);
		
		dt = LocalDateTime.of(2024,  10, 10, 11, 25, 30);
		System.out.println(dt);
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		for(String zone : zones)
			System.out.println(zone);
		
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Australia/Victoria"));
		System.out.println(zdt);
		
		ZonedDateTime zdt1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Toronto"));
		System.out.println(zdt1);
		
		Duration timediff = Duration.between(zdt, zdt1);
		System.out.println(timediff.toHoursPart());
		
		LocalDateTime local = zdt.toLocalDateTime();
		System.out.println(local);

	}

}
