package Encapsulamento;

public class ContaBancaria {
	private String numeroConta;
	private double saldo;
	
	public String getNumConta() {
		return numeroConta;
	}
	public void setNumConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void depositar(double valor) {
		if (valor > 0) {
		saldo += valor;
		System.out.println("Depósito de r$" + valor + "realizado com sucesso.");
		} else {
			System.out.println("Valor do depósito inválido");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso." );
		} else { System.out.println("Saque inválido. Saldo insulficiente ou valor inválido.");
		}
	}}



