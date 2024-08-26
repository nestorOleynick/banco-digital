package bancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente nestor = new Cliente();
		nestor.setNome("Nestor");
		
		Conta cc = new ContaCorrente(nestor);
		Conta poupanca = new ContaPoupanca(nestor);
		
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas");
		
		Conta cclucas = new ContaCorrente(lucas);
		Conta cplucas = new ContaPoupanca(lucas);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cclucas.imprimirExtrato();
		cplucas.imprimirExtrato();
		
		
		
	}

}
