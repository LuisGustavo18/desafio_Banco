package Projeto.desafio_Dio_Banco;


public abstract class Conta implements Iconta{
	
	private static int SEQUENCIAL = 1;
	private static final int AGENCIA_PADRAO = 0;

	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;	
		this.cliente = cliente;
		}
	
	@Override
	public void sacar(Double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(Double valor) {
		saldo += valor;
		
	}

	@Override
	public void trasnferir(Double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	

	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: ", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
