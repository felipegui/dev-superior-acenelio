package date_hour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalToLocalDateAndTime {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		//Local (apenas data)
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		//Fuso horário de portugal (apenas data)
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println("Apenas o dia: " + d01.getDayOfMonth());
		System.out.println("Apenas o mês: " + d01.getMonthValue());
		System.out.println("Apenas o ano: " + d01.getYear());
		
		System.out.println("Hora: " + d02.getHour());
		System.out.println("Minutos: " + d02.getMinute());
	}

}
