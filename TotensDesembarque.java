package Observers;

import java.util.ArrayList;
import java.util.List;

public class TotensDesembarque implements Totens {

	List<String> horarios= new ArrayList<String>();
	List<String> empres= new ArrayList<String>();

	public void notificao(String empresa, int numero, String partida, String chegada, String horario) {
		horarios.add(horario);

	}

	public void notificao() {
		System.out.println("TotensDesembarque");

		System.out.println("Horarios de voos : ");
		for (String h :horarios) {
			System.out.println(h);
			
			
		}

	}

}
