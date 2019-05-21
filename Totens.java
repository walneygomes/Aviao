package Observers;

import java.util.ArrayList;
import java.util.List;

import Subject.VooAviao;

public interface Totens {
	public void notificao(String empresa, int numero, String partida, String chegada, String horario);

	public void notificao();
	

}
