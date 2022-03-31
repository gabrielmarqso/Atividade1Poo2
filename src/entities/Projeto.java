package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {
	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	public List<Contratacao> Contratos = new ArrayList<>();

	
	public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_Termino;
	}
	
	public boolean adicionarContratacao(Contratacao contratacao) {
		if(contratacao != null && !Contratos.contains(contratacao)) {
			this.Contratos.add(contratacao);
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean removerContratacao(Contratacao contratacao) {
		if(contratacao != null && Contratos.contains(contratacao)) {
			this.Contratos.remove(contratacao);
			return true;
		}else {
			return false;
		}
	}
	
	public void listarContratacao() {
		for(Contratacao c: this.Contratos) {
			System.out.println("\t" + c.getFuncionario().getNome() + "[Status: " + c.getStatus() + "]");
		}
	}

	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dt_Inicio=" + dt_Inicio + ", dt_Termino=" + dt_Termino + ", Contratos="
				+ Contratos + "]";
	}
	
	
	
	
}
