package entities;

import java.util.Date;

import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {
	private Date datal;
	private Cargo cargo; 
	private Funcionario funcionario;
	private Projeto projeto;
	private Status status;
	
	public void pendente() {
		this.status = Status.PENDENTE;
		
	}
	public void contratar() {
		if(this.status == Status.PENDENTE){
			this.status = Status.CONTRATADO;
			this.projeto.adicionarContratacao(this);
		}
		
		
	}
	public void demitir() {
		if(this.status == Status.CONTRATADO) {
			this.status = Status.CONTRATADO;
			this.projeto.removerContratacao(this);
		}
	}
	
	public Contratacao(Date datal, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.datal = datal;
		this.cargo = cargo;
		this.status = Status.PENDENTE;
		this.funcionario = funcionario;
		this.projeto = projeto;
		
	}
	
	
	
	public Date getDatal() {
		return datal;
	}
	public void setDatal(Date datal) {
		this.datal = datal;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Contratacao [datal=" + datal + ", cargo=" + cargo + ", funcionario=" + funcionario + ", projeto="
				+ projeto + ", status=" + status + "]";
	}

	
	
	
	
}
