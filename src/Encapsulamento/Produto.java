package Encapsulamento;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;

		

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public void adicionarEstoque(int qtd) {
		if (qtd > 0) {
			System.out.println("Unidades adicionadas ao estoque!");
		} else {
			System.out.println("Quantidade inválida para adicionar");}
		}
	public void removerEstoque(int qtd) {
		if (qtd > 0 && qtd <= quantidadeEstoque) {
			 quantidadeEstoque -= qtd;
			 System.out.println(qtd + "Unidades removidas do estoque.");
			 
		
		} else {
			System.out.println("Não é possível remover esa quantidade. Verifique o estoque novamente.");
			
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("Produto: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Estoque: " + quantidadeEstoque + "unidades");
	}}
