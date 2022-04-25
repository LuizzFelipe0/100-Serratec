package Datas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExemploLocalDate {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		LocalDateTime agora = LocalDateTime.now();

		System.out.println("Data de hoje =" + hoje);
		System.out.println("Momento atual =" + agora);

		/*
		 * System.out.println("Insira uma data: "); String dataComoString =
		 * sc.nextLine();
		 * 
		 * LocalDate dataInserida = LocalDate.parse(dataComoString);
		 * 
		 * System.out.println("Mês inserido: "+dataInserida.getMonth());
		 */

		DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoBrTempo = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		System.out.println("Data de hoje formatada TOP = " + formatoBr.format(hoje));
		System.out.println("Momento atual fromatado TOP = " + formatoBrTempo.format(agora));

		LocalDate mesQueVem = hoje.plusMonths(1).minusWeeks(1).plus(3, ChronoUnit.MILLENNIA);
		System.out.println("Mes que vem = " + formatoBr.format(mesQueVem));

		System.out.println("Ano Bissexto: " + hoje.minusYears(2).isLeapYear());

		LocalDate diaNascimento = LocalDate.of(2004, 5, 12);
		System.out.println("Dia Nascimento: " + formatoBr.format(diaNascimento));
		
		if(diaNascimento.isAfter(hoje)) {
			System.out.println("Caramba, você prevê o futuro");
			
		}else {
			System.out.println("Beleza, faz sentido!");

		}
		ZoneId zonaAtual = ZoneId.systemDefault();
		
		System.out.println("\nZona do Pc rodando o projeto: "+zonaAtual);
		
		Period quantoTempoEstouVivo = Period.between(diaNascimento, hoje);
		System.out.println("\nPeríodo Vivo: "+quantoTempoEstouVivo.getYears());
		
		LocalDateTime diaNascimentoComHora = LocalDateTime.of(2004, 6,18,13,40,30);
		Duration quantoTempoEstouVivocomTempo = Duration.between(diaNascimentoComHora, agora);
		System.out.println("\nPeríodo Vivo: "+quantoTempoEstouVivocomTempo.getSeconds());

		
	}

}
