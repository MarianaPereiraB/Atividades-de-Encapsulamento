package Encapsulamento;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto = new Produto();

		        
		        produto.setNome("Mouse Gamer");
		        produto.setPreco(150.00);
		        produto.setQuantidadeEstoque( 10);

		      
		        produto.exibirInformacoes();
		        produto.adicionarEstoque(5);
		        produto.removerEstoque(8);
		        produto.removerEstoque(10);
		        produto.exibirInformacoes();
		    }
		}
		      
