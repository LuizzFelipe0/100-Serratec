package Datas;

import java.util.Calendar;

public class ExemploCalendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Data de hoje:"+dia + "/"+mes+"/"+ano);

		

		
	}

}
