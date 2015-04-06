package brunobs.com.br.ed.test;

import brunobs.com.br.ed.Aluno;
import brunobs.com.br.ed.Vetor;

public class VetorTest {
	public static void main(String[] args) {
		Aluno a1  = new Aluno("João");
		Aluno a2 = new Aluno("José");
		Vetor vetor = new Vetor();
		vetor.adiciona(a1);
		vetor.adiciona(a2);
		System.out.println(vetor.toString());
		System.out.println(vetor.tamanho());
	}

}
