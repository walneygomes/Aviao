package Subject;

import java.util.ArrayList;
import java.util.List;

import Observers.Totens;

public class VooGol implements VooAviao {
	List<Totens> subject = new ArrayList<Totens>();
	private String empresa;
	private int numeroVoo;
	private String partida;
	private String chegada;
	private String horario;

	public void addTotens(Totens subjec) {
		subject.add(subjec);
	}

	public void notificaAviao() {
		for (Totens t : subject) {
			t.notificao(getEmpresa(), this.getNumeroVoo(), this.getHorario(), this.getChegada(), this.getPartida());
		}

	}

	public void notificaAviao(String empresa, int numerodovoo, String horario, String chegada) {
		this.setChegada(chegada);
		this.setEmpresa(empresa);
		this.setHorario(horario);
		this.setNumeroVoo(numerodovoo);
		this.setPartida(chegada);
		notificaAviao();

	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getChegada() {
		return chegada;
	}

	public void setChegada(String chegada) {
		this.chegada = chegada;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}
