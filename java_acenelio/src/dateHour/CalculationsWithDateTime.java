package dateHour;

import java.time.Duration;
//import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.temporal.ChronoUnit;

public class CalculationsWithDateTime {

	public static void main(String[] args) {
		
//		LocalDate d01 = LocalDate.parse("2023-10-31");
		LocalDate d04 = LocalDate.now();
		LocalDate d05 = LocalDate.parse("2024-10-30");
		
		LocalDateTime d02 = LocalDateTime.now();
		LocalDateTime d06 = LocalDateTime.parse("2024-01-28T16:08:00.000000000");
		
//		Instant d03 = Instant.now();
//
//		LocalDate nextWeekLocalDate = d01.plusDays(7);
//		LocalDate pastWeekLocalDate = d01.minusDays(7);
//		
//		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
//		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
//		
//		Instant nextWeekLocalInstant = d03.plus(7, ChronoUnit.DAYS);
//		Instant pastWeekLocalInstant = d03.minus(7, ChronoUnit.DAYS);
		
		//Local Date Time
		Duration t1 = Duration.between(d02, d06);
		
		//Local Date (converte para LocalDateTime)
		Duration t2 = Duration.between(d04.atStartOfDay(), d05.atStartOfDay());
		
//		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
//		System.out.println();
//		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
//		System.out.println();
//		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
//		System.out.println();
//		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
//		System.out.println();
//		System.out.println("nextWeekLocalInstant: " + nextWeekLocalInstant);
//		System.out.println();
//		System.out.println("pastWeekLocalInstant" + pastWeekLocalInstant);
//		System.out.println();
//		System.out.println(d02);
		System.out.println("Faltam " + t1.toDays() + " dias, \n" + t1.toHours() + " horas, \n" + t1.toMinutes() + " minutos e \n" + t1.toSeconds() + " segundos para seu aniversário");
		System.out.println();
		System.out.println("Faltam " + t2.toDays() + " dias");
	}

}
