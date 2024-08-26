package bancoDigital;

import java.util.List;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0001;


	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	private Cliente cliente;
	
	
	
 	
	public Conta(Cliente cliente) {
			this.agencia = Conta.AGENCIA_PADRAO;
			this.numeroConta = SEQUENCIAL++;
			this.cliente = cliente;
		}
	
	
	
	
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero da conta: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public void sacar(double valor) {
		if(this.saldo > 0) {
		this.saldo -= valor;
		} else {
			System.out.println("Voce nao tem saldo suficiente");
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	


	
}
