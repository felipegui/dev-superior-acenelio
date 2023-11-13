package date_hour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHourInText {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2022-07-20");

		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");

		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		// Pega o fuso horário do computador do usuário
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		// Formato tirado da documentação
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		// System.out.println("Data formatada 1: " + d01.format(fmt1));

		// System.out.println("Data formatada 2: " + fmt1.format(d01));

		// System.out.println("Data formatada 3: " + d01.format(fmt1));

		// Esse formato o coletor de lixo exclui logo depois de ter usado
		System.out.println("LocalDate: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("LocalDateTime: " + d02.format(fmt2));

		System.out.println("Instant: " + fmt3.format(d03));

		System.out.println("Iso Date Time (hora local): " + fmt4.format(d02));

		System.out.println("Iso Instant: " + fmt5.format(d03));

	}

}
