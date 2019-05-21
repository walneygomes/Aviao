package Subject;

import java.util.ArrayList;
import java.util.List;

import Observers.Totens;

public interface VooAviao {
	public void notificaAviao();

	public void addTotens(Totens subjec);

	public void notificaAviao(String empresa, int numerodovoo, String horario, String chegada);

}
