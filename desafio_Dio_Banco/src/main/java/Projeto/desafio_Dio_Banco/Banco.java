package Projeto.desafio_Dio_Banco;

import java.util.List;

public class Banco extends Cliente{
	
	private String nome;
	protected List<Conta> contas;


	
	public void add(Conta lista) {
		super.nome = lista.cliente.nome;
		super.CPF = lista.cliente.CPF;
		super.dataNascimento = lista.cliente.dataNascimento;
		
		imprimirTudao();
	}
	
	void imprimirTudao() {
		System.out.println(" ");
		System.out.println("O nome do Cliente é: " + super.nome);
		System.out.println("O CPF do " + super.nome + " é :"  + super.CPF);
		System.out.println("A data de Nascimento do " + super.nome + "é :"  + super.dataNascimento);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	

	
}


