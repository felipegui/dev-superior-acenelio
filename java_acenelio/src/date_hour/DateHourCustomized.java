package date_hour;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateHourCustomized {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDate d02 = LocalDate.now();
		LocalDateTime d03 = LocalDateTime.now();
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data Customizada em Texto: " + d01.format(fmt1));
		System.out.println("Data atual Customizada: " + d02.format(fmt1));
		System.out.println("Data e hora atual Customizada: " + d03.format(fmt2));

	}

}
