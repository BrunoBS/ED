package brunobs.com.br.ed;
public class Aluno {

	private String nome;



	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		if (outro == null) {
			return false;
		}
		return outro.getNome().equals(this.nome);
	}

	public String toString() {
		return nome;
	}
}
