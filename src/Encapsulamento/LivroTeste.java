package Encapsulamento;

public class LivroTeste {

	public static void main(String[] args) {
		 Livro livro1 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 6);
	     Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 10);
	     Livro livro3 = new Livro("1984", "George Orwell", 16);

	     int[] idades = {5, 10, 15, 20};

	     for (int idade : idades) {
	            System.out.println("🧒 Testando com idade: " + idade);
	            livro1.mostrarInformacoes(idade);
	            livro2.mostrarInformacoes(idade);
	            livro3.mostrarInformacoes(idade);
	        }

	     }

}
