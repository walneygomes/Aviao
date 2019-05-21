package Observers;

import java.util.ArrayList;
import java.util.List;

public class TotensEmbarque  implements Totens{

	List<String> horarios= new ArrayList<String>();
	List<String> desenbarque= new ArrayList<String>();

	public void notificao(String empresa, int numero, String partida, String chegada, String horario) {
		horarios.add(horario);
		desenbarque.add(chegada);

	}

	public void notificao() {
		System.out.println("TotensEmbarque");

		System.out.println(" Embarque ");
		for (String h :horarios) {
			
			System.out.println(h);
			
			
		}
		

	}

}
