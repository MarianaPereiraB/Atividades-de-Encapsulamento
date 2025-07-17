package Encapsulamento;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	

public void setNome(String nome) {
	this.nome = nome;
}
public void setNota1(double nota1) {
	this.nota1 = nota1;
}
public void setNota2(double nota2) {
	this.nota2 = nota2;
}
public double getMedia() {
	return (nota1+nota2)/2;
}
public boolean isAprovado() {
	return getMedia()>= 6.0;
}
public void exibirResultado() {
	System.out.println("Nome: " +nome);
	System.out.println("Média: " +getMedia());
	System.out.println("Aprovado: " + (isAprovado() ? "sim" : "não"));
	System.out.println("-----------------------");
}


}