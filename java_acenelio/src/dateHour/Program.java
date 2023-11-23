package dateHour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		// Data e hora customizado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// Apenas YYYY-MM-DD
		LocalDate d01 = LocalDate.now();
		System.out.println("Data: " + d01);

		// Apenas data e hora
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Data e hora: " + d02);

		// Data e hora GMT (Global/Londres)
		Instant d03 = Instant.now();
		System.out.println("Data e hora global/Londres: " + d03);

		// Data texto em formato ISO 8601
		LocalDate d04 = LocalDate.parse("2023-11-09");
		System.out.println("Data texto: " + d04);

		// Data e hora em texto formato ISO 8601
		LocalDateTime d05 = LocalDateTime.parse("2023-11-09T10:55:59");
		System.out.println("Data e hora em texto: " + d05);

		// Data e hora em texto GMT (Global/Londres)
		Instant d06 = Instant.parse("2023-11-09T10:55:59Z");
		System.out.println("Data e hora em texto: " + d06);

		// Data e hora em texto com add 3h de fuso horário
		Instant d07 = Instant.parse("2023-11-09T12:01:00-03:00");
		System.out.println("Data e hora em texto: (com fuso horário/Londres)" + d07);

		// Data formatado
		LocalDate d08 = LocalDate.parse("09/11/2023", fmt1);
		System.out.println("Data formatado: " + d08);

		// Data e hora formatado
		LocalDateTime d09 = LocalDateTime.parse("09/11/2023 12:22", fmt2);
		System.out.println("Data e hora formatado: " + d09);

		// Data separadamente
		LocalDate d10 = LocalDate.of(2023, 11, 9);
		System.out.println("Data separadamente: " + d10);

		// Data e hora separadamente
		LocalDateTime d11 = LocalDateTime.of(2023, 11, 9, 12, 30);
		System.out.println("Data e hora separadamente: " + d11);
	}

}
