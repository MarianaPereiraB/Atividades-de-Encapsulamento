package Encapsulamento;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.setNumConta("1208frvr");
		
		conta.depositar(115000.00);
		conta.sacar(3000.00);
		conta.sacar(140000.00);
		System.out.println("saldo final: R$" + conta.getSaldo());
	}

}
