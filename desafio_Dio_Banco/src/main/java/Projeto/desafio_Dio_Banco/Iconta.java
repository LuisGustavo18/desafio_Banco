package Projeto.desafio_Dio_Banco;

public interface Iconta {

	
	 void sacar(Double valor);

	 void depositar(Double valor);

	 void trasnferir(Double valor, Conta contaDestino);
	 
	 void imprimirExtrato();
	
}	
