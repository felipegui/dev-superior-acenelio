package date_hour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculationsWithDateTime {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-10-31");
		
		LocalDateTime d02 = LocalDateTime.now();
		
		Instant d03 = Instant.now();

		LocalDate nextWeekLocalDate = d01.plusDays(7);
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		
		Instant nextWeekLocalInstant = d03.plus(7, ChronoUnit.DAYS);
		Instant pastWeekLocalInstant = d03.minus(7, ChronoUnit.DAYS);
		
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		System.out.println();
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println();
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		System.out.println();
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println();
		System.out.println("nextWeekLocalInstant: " + nextWeekLocalInstant);
		System.out.println();
		System.out.println("pastWeekLocalInstant" + pastWeekLocalInstant);
	}

}
