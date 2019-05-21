package Observers;

import java.util.ArrayList;
import java.util.List;

public class TotensTerceiro  implements Totens {

	List<String> horarios= new ArrayList<String>();
	List<String> desenbarque= new ArrayList<String>();

	public void notificao(String empresa, int numero, String partida, String chegada, String horario) {
		horarios.add(horario);
		desenbarque.add(chegada);

	}

	public void notificao() {
		System.out.println(" TotensTerceiro ");

		System.out.println("Embarque");
		for (String h :horarios) {
			
			System.out.print(h);
			
			
		}
		System.out.println("desenbarque");

		for(String i: desenbarque) {
			System.out.println(i);
		}

	}

}
