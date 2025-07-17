package Encapsulamento;

public class Livro {
	private String titulo;
	private String autor;
	private int faixaEtariaMinima;

public Livro(String titulo, String autor, int faixaEtariaMinima) {
	this.titulo=titulo;
	this.autor=autor;
	this.faixaEtariaMinima=faixaEtariaMinima;
}
public boolean podeSerLidoPor(int idadeLeitor) {
	return idadeLeitor >= faixaEtariaMinima;
}
public void mostrarInformacoes(int idadeLeitor) {
	System.out.println("Título: " + titulo);
	System.out.println("Autor: " + autor);
	System.out.println("Faixa etária mínima: " + faixaEtariaMinima);
	System.out.println("Idade do leitor: " + idadeLeitor);
	System.out.println("pode ser lido: "+ (podeSerLidoPor(idadeLeitor ) ? "sim" : "não"));
	System.out.println("----------------------------");
}}