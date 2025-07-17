package Encapsulamento;

public class alunoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Lucas");
		aluno1.setNota1(8.5);
		aluno1.setNota2(7.0);
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Nicolas");
		aluno2.setNota1(8.5);
		aluno2.setNota2(9.0);
		
		aluno1.exibirResultado();
		aluno2.exibirResultado();
	

}}
