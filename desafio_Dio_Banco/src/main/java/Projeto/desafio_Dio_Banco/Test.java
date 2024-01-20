package Projeto.desafio_Dio_Banco;


public class Test {

	public static void main(String[] args) {
		
		
		Banco bc = new Banco();
		Cliente luis = new Cliente();
		Conta cc = new ContaCorrente(luis); 
		Conta pp = new ContaPoupanca(luis);
		
		
		luis.setNome("Gustavo");
		luis.setCPF("542.42084.8428");
		luis.setDataNascimento("05/08/1889");
		
		
		cc.depositar(100.0);
		cc.trasnferir(100.0, pp);
		
		cc.imprimirExtrato();
		pp.imprimirExtrato();
		
		
		bc.add(cc);
		
}
}
